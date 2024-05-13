/*
 * 상속
 * 	1. 단일상속만 가능
 * 	2. extends(확장한 클래스)
 * 	3. 이미 제작된 클래스(신뢰성 높음)
 * 	4. 소스 간소화(가독성은 저하)->가상 상속되었다 가정
 * 		class A{
 * 			int a,b,c,d;
 * 			public void display(){}
 * 		}
 * 		class B extends A{		//B가 A에 상속(B가 A를 포함)
 * 			//a,b,c display()
 * 		}
 * 		B bb=new B();
 * 			bb		(상속시 공간)->		super{ a / b / c / display() }		//		this{ bbb() }		->모든영역에 접근 가능(bb라는 객체롤 통해 접근 가능)
 * 			class super -> class sub extends super	:	super<-sub 로 상속. 클래스의 크기 비교는 반드시 상속/포함이 필요
 * 				//클래스 크기비교 : class A{int a,b,c}	class B{int d,e} 간의 크기 비교 불가
 * 								class A{int a,b}	class B extends A{class b, int c}={int a,b,c}	A>B 이다. 상속내리는 클래스가 더 크다.
 * 					->클래스에도 크기가 있으므로 형변환이 필요하다
 * 					**자바는 모든 클래스(사용자정의,라이브버리)의 상속을 내리는 클래스가 있다(최상위클래스:Object). 즉 Object가 가지는 모든 기능을 사용할 수 있다(Object=기본형~배열~문자열~모든 클래스를 받기 가능. 문자열로서 사용할시 다른 데이터형 혼합 관리 가능)
 * 		//상속안되는 예외 : 생성자, 초기화 블록, static(상속은 불가능. 공통으로 사용 가능하게는 만듬), private(상속은 되나 접근 불가능. protected를 쓰면 가능)
 * 					
 *  	
 */

package com.sist.main;

import javax.swing.*;
public class MainClass_3 extends Object{	//Object는 생락 가능. 
											//생략가능한(생략되있는) 코드 : import java.lang.*; || extend Object || 생성자(불필요시 생략가능.컴파일러 자동 추가) || void 메소드에서 return(컴파일러 자동 추가) || 모든 클래스는 예외처리(컴파일시 반드시 예외처리. 실행시는 생략 가능)
																																															//반드시 예외처리해아하는 
	public MainClass_3() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
