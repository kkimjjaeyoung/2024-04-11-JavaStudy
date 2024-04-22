/*
 * 파일 출력, 데이터베이스, 네트워크 서버에 주로 사용
 * 				웹			애플리케이션
 * 
 */
import java.util.*;
import java.io.*;

public class 자바제어문_반복문7 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C:\\javaDev\\movie.txt");
		int i=0;			//한글읽기->정수값일기
		while ((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
	}

}
