/*
 * ArrayList 
 * 	add(), remove(), set(), size(), get(), isEmpty(), clear()
 * ->arraylist에는 한개의 데이터만 저장 가능. 두개 이상인 경우에는 JOIN
 * 		retain() : 2개 이상의 list에서 같은 값을 읽어오는 경우
 * 		addAll() : 전체 데이터 복사
 * 		removeAll() : 한쪽에 없는 데이터만 출력
 * 		subList() : 부분복사
 * 		asList() : 배열->ArrayList로 변경
 */

package com.sist.util;

import java.util.*;

public class 컬랙션_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("AE");
		// addAll() -> set : 복사가 가능
		for(String s:list) {
			System.out.println(s);
		}
		ArrayList<String> list2=new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		for(String s:list2) {
			System.out.println(s);
		}
	}

}
