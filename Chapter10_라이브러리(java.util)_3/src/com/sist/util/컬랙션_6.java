package com.sist.util;

import java.util.*;

public class 컬랙션_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();		//Wrapper L 제너릭에 첨부, 기능 부여
		// 정수=10
		Random r=new Random();
		for(int i=0; i<10; i++) {
			// 오토박싱 ( Interger i=10 )		클래스로 가져옴
			list.add(r.nextInt()+1);		//1~100
		}
		System.out.println("list 데이터 출력");
		// 언박싱 ( int a=i )
		for (int i:list) {
			System.out.println(i);
		}
		System.out.println("정렬");
		Collections.sort(list);
		for(int i:list) {
			System.out.println(i);
		}
		
		ArrayList<Integer> list2=new ArrayList<Integer>(list.subList(0, 5));  	//list의 데이터 0~5번(5개) 복사
		
		System.out.println("복사된 데이터 출력");
		for(int i:list2) {
			System.out.println(i);
		}
		//5개 추가
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		System.out.println("list2의 모든 데이터 출력s");
		for(int i:list2) {
			System.out.println(i);
		}
		System.out.println("정렬");
		Collections.sort(list2);
		for(int i:list2) {
			System.out.println(i);
		}
	}

}
