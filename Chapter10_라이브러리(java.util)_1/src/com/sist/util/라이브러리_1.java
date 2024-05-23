/*
 * 라이브러리 : 자바에서 지원하는 클래스의 집합
 *  1. java.lang : import를 사용하지 않음
 *  	object : 모든 클래스에 상속을 내리는 최상위 클래스
 *  		toString() : 객체를 문자열화
 *  		clone() : 복제(새로운 메모리 생성)
 *  		equals() : 객체 비교
 *  		finalize() : 소멸자
 *  		hashCode() : 객체 주소를 반환
 *  	String : 문자열 저장하는 데이터형. 웹에 가장 많이 사용
 *  		length() : 문자갯수 확인
 *  		equals() : 실제 저장된 문자열 비교
 *  		substring() : 문자열을 자르는 경우
 *  		trim() : 좌우의 공백 제거
 *  		valueOf() : 모든 데이터형을 문자열로 변환
 *  		replace(), replaceAll() : 문자 변환
 *  		indexOf(), lastIndexOf() : 문자나, 문자열의 위치 찾기
 *  	StringBuffer : 임시저장소를 만들어 문자열 결합
 *  		append() : 문자열 결합	
 *  	Math : 수학연산
 *  		random() : 임의 추출(랜덤변수)
 *  		ceil() : 올림
 *  	System : 운영체제와 연결
 *  		print, printf, prinfln
 *  		gc() : 메모리 회수
 *  		exit() : 프로그램 종료
 *  	Wrapper : 기본 데이터형(int, long, double)을 쉽게 사용 가능하게 기능 부여
 *  		int -> Interger		->	Interger.parseInt()
 *  		double -> Double	->	Double.parsDouble()
 *  		boolean -> Boolean	->	Boolean.parseBoolean()
 *  		byte -> Byte		->	Byte..parseByte()
 *  2. java.util : 반드시 import 후 사용
 *  	Date : 날짜 읽기(오라클에서 저장된 날짜 읽기)
 *  	calendar : Date의 읽기 기능에서 기능 추가
 *  	StringTokenizer : 문자열을 분해(단어별 추출)
 *  	자료구조 : 라이브러리의 표준화(CRUD[추가, 수정, 삭제, 읽기]가 가능)
 *  		Collection : inferface
 *  			List : ***ArrayList, LinkedList, Vector, Stack/Queue
 *  			Set : ***HashSet, TreeSet
 *  			Map : Hashtable, ***HashMap
 *  				List : 중복을 허용, 순서가 존재, 데이터베이스에 데이터를 저장해 브라우저에 전송
 *  				Set : 중복허용 안함, 순서 존재 안함, 중복 제거
 *  				Map : 키/값으로 구성, 키는 중복 불가능하나 값은 중복 가능, 세션/브라우저-자바의 전송/클래스 등록 등에 주로 사용
 * 		웹에서 사용하는 3대 클래스 : String, arrayList, Interger	 
 *  
 *  	
 *  3. java.text
 *  4. java.io
 *  5. java.net : 데이터 수집(크롤링)
 *  6. java.sql : 오라클 연동
 */

package com.sist.util;

public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
