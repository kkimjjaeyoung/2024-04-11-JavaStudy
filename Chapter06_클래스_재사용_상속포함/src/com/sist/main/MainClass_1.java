package com.sist.main;


public class MainClass_1 {
	private int num;			//heap영역에 저장
	public MainClass_1()
	{
		System.out.println("this라는 자신의 객체가 생성");
		System.out.println("this="+this);
	}
	public void numData(int num) {		//stack영역에 저장
		//num변수 적용 우선순위 : 지역변수와 매개변수 > 맴버변수
		System.out.println("num="+num); 	//지역변수, 매개변수 우선. 맴버변수를 사용할때는 'this.변수명' 으로
		System.out.println("this.num="+this.num); 			//this가 구분자
		this.num=num;
		System.out.println("this.num="+this.num);		
		//매개변수와 맴버변수의 충돌을 막기 위해 this
	}
	public void display() {
		System.out.println("this="+this);
	}
	public static void aaa() {
		//static은 모든 객체가 공통으로 사용해 this 사용 불가
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass_1 m=new MainClass_1();		//this=m : JVM 자동으로 객체주소를 대입
		System.out.println("m="+m);
		m.numData(100);
		MainClass_1 m1=new MainClass_1();			//this=m1
		System.out.println("m1="+m1); 		
		//객체생성시마다 this 생성 : 자신의 클래스 생성
	}

}
