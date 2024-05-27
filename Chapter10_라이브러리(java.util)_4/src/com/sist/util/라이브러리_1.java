/*
 * java.util : 가장 많이 사용되는 라이브러리
 * 	1. 난수
 * 		Random(정수, 지정된 범위)
 * 			1) 객체생성 : Random r=new Random()
 * 			2) 난수발생 : r.nextInt(100) -> 0~99
 * 				-> 웹 : 예약일/예약시간 변경 
 * 	2. 날짜
 * 		Date/Calendar : 기본 기능 없음. 기능 부여. 데이터베이스 호환해 전송하는 날짜를 받음.
 *  3. 변환 : 날짜변환/숫자변환
 *  	simpelDataFromat : new DecimalFormat("###,###,###") 
 *  	DecimalFormat : new SimpleDataFromat("yyyy-MM-dd")
 *  		년도(yy/yyyy), 월(MM/M), 일(dd/d), 시(hh/h), 분(mm/m), 초(ss/s)
 *  4. 데이터관리 : 컬랙션. 데이터를 쉽고 효율적으로 관리가능하도록 하는 표준화 라이브러리(컬랙션 프레임워크)
 *  		단점
 *  		1) 모든 데이터를 저장해 관리할수 있도록 만들어져있다
 *  		2) 형변환 후에 사용해야되 첨부된 데이터에 대한 가독성이 떨어진다
 *  		보완 : 형변환 없은, 가독성 향상
 *  			제네릭 : 데이터형 통일화, 소스 간결화
 *  				기본형 클래스화 : 제네릭 사용 가능, 기본형에 기능 부여
 *  				int=Integer -> parseInt()
 *  				double=Double ->parseDouble()
 *  				boolean=Boolean -> parseBoolean()
 *  					-> string만 사용가능(String을 기본형으로 변경가능)
 *  				// 데이터 통일 : 제네릭을 사용하지 않으면 모든 메소드의 리턴형과 매개변수가 object다.(Object를 프로그램에 필요한 데이터형으로 변경. 사용자 정의 클래스도 가능)
 *  		컬랙션 클래스 종류
 *  			collection : 데이터관리(읽기, 추가, 수정, 삭제, 검색)
 *  				List : 순서를 가짐(순차적 처리), 중복 데이터 허용, 데이터베이스에 주로 사용
 *  					ArrayList : 비동기화 처리. 속도 빠름.
 *  					Vector : 동기화. 저장완료시 다음 저장. 속도 늚
 *  					LinkedList
 *  				Set
 *  					HashSet
 *  					TreeSet
 *  				Map
 *  					HashMap
 *  					HashTable
 *  			interface
 *  			
 *  
 */		

package com.sist.util;

public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
