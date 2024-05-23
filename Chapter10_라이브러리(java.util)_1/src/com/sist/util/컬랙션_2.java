package com.sist.util;

import java.util.*;

public class 컬랙션_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(100);
		list.add("홍길동");
		list.add('A');
		list.add(true);
		list.add(10.5);
		//데이터형 첨부->관리가 어렵다. 반복문이 어렵다
		int a=(int)list.get(0);
		String name=(String)list.get(1);
		char c=(char)list.get(2);
		boolean b=(boolean)list.get(3);
		double d=(double)list.get(4);
		//가급적 동일한 데이터형을 저장해 사용
		//형변환 없이 사용->제네릭
		
	}

}
