/*
 * 컬랙션(Colletcion) : 데이터가 많은 경우에 처리를 쉽고 효율적으로 관리가능하게 만드는 자료구조(표준화)
 * 		자료구조 : 데이터 수정/추가/삭제/읽기(CRUD). 
 * 			-> 배열은 선언과 동시에 저장갯수가 지정되어 추가/삭제가 불가능하므로 자동 증가/축소가 가능한 가변형으로 만든것이 컬랙션
 * 	list : 일자배열(값이 순차적으로 배열. 데이터 중복 허용. 인덱스로 데이터 구분[인덱스는 자동 추가])
 * 		구현클래스 
 * 			ArrayList : 데이터베이스의 저장값을 저장후 브라우저에 전송(Vector의 단점보완. 비동기적 방식으로 접속속도 개선)
 * 			Vector : 네트워크 접속자 정보 저장(동기적 방식. 접속속도 느림.)
 * 			Stack : (LIFO[Last In First Out]구조. 변수저장. 사용권장안함)
 * 			LinkedList : 추가,삭제가 빠르다. 접근속도가 느리다 C언어 호환됨.
 * 			Queue : LIFO구조. 네트워크 전송, 운영체제 스케줄러 등
 *  set : 묶음배열(데이터 중복이 없다. ArrayList에서 중복된 데이터 제거)
 *  	구현클래스
 *  		HashSet : 중복 제거
 *  		TreeSet : 검색(속도 빠름)
 *  Map : 사용빈도가 적으나 라이브러리에선 많다. 구분자(key. 중복없음)와 데이터(value. 중복가능)를 동시에 저장
 *  	구현클래스
 *  		request : 사용자가 보낸 값을 받을때 사용
 *  		response
 *  		session
 *  		cookie
 *  	스프링 : 클래스관리
 *  	MyBatis : SQL 관리
 *  		HashMap : 비동기. Hashtable을 보완
 *  		Hashtable : 동기
 *  
 *  arraylist,hashset,hashmap : 일반 기본값을 저장, 클래스도 저장 가능. 형변환 필요없음
 *  	
 *  	제네릭 : 데이터형 통일화. 간결하고 가독성이 좋다
 *  		arraylist<> list=new arraylist<>()
 *  
 *  자료구조 : 메모리에서 데이터 관리
 *  	add() : 추가 (데이터베이스 데이터 담기)
 *  	remove() : 삭제 
 *  	get() : 읽기 (데이터읽기. HTML로 브라우저 출력)
 *  	set() : 수정
 *  	clear() : 전체 삭제
 *  	size() : 저장갯수 (for를 이용해 출력횟수 확인)
 */

package com.sist.util;

import java.util.*;

public class 컬랙션_1 {
	// 데이터(같은 데이터형)을 모아서 처리하는것이 효율이 좋다(제네릭)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();			//문자열만 저장해서 관리 { add(Object) -> add(string) : 사용자 정의 데이터형으로 변경 }
		//가급적 같은 데이터형 사용. 데이터형 동일시 반복문 수행 가능
		list.add("홍길동");
		list.add(10);
		list.add(10.5); 
		list.add(true);
		list.add('A');
		
		for(int i=0; i<list.size(); i++) {
			if(i==0) {								// object 형으로 arraylist 사용시 각각의 데이터형을 지정 필요 
				String name=(String)list.get(i);
				System.out.println(name);
			}
			if(i==1) {
				int no=(int)list.get(i);
				System.out.println(no);
			}
			if(i==2) {
				double d=(double)list.get(i);
				System.out.println(d);
			}
			if(i==3) {
				boolean b=(boolean)list.get(i);
				System.out.println(b);
			}
			if(i==4) {
				char c=(char)list.get(i);
				System.out.println(c);
			}
		}
		
	}

}
