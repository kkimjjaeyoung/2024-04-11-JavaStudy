package com.sist.set;

import java.util.*;

public class Set_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new LinkedList<String>();
		list.add("홍길동");
		list.add("박문수");
		
		for(int i=0; i<list.size(); i++) {
			String name=list.get(i);
			System.out.println(name); 
			
		}
	}

}
