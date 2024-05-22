

package com.sist.lang;

import java.util.ArrayList;

class Sawon{
	private String name;
	private String sex;
	//메소드를 통해 변수에 접근(getter/setter)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getsex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex=sex;
	}
	//toString 오버라이딩
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름:"+name+", 성별:"+sex;
	}
	//toString() -> default(메모리 주소)
	//	Object에서 오버라이딩은 toString
	//문자열 변환 : 대부분이 자바에서 지원한느 메소드의 리턴형 object로 구성
	//클래스 저장 : object
}

public class 라이브러리_object_2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Sawon s=new Sawon();
		s.setName("홍길동");
		s.setSex("남자");
		System.out.println(s);					//tostring 자동호출(생략됨)
		System.out.println(s.toString());
		*/
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(10.5);
		list.add("aaa");
		
		int a=(int)list.get(0);
		double d=(double)list.get(1);
		String s=list.get(2).toString();			//사용시마다 형변환
	}

}
