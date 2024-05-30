/*
 * 프로그램
 *  1. 데이터 저장(메모리/파일/데이터베이스)
 *  		파일/데이터베이스에서 읽은 데이터를 메모리에 저장 후 관리
 *  	자바에서 사용하는 용어
 *  	1)변수/상수 : 한개의 데이터의 저장공간
 *  			변경불가 : final 데이터형 
 *  		저장공간의 크기/종류(데이터형)
 *  			데이터형 
 *  				정수 : byte(1byte. -128~127), int(default. 4byte. -21억4천~21억4천), long(8byte. 금융권, 빅데이터 등 천문학적 숫자 사용)
 *  					오라클에서 보내준 데이터를 받는경우 : NUMBER, NUMBER(4) -> int로 받는다.
 *  				실수 : double(default. 8byte)
 *  					오라클에서 보내준 데이터를 받는경우 : NUMBER(7,2) -> 7자리중 2자리는 소수 -> double
 *  				논리형 : boolean(true/false만 가능. 1byte)
 *  					오라클에는 존재 안함(CHAR, NUMBER)
 *  				문자/문자열 : String(default. 웹, 윈도우 등)
 *  					오라클 : VARCHAR2
 *  					1] 오라클 컬럼과 매칭
 *  						오라클 컬럼의 종류에 맞춰 데이터형 부여
 *  						숫자형( NUMBER-> int, double)
 *  						문자형( CHAR/VARCHAR2/CLOB -> String)
 *  					2] 웹에 출력된 데이터
 *  
 *  	2) 데이터가 많은 경우에 데이터를 모아서 관리
 *  		묶어서 사용 : 반복문 사용(소스를 간결하게 만든다)
 *				-> 배열 : 같은 데이터형을 한 개의 이름으로 제어(구분자->인덱스로 구분)
 *					데이터형[] 배열명=new 데이터형[갯수]
 *				-> 클래스 : 다른 데이터형이 여러개 존재할때 한 개의 이름으로 제어(구분자 -> 메모리주소값->객체)
 *					new 생성자()
 *					-> 한개의 이름으로 관리 : 인터페이스. 컬랙션
 *
 *	변수의 종류
 *	//메소드에서만 사용 가능
 *	1. 지역변수 : 메소드안에 선언되는 변수(루프변수, 결과값
 *	2. 매개변수 : 사용자가 보내준 요청(사용자 요청값) -> 3개이상 초과하지 않는다(초과시 배열, 클래스 사용)
 *	//프로그램 종료시까지 사용(다른 클래스에서 사용가능)
 *  3. 인스턴스 : 메모리공간이 따로 생기는 공간(new 사용시마다 생성)
 *  4. 공유변수(정적변수) : 모든 객체가 공동으로 사용가능한 변수(한개의 메모리만 생성)
 *  
 *  	-자바에서 지원하는 메모리공간
 *  		Method Area : Method가 저장(Method명이 주소), 공유변수(static)
 *  		Stack : 메모리 자체관리( {} 블록이 끝나면 자동으로 회수), 지역변수/매개변수
 *  		Heap : 인스턴스 변수(new 사용), 클래스/배열, 프로그래머가 관리->메모리 해제(객체가 null인 경유, 사용하지 않는 변수). [new->delete, malloc()->free(). 자동메모리 회수기 이용(가비지 컬랙션)]
 *  
 *  	사용자 요청에 따라 제어
 *		1) 연산자
 *			단항연산자
 *				증감연산자( ++, -- )
 *					전치연산자/후치연산자 : a++, a-- -> 무조건 1개를 증가/감소한다
 *				부정연산자( ! ) -> true/false
 *				형변환연산자( (데이터형) )
 					왼쪽에서 받는 변수(클래스)가 크거나 같다 : 값을 받는 데이터=데입할값
 					자동형변환 : UPCasting(큰 데이터형으로) , 강제형변환 : DownCasting(작은 데이터형으로)
 						byte<char<int<long<float<double
 *			이항연산자 : 자동 형변환(프로그램언어는 연산시 같은 데이터형끼리만 가능)
 *				산술연산자( +, -, *, /, % )
 *					+ : 산술연산, 문자열 결합
 *					/ : 0으로 나눌수없다. 예외처리 필요
 *					정수/정수 : 몫만 출력. 나머지 제거.
 *					% : 남는것이 왼쪽 부호를 따라간다.
 *						산술규칙 
 *						int + int = int
 *						int + long = long
 *						int + char  = int
 *						int + double = double
 *						byte + byte = int
 *						char + char = int		// int이하 데이터형의 연산결과는 int로 출력
 *				비교연산자( ==, !=, <, >, <=, >= ) : 조건/반복문에서 사용 (boolean)
 *					오라클 : = , 자바 : ==
 *					오라클 ; <> , 자바 : !=
 *				논리연산자( &&, || ) : boolean. 두 개의 조건이 있는 경우 처리
 *				 	&& : 두개의 조건이 true일 경우 true
 *					|| : 두개중 하나 이상의 조건이 true일 경우 true
 *				대입연산자( =, +=, -= )
 *					+= : 누적시 주로 사용
 *			삼항연산자 ( if~else )
 *		2) 제어문
 *			조건문(if)
 *				단일조건문
 *					if(조건) { true일때 수행하는 문장 } -> 조건(결과값 : true/false) 부정/비교/논리. 독립적으로 구성. 여러개 사용시 속도가 느림
 *				선택조건문
 *					if(조건) { true일때 수행 } else { false일때 }
 *				다중조건문
 *					if(조건) {} else if(조건) {} ~ else{}
 *			반복문(for, while)
 *				for(데이터형 변수:배열, 컬랙션)
 *				{	실행문장	}
 *				for(초기값; 조건식; 증가식) { 실행문장 }
 *				while : 반복횟수를 모르는 경우. 데이터가 없을 때까지 반복
 *					초기값
 *					while(조건문) { 실행문장		조건식 }
 *			반복제어문(break)
 *						
 *		배열
 *		1. 선언
 *			데이터형[] 배열명 -> 권장
 *			데이터형 배열명[] -> C언어 호환
 *		2. 초기값
 *			데이터형[] 배열명={값, 값...}
 *			데이터형[] 배열명=new 데이터형[갯수]
 *		3. 값 변경
 *			배열명[0]=값
 *		4. 출력
 *			for-each : 출력전용
 *			값을 변경 : 일반 for(인덱스번호를 이용해 처리)
 *				단점 : 한번 지정하면 변경이 어렵다. 갯수가 틀린경우 처리가 어렵다.
 *					보완->컬랙션(AllayList)
 *		메소드 : 명령문을 모아서 관리
 *			리턴형 : 요청에 대한 처리값
 *				1) 기본형 : int, String
 *				2) 데이터가 여러개일경우 : ArrayList
 *				3) 관련된 데이터 : 사용자 정의 데이터형
 *			매개변수 : 사용자가 요청한 값
 *			메소드명 : 암묵적룰(소문자로 시작/운영체제 호환->알파벳사용)
 *			1) 형식
 *				[접근지정어][제어어] 리턴형 메소드명(매개변수목록) 		//선언부
 *				{	
 *					구현부
 *					return 값; 		//void일때 생략 가능
 *				}
 *				->접근지정어 : 특별한 경우가 아닌경우 public 사용(다른 클래스에서 사용가능하도록)
 *				->제어어 : static (공통사용기반), abstract(선언하는 메소드. 프로그램에 맞게 구현해 사용)
 *			2) 종류
 *				리턴형, 매개변수의 존재에 따른 2^2=4가지 존재. OO일때 가장 많이 사용, OX일때 자체에서 처리 결과, XO에서 데이터베이스, XX빈도수 가장 적음
 *					사용자 요청 : 검색결과를 브라우저에 출력
 *					-> 리턴형/매개변수 : ArrayList/String 
 *			3) 클래스
 *			구성요소 :
 *				class ClassName
 *				{				//반드시 접근범위를 설정(접근지정어)
 *				변수
 *					->인스턴스 변수 : new 사용시마다 새로운 메모리 생성
 *						[접근지정어] 데이터형 변수명;	//변수명 : 기본형(int, long), 배열, 클래스(String)
 *					->공유변수(정적변수) : static. 1개만 생성
 *				생성자, 초기화 블록 : 없는 경우도 존재. 생성자는 없을경우 자동으로 디폴트 생성자 추가
 *					-> 생성자 : 맴버변수의 초기화 담당
 *					class ClassName
 *					{
 *					선언만 가능 (예외처리, 메소드호출, 연산자, 제어문 등의 구현은 불가)
 *					}
 *					class ClassName
 *					{
 *					try{
 *					}catch(exception ex) {}
 *					}
 *					
 *					
 *				메소드
 *				}
 *				추상클래스
 *				인터페이스
 *					->객체지향의 3대특성(권장사항)
 *						캡슐화 : 데이터보호(시큐어코딩의 기본). 데이터 은닉화 후 메소드로 접근(private-> getter/setter)
 *						재사용 : 상속, 포함
 *						오버라이딩/오버로딩 : 추가, 수정이 가능하도록 함
 *
 *
 *			관련된 명령문을 묶어서 사용 : 재사용/반복제거/에러제어/기능편리 추가(메소드)
 *			메소드+변수를 묶어서 사용 : 클래스
 *				만들지못하는 기능 : 자바에서 클래스 지원(라이브러리)
 *			다른 프로그램과가 연동
 *				1. 오라클 연동
 *				2. 브라우저 연동		
 *
 *
 *
 *
 * 예외처리
 *  목적 : 사전에 에러를 방지하는 프로그램
 *  정의 : 비정상종료를 방지하고 정상종료를 수행하게 만든다
 *  	직접처리 : 프로그래머가 직접 에러를 처리(에러복구)
 *  		try~catch~finally : 거의 대부분 사용			//try~catch는 여러개 사용가능
 *  	간접처리 : 에러발생에 대해 사전설정(사전 예외처리후 사용)
 *  		throws : 에러떠넘기기
 *  			상속(위로 올라갈수록 크다) : 예외처리 범위
 *  				object-Throwable(Exception/Error)-Error(처리불가)||Exception(처리가능)
 *  	
 *  	오라클 연동 : 예외처리를 가짐
 *  		JDBC : 자바에서 제공하는 예외처리 라이브러리
 *  		DBCP : 웹에서 주로 사용하는 기술
 *  		ORM : 실무에서 사용하는 기술
 *  
 *  
 *  
 *  
 *  
 *  
 */	

package com.sist.main;

import java.lang.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

class Human{
	public void display() {
		System.out.println("Human:display() call...");
	}
}
class Sawon{
	public void aaa() {
		
	}
	public void bbb() {
		
	}
	public void ccc() {
		
	}
}


public class 최종정리 {
	public static void main(String[] args) throws Exception {
		/*
		int[] arr=new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		System.out.println(Arrays.toString(arr));
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		*/
		Human h1=new Human();
		h1.display();
		Human h2=(Human) new Human().getClass().getDeclaredConstructor().newInstance();
		h2.display();
		Human h3=Human.class.getDeclaredConstructor().newInstance();
		h3.display();
		Class clsName=Class.forName("com.sist.main.Human");
		Method[] methods=clsName.getDeclaredMethods();
		Human h4=(Human)clsName.getDeclaredConstructor().newInstance();
		methods[0].invoke(h4, null);			//매개변수 
		System.out.println("메소드명 사용");
		h4.display();
		
		Class cls=Class.forName("com.sist.main.Sawon");
		Object obj=cls.getDeclaredConstructor().newInstance();
		Method[] ms=cls.getDeclaredMethods();
		Scanner scan=new Scanner(System.in);
		System.out.print("호출할 메소드명 입력:");
		String mName=scan.next();
		//Annotation -> 구분자(스트링)
		for(int i=0; i<ms.length; i++) {
			String s=ms[i].getName();
			if(mName.equals(s)) {
				//System.out.println(i+":"+ms[i].getName());
				ms[i].invoke(obj, null);
				//메소드 호출->매개변수
			}
		}
	}
}
