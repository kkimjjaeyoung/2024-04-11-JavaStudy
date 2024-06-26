package com.sist.main;
import java.sql.*;
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement ps=null;
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url, "hr", "happy");
			conn.setAutoCommit(false);		//SQL
			String sql="INSERT INTO card VALUES(3, 'park', 20000)";
			ps=conn.prepareStatement(sql);
			ps=conn.prepareStatement(sql);
			ps.executeUpdate();
			
			sql="INSERT INTO card VALUES(3, 4 200)";
			ps=conn.prepareStatement(sql);
			ps.executeUpdate();
			
			conn.commit();
		}catch(Exception e) {
			
		}finally {
			try {
				if(ps!=null) ps.close();
				if(conn!=null) conn.close();
			}catch(Exception ex) {}
		}
	}

}
