package com.sist.util;

import java.util.*;

public class 컬랙션_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();		//문자열만 추가 가능
		
		names.add("홍길동");
		names.add("박문수");
		names.add("심청이");
		names.add("이순신");
		names.add("강감찬");
		
		System.out.println("저장된 데이터 출력");
		for(int i=0; i<names.size(); i++) {
			String name=names.get(i);
			System.out.println(i+":"+name);
		}
		System.out.println("데이터 추가 후 인덱스 확인");
		names.add("춘향이");
		for(int i=0; i<names.size(); i++) {
			String name=names.get(i);
			System.out.println(i+":"+name);	
		}
		System.out.println("지정위치추가");
		names.add(3, "이산"); 			//인덱스 3번에 추가. 기존 데이터는 뒤로 밀림
		for(int i=0; i<names.size(); i++) {
			String name=names.get(i);
			System.out.println(i+":"+name);
		}
		System.out.println("데이터 수정");				//set
		names.set(1, "박문수 수정");
		for(int i=0; i<names.size(); i++) {
			String name=names.get(i);
			System.out.println(i+":"+name);	
		}
		System.out.println("3번째 수정");
		names.set(3, "이산 수정");
		for(int i=0; i<names.size(); i++) {
			String name=names.get(i);
			System.out.println(i+":"+name);	
		}
		System.out.println("데이터 삭제");				//remove
		names.remove(2);
		for(int i=0; i<names.size(); i++) {
			String name=names.get(i);
			System.out.println(i+":"+name);	
		}
		System.out.println("현재인원 :"+names.size());
		System.out.println("전체삭제");				//clear
		names.clear();
		System.out.println(names.size());
	}

}
