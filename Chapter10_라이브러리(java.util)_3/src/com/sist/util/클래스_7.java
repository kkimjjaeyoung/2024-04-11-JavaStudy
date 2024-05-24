/*
 * ArrayList
 *  1. 데이터 중복 허용(오라클은 데이터 중복 허용)
 *  2. 기능(메소드) : 라이브러리는 메소드
 *  	1) ***추가 : add(데이터), 
 *  	2) 수정 : set(int index, 데이터)
 *  	3) 삭제 : remove(int index)
 *  	4) ***저장 갯수 : size()
 *  	5) ***읽기 : get(ind index)
 *  	6) ***전체 삭제 : clear()
 *  	7) ***데이터 존재 여부 : isEmpty()
 *  3. ArrayList가 여러개인 경우
 *  	retainAll() : 교집합
 *  	addAll() : 전체 복사
 *  	removeAll() : 차집합
 *  	subList() : 부분적 복사
 */

package com.sist.util;

import java.util.*;

public class 클래스_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("홍길동");
		list.add("홍길");
		list.add("길동");
		list.add("이순신");
		list.add("순신");
		System.out.println("현재 저장된 갯수:"+list.size());
		list.remove("홍길동");
		System.out.println("현재 저장된 갯수:"+list.size());
	}

}
