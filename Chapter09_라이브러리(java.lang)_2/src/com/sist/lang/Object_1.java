/*
 * java.lang / java.util / java.io / java.net / java.sql
 * 	lang, util, sql은 웹관련 핵심 라이브러리. io는 파일 업로드,다운로드. net은 브라우저에서 한글인식(인코딩, 디코딩)
 * 
 * 라이브러리 : 자바에서 지원하는 클래스의 집합(API). 변수없이 메소드만 가진다
 * 
 * java.lang
 * 	Object : 자바의 모든 클래스의 최상위 클래스(모든 클래스에 상속을 준다). 생략가능(extends object 등). 데이터형중 가장 큰 데이터형(모든 데이터형 사용, 혼합사용 가능)
 * 			상속 / 포함
 * 				상속 : 상속을 받는 클래스(추가된 기능, 상속받은 기능) < 상속을 내리는 클래스(상속받은 기능의 추가기능에 접근 불가)
 * 				포함 : 포함하고 있는 클래스가 크다
 * 		기능
 * 			1. toString() : 객체를 문자열화(묵시적, 명시적). 가장 많이 오버라이딩
 * 				- sysout(a) = sysout(a.toString)	:	묵시적(생략), 명시적]
 *			2. hashCode() : 객체의 메모리 주소값을 리턴형
 *			3. clone() : 객체를 복제(새로운 메모리에 해당 객체 내용을 복제)
 *			4. finalize() : 소멸자(객체메모리 해제)  
 * 	String 
 * 	System
 * 	Math
 * 	Wrapper
 * 	StringBuffer
 */

package com.sist.lang;

import java.util.*;

class Sawon{
	private int sabun;
	private String name;
	public Sawon(int sabun, String name) {
		this.sabun=sabun;
		this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "사번:"+sabun+", 이름:"+name;		//메모리 주소값을 변경(변수초기화)
	}// 디폴트 생성자 없음
}

class Student{
	private int hakbun;
	private String names;
	//생성자->디폴트(자동추가)는 사욜 불가
	public Student(int hakbun, String names) {
		this.hakbun=hakbun;
		this.names=names;
	}
	// hashcode 변경(
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(hakbun, names);
	}
}
/*
 * 인터페이스->클래스(다중상속)
 * 	인터페이스는 상속받아야지만 사용가능(미완성클래스)
 * 		인터페이스->인터페이스(확장:extends)	||	인터페이스->클래스(미완성메소드구현:implements)	||	클래스->클래스(확장:extends)
 */
class Box implements Cloneable{
	private int width;
	private int hieght;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHieght() {
		return hieght;
	}
	public void setHieght(int hieght) {
		this.hieght = hieght;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {		// throws문장 뒤에 붙는 예외클래스 : RuntimeException(예외처리 후 사용)
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

public class Object_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1=new Sawon(1, "홍길동");		//데이터베이스에서 데이터읽기/파일데이터 읽기
		System.out.println(s1);
		Sawon s2=new Sawon(2, "박문수");
		System.out.println(s2.toString());
		
		Student st1=new Student(1, "홍길동");
		Student st2=new Student(1, "홍길동");			//new로 새로운 메모리 생성(중복 제거시 주로 사용)
		System.out.println("st1:"+st1.hashCode());
		System.out.println("st2:"+st2.hashCode());
		if(st1.hashCode()==st2.hashCode()) {
			System.out.println("같은 학생");
		}
		else {
			System.out.println("다른 학생");
		}
		Box box1=new Box();
		box1.setWidth(300);
		box1.setHieght(350);
		
		Box box3=new Box();
		Box box4=box1;
		System.out.println(box1);
		System.out.println(box4);
		System.out.println("BOX3.WIDTH:"+box3.getWidth());
		System.out.println(box3.getHieght());
		
		try {
			Box box2=(Box)box1.clone();			//box 형변환, 예외처리
			System.out.println("BOX2.WIDTH:"+box2.getWidth());
			System.out.println(box2.getHieght());
			System.out.println(box2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}




}
