package com.sist.dao;

import java.util.*;
import java.sql.*;

public class MemberDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	private static MemberDAO dao;
	
	//드라이버 등록
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}
	}
	//오라클 연결
	public void getconnection() {
		try {
			conn=DriverManager.getConnection(URL, "hr", "happy");
		}catch(Exception ex) { }
	}
	//오라클 해제
	public void disconnection() {
		try {
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	public static MemberDAO newInstance() {
		if(dao==null)
			dao=new MemberDAO();
		return dao;
	}
	//모든 DAO에 공통사항
	//기능 : 로그인처리, 회원가입, 회원수정, 회원탈퇴,
	public String memberLogin(int empno, String ename) {
		String result="";
		try {
			getconnection();
			String sql="SELECT COUNT(*) FROM emp" + "WHERE empno="+ empno;
			ps=conn.prepareStatement(sql);
			ResultSet re=ps.executeQuery();
			re.next();
			int count=re.getInt(1);
			re.close();
			int count=re.
		}
	}
}
