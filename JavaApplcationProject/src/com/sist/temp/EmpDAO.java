package com.sist.temp;

import java.util.*;
import java.sql.*;

public class EmpDAO {
	//오라클 연결
	private Connection conn;
	//오라클에 sql문장 전송
	private PreparedStatement ps;
	/*
	 * 사용자요청->자바->오라클->SQL문장 실행->결과값 저장->데이터 출력		//VO, DAO 변경이 없다
	 */
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";			//~~:포트번호:DB명
	private static EmpDAO dao;
	/*
	 * thin 드라이브 : 연결만 해주는 역할->무료
	 * oci : oracle client->유료
	 * 
	 */
	// 1. 드라이버 등록(한번만 등록)
	public EmpDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracelDriver");
		}catch(Exception ex) {}
	}
	// 2. 싱글턴 패턴
	public static EmpDAO newIntstance() {
		if(dao==null)
			dao=new EmpDAO();		//생성이 안된경우
		return dao;			//이미 생성된 dao를 사용한다
	}
	// 3. 오라클 연결
	public void getConnection() {
		try {
			conn=DriverManager.getConnection(URL, "hr", "happy");
		}catch(Exception ex) {}
	}
	
	// 4. 오라클 닫기
	public void disConnection() {
		try {
			if(ps!=null) ps.close();			//송수신 닫고
			if(conn!=null) conn.close();		//exit
		} catch (Exception ex) {
			// TODO: handle exception
		}
	}
	// 5. 오라클에 요청
	public ArrayList<EmpVO> empListData(){
		ArrayList<EmpVO> list=new ArrayList<EmpVO>();
		try {
			//1. 연결
			getConnection();
			//2. SQL 문장 만들기
			String sql="SELECT empno,ename,job,sal,deptno FROM emp";		//""내 ; 제거(자동추가)
			//3. 오라클로 전송
			ps=conn.prepareStatement(sql);
			//4. 오라클에서 실행된 결과 가져오기(list에 첨부)
			ResultSet re=ps.executeQuery();			//ps의 enter한 값->re에 데이터 넣기
/*
			 re->
	//1. int 2. string		 
			 
	 EMPNO ENAME                JOB                       SAL     DEPTNO
---------- -------------------- ------------------ ---------- ----------
      7839 KING                 PRESIDENT                5000         10		:	cursor : next()
      7698 BLAKE                MANAGER                  2850         30
      7782 CLARK                MANAGER                  2450         10
      7566 JONES                MANAGER                  2975         20
      7654 MARTIN               SALESMAN                 1250         30
      7499 ALLEN                SALESMAN                 1600         30
      7844 TURNER               SALESMAN                 1500         30
      7900 JAMES                CLERK                     950         30
      7521 WARD                 SALESMAN                 1250         30
      7902 FORD                 ANALYST                  3000         20
      7369 SMITH                CLERK                     800         20
      7788 SCOTT                ANALYST                  3000         20
      7876 ADAMS                CLERK                    1100         20
      7934 MILLER               CLERK                    1300         10		:	cursor : previous() -> 역순
*/
			while(re.next()) {
					//double : re.getDouble(번호)
					//date : re.getDate(번호)
				EmpVO vo=new EmpVO();
				vo.setEmpno(re.getInt(1));
				vo.setEname(re.getString(2));
				vo.setJob(re.getString(3));
				vo.setSal(re.getInt(4));
				vo.setDeptno(re.getInt(5));
				list.add(vo);
			}
			re.close();			//메모리 해제
		}catch(Exception ex)
		{
			ex.printStackTrace();			//에러확인
		}
		finally {
			disConnection();			//오라클 닫기
		}
		return list;
	}
	public EmpVO empDetailData(int empno) {
		EmpVO vo=new EmpVO();		//사원 한명에 대한 정보
		
		try {
			//1 오라클 연결
			getConnection(); 	//반복제거
			/*
			 * 메소드 : 전송
			 * 		브라우저/윈도우에서는 사용 불가
			 * 	리턴형/매개변수
			 * 		1. 목록 : ArrayList
			 * 		2. 맛집 한개 정보 : FoodVO
			 * 		3. 검색 : ArrayList
			 */
			//2. SQL 문장
			String sql="SELECT empno,ename,job,sal,deptno FROM emp WHERE empno="+empno;			//사원번호 입력시 해당사원 정보 출력
			//3. 오라클 전송
			ps=conn.prepareStatement(sql);
			//4. 실행 결과
			ResultSet re=ps.executeQuery();
			//5. EmpVO : 값을 채운다
			re.next();
			vo.setEmpno(re.getInt(1));
			vo.setEname(re.getString(2));
			vo.setJob(re.getString(3));
			vo.setSal(re.getInt(4));
			vo.setDeptno(re.getInt(5));
			re.close();
		}catch (Exception ex) {
			ex.printStackTrace();			
		}
		finally {
			disConnection();
		}
		return vo;
	}
	public ArrayList<EmpVO> empFind(String ename){
		ArrayList<EmpVO> list=new ArrayList<EmpVO>();
		try {
			getConnection();
			String sql="Select empno,ename,job,sal,deptno FROM emp WHERE ename LIKE '%"+ename.toUpperCase()+"%'";		//데이터는 대소문자를 구분하므로 uppercase로 자동으로 ename 대문자로 변환.
			ps=conn.prepareStatement(sql);
			ResultSet re=ps.executeQuery();
			while(re.next()) {
				//double : re.getDouble(번호)
				//date : re.getDate(번호)
			EmpVO vo=new EmpVO();
			vo.setEmpno(re.getInt(1));
			vo.setEname(re.getString(2));
			vo.setJob(re.getString(3));
			vo.setSal(re.getInt(4));
			vo.setDeptno(re.getInt(5));
			list.add(vo);
		}
			re.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			disConnection();
		}
		return list;
	}
}
