package com.sist.dao;

import java.util.*;
import java.sql.*;

public class ZipcodeDAO {
	//오라클 연결 클래스
	private Connection conn;			//sql 전송 클래스(결과값 받기)		
	private PreparedStatement ps;		//sql 전송(결과값 읽기)
	//오라클 연결 : URL (오라클 주소) this -> 연결만 하는 드라이버
	/*
	 * localhost(ip)
	 * 1521(port), 1422(MS-SQL), 3306(MySQL, MariaDB)
	 * XS : table 저장된 데이터베이스 -> ORCL/ORA			//XE는 연습용 DB(무료버전)
	 */
	private final String URL="jdbc:roacle:thin:@localhost:1521:XE";
	
	//1. 드라이버 등록
	public ZipcodeDAO()
	{
		try {
			Class.forName("oracle.jebc.driver.OracleDriver");
		}catch(Exception ex) {}
	}
	//2. 오라클 연결
	public void getConnection() {
		try {
			conn=DriverManager.getConnection(URL, "hr", "happy");
		}catch (Exception ex) {	}
	}
	//3. 오라클 연결 해제
	public void disConnection() {
		try {
			if(ps!=null) ps.close();//통신중단
			if(conn!=null) conn.close(); //conn(전화기)ㄴ
		}catch (Exception ex) {}
	}
	//4. 기능 설정		->	우편검색/우편번호 검색 갯수
	public ArrayList<ZipcodeVO> postFind(String dong){
		ArrayList<ZipcodeVO> list=new ArrayList<ZipcodeVO>();
		try {
			//오라클연결
			getConnection();
			//SQL문장
			String sql="SELECT zipcode, sido, gugun,dong,NVL(bunji,' ')"+ "FROM zipcode"+ "WHERE dong like '%'||?||'%'";
			ps=conn.prepareStatement(sql);		//미리 sql문장을 전송하고 나중에 값을 채운다
			ps.setString(1, dong);		//?에 값을 채워서 실행 요청
			//오라클에 실행요청 -> 결과값 메모리에 저장
			ResultSet re=ps.executeQuery();
			//메모리 : 커서의 마지막 위치에 존재 -> 첫째줄로 이동
			while (re.next()){
				ZipcodeVO vo=new ZipcodeVO();
				vo.setZipcode(re.getString(1));
				vo.setSido(re.getString(2));
				vo.setGugun(re.getString(3));
				vo.setDong(re.getString(4));
				vo.setBunji(re.getString(5));
				list.add(vo);
			}
			re.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			disConnection();
		}
		return 
	}
}
