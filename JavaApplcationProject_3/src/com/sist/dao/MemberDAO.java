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
		
	}
	//오라클 연결
	public void getconnection() {
		
	}
	//오라클 해제
	public void disconnection() {
		
	}
	//모든 DAO에 공통사항
	//기능 : 로그인처리, 회원가입, 회원수정, 회원탈퇴, 
}
