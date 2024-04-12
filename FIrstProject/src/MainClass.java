/*
 	여러 줄 주석
 	프로그램 : 컴퓨터에 명령을 수행하게 만든다
 		데이터 저장->데이터 가공(유저요청)->가공데이터 출력
 									윈도우(명령프롬프트)=>Application, || 브라우저=>web application, 핸드폰=>mobile application 등
 										솔루션 SI/SM 등							
 			한개 : 변수, 여러개 : 배열,클래스. 단점 (RAM 저장으로 프로그램 종료 시 자동삭제). 영구적 저장장치 [1. 파일, 2. RDBMS(오라클), 3.
 			=>변환 : 	연산자, 제어문 
 					반복(묶어서 사용)=>메소드
 */
import java.io.*;
public class MainClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub 한줄주석
		FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
		int i=0;
		StringBuffer data=new StringBuffer();
		while((i=fr.read())!=-1)		//파일 끝일때 종료
		{
			data.append((char)i);
		}
		fr.close();
		System.out.println(data);
		
	}

}
