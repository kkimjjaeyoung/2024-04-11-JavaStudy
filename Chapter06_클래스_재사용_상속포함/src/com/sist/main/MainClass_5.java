/*
 * 상속
 *  사용자 정의 클래스는 상속으로 잘 사용하지 않고 라이브러리 클래스를 쓴다
 *  
 *  단일상속
 *   상위클래스는 가급적 공통기반을 모아서 처리
 *    메모리에 저장
 *    	상위클래스=하위클래스
 *      하위클래스=하위클래스
 *      하위클래스=(하위클래스)상위클래스	//변환
 *      	클래스 크기는 상속이 있어야 비교가능
 *      선언되는 클래스 : 변수
 *      생성자 : 메소드 지정
 */

package com.sist.main;

class A{
	int a=10;
	int b=20;
	public void display() {
		System.out.println("A:display() call");
	}
}



class B{
	int a=100;
	int c=200;
	public void display() {
		System.out.println("B:display() call");
	}
}				//A aa=new B() 오류!

public class MainClass_5 {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
