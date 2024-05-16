/*
 * 클래스의 종류
 * 	1. 추상클래스 : 공통으로 사용되는 메소드를 선언. 미완성 클래스이므로 자신의 클래스를 메모리할당 불가(new사용불가). 상속을 통한 오버라이딩을 거쳐 사용. 요구사항(기능설정, 같은 기능으로 다른 구현을 할 시) 등에 사용
 * 		형식
 * 		[접근지정어] abstract class ClassName{
 * 			맴버변수
 * 			생성자(생략시 자동으로 디폴트 생성자 추가)
 * 			메소드(구현된 메소드)
 * 				- [접근지정어] 리턴형 메소드(매개변수...){
 * 					return 값;	//void인 경우 생략
 * 				}
 * 			추상메소드(구현안된 메소드)
 * 				- [접근지정어] abstract 리턴형 메소드명(매개변수...);			
 * 		}
 *		// 같은 기능끼리의 클래스르 한 개의 이름으로 관리할때 사용(클래스끼리의 공통 기능 추출이 중요) 
 *		//맴버변수, 생성자 소유 
 *  2. 인터페이스
 *  3. 내부클래스 : Thread와 관련(네트워크). 클래스 안의 클래스 설정(맴버변수, 맴버메소드의 사용을 쉽게)
 *  	형식
 *  	class A{
 *  		변수, 메소드
 *  		class B{
 *  			A가 가지고있는 변수, 메소드 사용 가능(A객체 생성 불필요)
 *  		}
 *  	}
 *  
 *  	class A{						//익명의 클래스(상속없이 오버라이딩 가능)
 *  		B b=new B(){
 *  			public void display() {}
 *  		}
 *  	}
 *  	class B{
 *  		public void display() {}
 *  	}
 *  		**상속이 있어야 오버라이딩이 가능하나 익명을 클래스를 사용해서도 가능. 상속을 권장하지 않은 스프링등에서 사용(상위클래스에 대한 제약 회피. 메모리 감소.. 처리속도 향상. 재사용 용이[상위클래스를 모르는 상태에서의 재정의])
 *  4. 종단클래스 : 확장이 불가능. 사용빈도는 거의 없으나 라이브러리에 존재(String, System, Math, Wrapper)
 */

package com.sist.main;

import java.util.*;

abstract class 도형{
	public abstract void draw();		//미완성 클래스(메소드 구현 안됨). 상속받아 구현 후 사용
}
class 선 extends 도형{
	/*
	 * 오버라이딩(재정의)
	 * 	1. 메소드명이 동일해야한다
	 *  2. 매개변수가 동일해야한다
	 *  3. 리턴형이 동일해야한다
	 *  4. 접근지정어는 확장이 가능(private, public)
	 *  5. 추상클래스는 반드시 상속으로(선언된 메소드를 구현해 사용)
	 *  		//상속을 내리는 클래스의 생성자가 매개변수를 가진 경우 생략 불가
	 */
	@Override
	public void draw() {
		System.out.println("선을 그린다..");
	}
}
class 사각형 extends 도형{
	@Override
	public void draw() {
		System.out.println("사각형을 그린다..");
	}
}

public class 추상클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 선 a=new 선(); a.draw(); 사각형 b=new 사각형(); b.draw();
		 */
		도형 a=new 선();
		a.draw();
		
		a=new 사각형();
		a.draw();
		//같은 종류의 클래스를 한개의 객체명으로 연결해 사용
		//기능설정 : 프로그램에 맞게 구현해 사용
	}

}
