/*
 * 오라클연결 : ojbbc8.jar 필요(데이터베이스연결시 해당 업체서 다운로드)
 * 연결 : CheckedException (반드시 예외처리후 사용) 
 */

package com.sist.sql;

import java.security.interfaces.RSAKey;
import java.sql.*;

public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 오라클 연결을 위한 드라이버 설치
		 * 2. 오라클 연결
		 * 3. SQL 문장 전송
		 * 4. 실행 결과값 받기
		 * 5. 브라우저 전송(도스에 출력)
		 */
		try {
			//1.
			Class.forName("oracle.jdbc.driver.OracleDriver");	//메모리 할당
			//2.
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			//3.
			Connection conn=DriverManager.getConnection(url, "hr", "happy");
			String sql="SELECT empno, ename, job, sal FROM emp";		//내부에 ;는 자동ㅍ=추가
			PreparedStatement ps=conn.prepareStatement(sql);
			//4.
			ResultSet re=ps.executeQuery();		//실행항 결과값 불러오기
			while(re.next()) {
				System.out.println(re.getInt(1)+" "+re.getString(2)+" "+re.getString(3)+" "+re.getInt(4));	//정수형, 문자열, 문자열, 정수형의 순서로 데이터 순차열
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
