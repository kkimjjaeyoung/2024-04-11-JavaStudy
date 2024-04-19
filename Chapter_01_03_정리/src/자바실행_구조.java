/*
 *  1. 자바언어는 클래스로 시작 클래스로 종료
 *  2. public static ~~~ main ->프로그램 시작점. main이 없는 경우 프로그램 실행 불가
 *  3. 구조 (본문참조) : 문법->예외처리까지
 *  
 *  기본적인 자바 용어
 *   1. 자바(java) : 원시소스(프로그래머만 알 수 있는 소스)를 컴퓨터언어로 변경-컴파일(0, 1)
 *   	A.jave -> A.class -> 번역된 소스를 한줄식
 *   	javac(기계어변경) -> java(자바실행환경) -> 인터프리터
 *  		컴파일방식 : java, c, c++, c#
 *  		인터프리터 방식 :  HTML, CSS, java
 *  			고급언어(sw) : 자바
 *  			저급언어(hw) : c, c++
 *   c, c++ -> 컴파일 -> .obj -> 구동 -> .exe		//자바는 exe를 만들지 못한다. (따라서 웹, 앱 등에서 사용)
 *   
 *   자바언어의 특징
 *   1. 객체 지향 프로그램(수정, 추가, 재사용, 데이터보호에 능해 유지보수가 쉽다). 다형성(***오버라이딩[modify], 오버로딩[new]), 캡술화(은닉화)
 *   2. 자바 가상머신(JVM) : 모든 운영체제에서 호환 가능
 *   	**차세대 운영체제(우분투, linux기반) : 사용자->JVM->운영체제->하드웨어		JVM(->운영체제 연결->API->Write ONE)->메모리 구조
 *   																	**메모리 구조[(Method 영역, static변수),(stack:메모리 자체 관리[지역변수, 매개변수]),(heap:맴버변수, 클래스, 배열)]
 *   
 *   1. 주석 : 프로그램과 상관 없이 코드를 설명에 붙여준다
 *   2. 변수 : 메모리에 저장(한 개의 데이터만 저장 가능)
 *   3. 메소드 : 사용자가 요청 시 처리하는 기능(기능 분리, 다른 클래스와 연결)
 *   4. 예약어 : 이미 자바에서 사용하는 단어
 *   5. 초기화 : 데이터 저장 시 부여하는 초기값
 *   6. 상수 : 고정된 변경불가능한 값
 *   
 *   
 *   1. 프로그램 : 데이터를 저장, 처리, 결과출력 (연산자/제어문으로 처리, 웹/도스창/윈도우/핸드폰에서 결과 출력)
 *   	1). 한개 (변경) : 변수
 *   	2). 한개 (변경없이) : 상수
 *   	3). 여러개 (배열, 클래스)						//프로그램 종료 시 삭제 (메모리)
 *   	4). 영구적 저장장치 (file, RDBMS(오라클))
 *   2. 변수/상수
 *   		변수: 한 개의 데이터를 저장하는 메모리 공간의 별칭(변경가능) [데이터형의 변수명;]
 *   		상수: 한 개의 데이터를 저장하는 메모리 공간의 별칭(변경불가) [final 데이터형의 변수명;]
 *   	변수명칭법
 *   		1). 알파벳이나 한글로 시작(대소문자 구분)
 *   		2). 숫자 사용 가능(앞에는 사용 불가)
 *   		3). 공백 사용 불가
 *   		4). 예약어(키워드) 사용 불가
 *   		5). 특수문자 사용( _, ㅜ)
 *   	메모리 공간의 크기 (데이터형/자료형/기본형)
 *   		정수 : byte(-128~127[1byte]), int(-21억4천~21억4천[4byte]*default), long([8byte])
 *   		실수 : double(소수점 15개 이상[8byte] : f-10.5f;)
 *   		문자 : char(0~65535[2byte])
 *   		논리 : boolean(true/false[1byte])
 *   			초기화 
 *   				byte b=100;	
 *   				int i=100;
 *   				long l=100L; 
 *   				char c='문자1개';			//공란 입력 가능
 *   				double d=10.5D;			//D생략 가능
 *   				booolean b=ture/false
 *   			1) 명시적 초기화
 *   			2) 난수 int a=(int)(Math.random)
 *   			3) 사용자로 값 수령	scanner
 */

import java.util.Scanner;

public class 자바실행_구조 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력");
		int num=scan.nextInt();
		System.out.println("초기화값:"+num);
		
		System.out.println("실수 입력:");
		double d=scan.nextDouble();
		System.out.println("입력받은 실수값:"+d);
		
		System.out.println("논리 입력:");
		boolean b=scan.nextBoolean();
		System.out.println("입력받은 실수값:"+b);
		
		System.out.println("문자 입력");
		char c=scan.next().charAt(0);
		System.out.println("입력받은 문자"+c);
	}

}
