/*
 * 2페이지
 * 1. 프로그램 언어 실행 방식
 * 		컴파일 방식(컴퓨터가 인식하는 언어로 변경. C/C==, Java[One Write] 등 )
 * 개발환경 구축
 * 	1.JDK(17.0.2):높은 버전에서 실행(낮은 버전은 실행이 안된다
 * 		실무는 JDK1.8이 호환성이 좋다
 * 		Spring-Boot 17이상
 * 		SpringFramework 14이하
 * 		오픈소스를 이용->호환성->단점
 * 	2. 환경설정
 * 		classpath : 라이브러리 읽기 .;c\jdk-17.0.2\lib
 * 		path : 실행파일 등록 c:\jdk-17.0.2\bin
 *  3. 11페이지 -> 편집기
 *  		eclipse ->eclipse.org 최신(백엔드)
 *  		인텔리J->풀스택(최근에 트라얼로 변경)
 *  	=프로젝트 폴더 만들기
 *  	=src에 자바 클래스 생성
 *  		주의점) 1.파일명과 클래스명이 동일
 *  				2. 대소문자 구분
 *  				3.명령문(CPU) 끝나면 반드시 ;
 *  				4. 클래스 영문외에 한글사용 가능 (리눅스등 다른 운영체제에선 한글인식이 안될수 있다)
 *  		문법은 아닌 약속사항
 *  			1) 클래스명은 대문자로 시작 (MainClass)
 *  			2) 변수 : 소문자 시작 (id, password)
 *  			3) 상수 : 모든 단어를 대문자로 (ID, PASSWORD)
 *  			4) 메소드 : 소문자 시작
 *  
 *  	모든 자바파일 실행 시 반드시 main() 필요 [실행 시작, 종료점]
 *  	주석 : ctrl+shift+/ , ctrl+shift+\
 *  	자바의 구성요소
 *  		class, className{									클래스 시작
 *  		public static void main(String[] arg)				프로그램 시작점
 *  		{	
 *  
 *  		}
 *  	}
 			class( 변수, 생성자, 메소드)
 
 */

package newproject;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println(Integer.toBinaryString(65));
		System.out.println((Int)'홍');
		System.out.println(Integer.toBinaryString(0));
	}

}
