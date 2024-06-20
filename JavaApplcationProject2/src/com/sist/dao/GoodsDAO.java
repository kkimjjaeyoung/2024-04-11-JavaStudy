package com.sist.dao;
import java.util.*;
import java.sql.*;

public class GoodsDAO {
	 // 오라클 연결 
     private Connection conn;
     // SQL문장 송수신 
     private PreparedStatement ps;
     // 오라클 주소 저장 => 변경 (X) => 상수 
     private final String URL="jdbc:oracle:thin:@192.168.10.124:1521:XE";
     
     // 싱글턴 => 메모리 누수 현상 방지 => 객체를 한번만 생성 => DAO 
     private static GoodsDAO dao;
     // 1. 드라이버 등록 : 한번만 수행 (생성자) => 멤버변수의 초기화 
     public GoodsDAO()
     {
    	 try
    	 {
    		 Class.forName("oracle.jdbc.driver.OracleDriver");
    	 }catch(Exception ex) {}
     }
     // 2. 오라클 연결 => SQL문장 => 재사용 
     public void getConnection()
     {
    	 try
    	 {
    		 conn=DriverManager.getConnection(URL,"hr3","happy"); 
    	 }catch(Exception ex) {}
     }
     // 3. 오라클 해제
     public void disConnection()
     {
    	 try
    	 {
    		 if(ps!=null) ps.close();
    		 if(conn!=null) conn.close();
    	 }catch(Exception ex) {}
     }
     // 4. 싱글턴 => static은 메모리 공간 1개만 가지고 있다 
     public static GoodsDAO newInstance()
     {
    	 if(dao==null)
    		 dao=new GoodsDAO();
    	 return dao;
     }
     ////////////////////////////////////////// DAO의 필수 공통 코드 
     
     // 기능 
     // 총페이지 구하기 
     public int goodsTotalPage()
     {
    	 int total=0;
    	 try
    	 {
    		 // 1. 연결 
    		 getConnection();
    		 // 2. SQL문장 
    		 String sql="SELECT CEIL(COUNT(*)/16.0) FROM goods_all";
    		 // 3. 오라클로 전송 
    		 ps=conn.prepareStatement(sql);
    		 // 4. SQL문장 실행 결과를 가지고 온다 => 실행 결과를 저장 (ResultSet)
    		 ResultSet rs=ps.executeQuery();
    		 // 5. 커서위치를 데이터에 출력된 첫번째 위치로 이동 
    		 rs.next();
    		 total=rs.getInt(1);
    		 // 6. 메모리를 닫는다 
    		 rs.close();
    		 
    		 
    	 }catch(Exception ex)
    	 {
    		 // 에러 확인 => 복구(X)
    		 ex.printStackTrace();
    	 }
    	 finally
    	 {
    		 // 닫기 
    		 disConnection();
    	 }
    	 return total;
     }

     public ArrayList<GoodsVO> goodsListData(int page)
     {
    	 ArrayList<GoodsVO> list=new ArrayList<GoodsVO>();
    	 // VO는 상품 한개에 대한 모든 정보가 저장 
    	 try
    	 {
    		 getConnection();
    		 String sql="SELECT no,goods_name,goods_poster, goods_price, hit,num "
    				   +"FROM (SELECT no,goods_name,goods_poster, goods_price, hit ,rownum as num "
    				   +"FROM (SELECT no,goods_name,goods_poster, goods_price, hit FROM goods_all ORDER BY hit DESC)) "			//hit순 정렬
    				   +"WHERE num BETWEEN ? AND ?";
    		 // 오라클 페이지 나누기 => 인라인뷰 => 가상 컬럼 : rownum (자르기)
    		 // rownum은 Top-N => 처음부터 몇개 => 중간이 다르는 것은 불가능 
    		 // ?에 값을 채운다 
    		 int rowSize=16;
    		 int start=(rowSize*page)-(rowSize-1);
    		 //           12*1 - 11 -> 1 ==> 12*2 - 11 => 13
    		 int end=rowSize*page;// 12 ==> 24
    		 // 1번부터 (rownum=>1번) 
    		 ps=conn.prepareStatement(sql);
    		 ps.setInt(1, start);
    		 ps.setInt(2, end);
    		 // 실행 요청 
    		 ResultSet rs=ps.executeQuery();
    		 
    		 // 첫번째부터 읽기 
    		 while(rs.next())
    		 {
    			 GoodsVO vo=new GoodsVO();
    			 vo.setNo(rs.getInt(1));
    			 vo.setGoods_name(rs.getString(2));
    			 vo.setGoods_poster(rs.getString(3));
    			 vo.setGoods_price(rs.getString(4));
    			 vo.setHit(rs.getInt(5));
    			 list.add(vo);
    		 }
    		 
    		 rs.close();
    	 }catch(Exception ex)
    	 {
    		 ex.printStackTrace();
    	 }
    	 finally
    	 {
    		 disConnection();
    	 }
    	 return list;
     }
     // 상세보기 => 한개에 대한 정보 
     /*
      * NO                                                 NUMBER(38)
		 GOODS_NAME                                         VARCHAR2(4000)
		 GOODS_SUB                                          VARCHAR2(4000)
		 GOODS_PRICE                                        VARCHAR2(26)
		 GOODS_DISCOUNT                                     NUMBER(38)
		 GOODS_FIRST_PRICE                                  VARCHAR2(26)
		 GOODS_DELIVERY                                     VARCHAR2(26)
		 GOODS_POSTER 
      */
     public GoodsVO goodsDetailData(int no)
     {
    	 GoodsVO vo=new GoodsVO();
    	 try
    	 {
    		 getConnection();
    		 // 조회수 증가 
    		 String sql="UPDATE goods_all SET "
    				   +"hit=hit+1 "
    				   +"WHERE no=?";
    		 ps=conn.prepareStatement(sql);
    		 ps.setInt(1, no);
    		 ps.executeUpdate(); // commit()
    		 
    		 // 데이터 읽기
    		 sql="SELECT no,goods_name,goods_sub,goods_price,goods_discount,"
    		    +"goods_first_price,goods_delivery,goods_poster, hit "
    			+"FROM goods_all "
    		    +"WHERE no=?";
    		 
    		 ps=conn.prepareStatement(sql);
    		 // ?에 값을 채운다 
    		 ps.setInt(1, no);
    		 
    		 // 결과값 
    		 ResultSet rs=ps.executeQuery();
    		 rs.next();
    		 // 값을 VO에 저장 
    		 vo.setNo(rs.getInt(1));
    		 vo.setGoods_name(rs.getString(2));
    		 vo.setGoods_sub(rs.getString(3));
    		 vo.setGoods_price(rs.getString(4));
    		 vo.setGoods_discount(rs.getInt(5));
    		 vo.setGoods_first_price(rs.getString(6));
    		 vo.setGoods_delivery(rs.getString(7));
    		 vo.setGoods_poster(rs.getString(8));
    		 vo.setHit(rs.getInt(9));
    		 rs.close();
    		 
    		 
    	 }catch(Exception ex)
    	 {
    		 ex.printStackTrace();
    	 }
    	 finally
    	 {
    		 disConnection();
    	 }
    	 return vo;
     }
     // 검색 => LIKE 
     public ArrayList<GoodsVO> goodsFindData(String name)
     {
    	 ArrayList<GoodsVO> list=new ArrayList<GoodsVO>();
    	 try
    	 {
    		 getConnection();
    		 String sql="SELECT no,goods_name,goods_poster,goods_price "
    				   +"FROM goods_all "
    				   +"WHERE goods_name LIKE '%'||?||'%' "
    				   +"ORDER BY no ASC";
    		 ps=conn.prepareStatement(sql);
    		 ps.setString(1, name);
    		 
    		 ResultSet rs=ps.executeQuery();
    		 while(rs.next())
    		 {
    			 GoodsVO vo=new GoodsVO();
    			 vo.setNo(rs.getInt(1));
    			 vo.setGoods_name(rs.getString(2));
    			 vo.setGoods_poster(rs.getString(3));
    			 vo.setGoods_price(rs.getString(4));
    			 
    			 list.add(vo);
    		 }
    		 rs.close();
    	 }catch(Exception ex)
    	 {
    		 ex.printStackTrace();
    	 }
    	 finally
    	 {
    		 disConnection();
    	 }
    	 return list;
     }
     public ArrayList<GoodsVO> goodsFindData2(String name)
     {
    	 ArrayList<GoodsVO> list=new ArrayList<GoodsVO>();
    	 try
    	 {
    		 getConnection();
    		 String sql="SELECT no,goods_name,goods_poster,goods_price "
    				   +"FROM goods_all "
    				   +"WHERE no = ? "
    				   +"ORDER BY no ASC";
    		 ps=conn.prepareStatement(sql);
    		 ps.setString(1, name);
    		 
    		 ResultSet rs=ps.executeQuery();
    		 while(rs.next())
    		 {
    			 GoodsVO vo=new GoodsVO();
    			 vo.setNo(rs.getInt(1));
    			 vo.setGoods_name(rs.getString(2));
    			 vo.setGoods_poster(rs.getString(3));
    			 vo.setGoods_price(rs.getString(4));
    			 
    			 list.add(vo);
    		 }
    		 rs.close();
    	 }catch(Exception ex)
    	 {
    		 ex.printStackTrace();
    	 }
    	 finally
    	 {
    		 disConnection();
    	 }
    	 return list;
     }
     public ArrayList<GoodsVO> goodsFindData3(String name)
     {
    	 ArrayList<GoodsVO> list=new ArrayList<GoodsVO>();
    	 try
    	 {
    		 getConnection();
    		 String sql="SELECT no,goods_name,goods_poster,goods_price "
    				   +"FROM goods_all "
    				   +"WHERE goods_name LIKE '%'||?||'%' OR goods_sub LIKE '%'||?||'%' "
    				   +"ORDER BY no ASC";
    		 ps=conn.prepareStatement(sql);
    		 ps.setString(1, name);
    		 ps.setString(2, name);
    		 
    		 ResultSet rs=ps.executeQuery();
    		 while(rs.next())
    		 {
    			 GoodsVO vo=new GoodsVO();
    			 vo.setNo(rs.getInt(1));
    			 vo.setGoods_name(rs.getString(2));
    			 vo.setGoods_poster(rs.getString(3));
    			 vo.setGoods_price(rs.getString(4));
    			 
    			 list.add(vo);
    		 }
    		 rs.close();
    	 }catch(Exception ex)
    	 {
    		 ex.printStackTrace();
    	 }
    	 finally
    	 {
    		 disConnection();
    	 }
    	 return list;
     }
     // 구매 => INSERT , UPDATE , DELETE 
     
}








