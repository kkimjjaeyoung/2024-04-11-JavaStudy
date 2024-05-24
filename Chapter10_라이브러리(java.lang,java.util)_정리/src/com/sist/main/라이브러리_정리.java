/*
 * 라이브러리 : 자바에서 지원하는 클래스의 집합
 * 	API(Application Program Interface. 운영체제와 연결)
 * 	분류 : 패키지(관련된 클래스끼리 모아서 제공)
 * 		java.lang : 자바의 기본 클래스(import 생략가능)
 * 			object : 최상위 클래스(모든 클래스에 상속을 내림)
 * 				메모리 할당시 주소값 확인 : toString()
 * 				객체 사용시 복제해 사용 : clone()
 * 				객체 소멸자, 메모리 해제시 호출 : finalize()
 * 				객체메모리 주소를 리턴(필요시 변경가능) : hashCode()
 * 				객체비교 : equals()
 * 			String : 문자열을 저장하는 클래스
 * 				String s=""							
 * 				String s=new String("")			//새로운 메모리에 저장해 사용 || 한글변환코드
 * 				
 * 				1. 문자의 갯수 : lenght()
 * 				2. 문자를 있는 그래로 가져오기 : toString()
 * 				3. 문자 변환 : replace(), replaceAll()
 * 				4. 문자 위치 찾기 : indexOf(), lastIndexOf()
 * 				5. 문자 제어 : substring(), split()
 * 				6. 공백문자 제거 : trim()
 * 				7. 모든 데이터형을 문자열 변경 : valueOf()
 * 				9. 비교 : equals()
 * 				10 : 검색 : startsWith(), endsWith(), contains()
 * 			StringBuffer : 문자열 결합
 * 				append()
 * 			Math : 수학 연산
 * 				ceil() : 올림
 * 				random() : 난수발생
 * 			System : 
 * 				exit() : 프로그램 종료
 * 				gc() : 메모리 회수
 * 			wrapper : 제너릭에서 주로 사용
 * 				Integer : parseInt() -> 문자열을 정수형 변환
 * 				Double : parseDouble() -> 문자열 실수형 변환
 * 				Boolean : parseBoolean() -> 논리형 변환
 * 		java.util : 프로그램 사용에 유용하게 사용할수있게 만든 클래스집합
 * 			Random : 난수발생
 * 				nextInt() -> nextInt(100) 1~99변수발생
 * 			Data : 기능없음 -> Data date=new Date()
 * 				오라클 날짜 데이터와 호환(데이터베이스 호환)
 * 			Calendar : Date에 없는 기능 첨부. 추상클래스로 되어있으며 new사용 불가
 * 				Calendar cal=calendar.getInstance()
 * 			StringTokenizer : 단어별 분리할때 주로 사용
 * 				nextToken() : 분리된 단어를 한개씩 읽어올때 사용
 * 				countToken() : 분리된 단어의 갯수
 * 				hasMoreToken() : 박복문 수행
 * 		//제너릭(데이터형을 변경). 기본형 데이터 사용 불가. 각 데이터형마다 클래스 지원(Wrapper) 
 * 			ArrayList : 중복된 데이터가 있는 경우, 순서는 인덱스 자동조절.[구분자(인덱스)]
 * 				추가 : ***add()
 * 				수정 : set()
 * 				삭제 : remove()
 * 				전체삭제 : ***clear()
 * 				저장 갯수 : ***size()
 * 				읽기 : ***get()
 * 				->ArrayList가 여러개일 경우
 * 					retainAll() : 같은 값 수집
 * 					removeAll() : 차집합 수집
 * 					addAll() : 전체 데이터 복사
 * 					subList() : 부분 데이터 복사
 * 			HashSet : 중복이 없는 데이터. 순서가 없음(출력시 원하는 순서로 출력이 안될수 있다). 
 * 				***add() : 
 * 				***clear() : 
 * 				iterater() : 
 * 			HashMap : 
 * 		java.text : 변환(숫자, 날짜 변환)
 * 			Decimalformat : format()
 * 				Decimalformat  df= new Decimalformat ("###,###,###,###");
 * 			SimpleDataFormat : format()
 * 				SimpleDataFormat  sdf=new SimpleDataFormat ("n");
 * 					년도 : n=yyyy
 * 					월 : MM/M
 * 					일 : dd/d
 * 					시간 : hh/h
 * 					분 : mm/m
 * 					초 : ss/s
 * 		java.io : 입출력(메모리, 파일, 네트워크)
 * 		java.net : 네트워크 프로그램 개발\
 * 		java.sql : 데이터베이스 프로그램 개발
 */


package com.sist.main;

import java.net.*;

public class 라이브러리_정리 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("자바".getBytes());
		String s=URLEncoder.encode("자바", "UTF-8");
		System.out.println(s);
		s=URLDecoder.decode(s, "UTF-8");
		System.out.println(s);
	}

}
