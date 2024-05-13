/*
 * 
 * 확장 : 변경해서 사용	
 * 		변수 오버라이딩, 메소드 오버라이딩
 * 추가 : 오버로딩
 * 		상태	  :		같은 클래스 내에서만 가능. 익명의 클래스는 가능
 * 		메소드명 : 	오버로딩, 					오버라이딩명 동일
 * 		매개변수 : 	갯수/데이터형이 다름.			갯수/데이터형이 동일
 * 		리턴형 : 		관계없음					동일
 * 		접근지정어 : 	관계없음					축소 불가, 확대 가능
 * 			-> private < default < protected < public
 * 
 *  
 */

//변수 오버라이딩
package com.sist.main;

import java.util.*;
class Parent{
	String name;
	int age;
	
	public Parent() {
		name="홍길동";
		age=25;
		System.out.println("Parent클래스 메모리 할당");
	}
}

class Child extends Parent{
	//string name, int age,
	/*
	 * child c=new child();	->	확장된 클래스(기본)
	 * parent p=new child();	->	클래스 여러개를 한 이름으로 제어
	 */
	public Child() {
		this.name="박문수";		
		this.age=30;			//자신->지역변수(this)
		super.name="심청이";
		super.age=15;			//
		System.out.println("child클래스 메모리 할당");
	}
} 
class KKK {
	public void display() {
		System.out.println("kkk:display() call...");
	}
}
class AAA extends KKK{
	public void display() {
		System.out.println("AAA:display() Call...");
	}
}
class BBB extends KKK{
	public void display() {
		System.out.println("BBB:display() Call...");
	}
}
class CCC extends KKK{
	public void display() {
		System.out.println("CCC:display() Call...");
	}
}
class DDD extends KKK{
	public void display() {
		System.out.println("DDD:display() Call...");
	}
}
class EEE extends KKK{
	public void display() {
		System.out.println("EEE:display() Call...");
	}
}
//변수는 배열로, 클래스는 상속으로 묶어서 관리
public class MainClass_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		System.out.println(c.name);
		System.out.println(c.age);
		
		
		/*
		Scanner scan=new Scanner(System.in);
		System.out.print("AAA(1), BBB(2), CCC(3), DDD(4), EEE(5):");
		int no=scan.nextInt();
		
		KKK k=null;			//상속받은 모든 클래스를 상위클래스로 한번에 제어. 데이터가 여러개일때 []로 배열명. 클래스가 여러개일땐 상속으로 상위클래스 이용
		switch(no) {
		case 1:
			k=new AAA();
			break;
		case 2:
			k=new BBB();
			break;
		case 3:
			k=new CCC();
			break;
		case 4:
			k=new DDD();
			break;
		case 5:
			k=new EEE();
			break;
		}
		*/
/*		if(no==1) {
			AAA a=new AAA();
		}
		else if(no==2) {
			BBB b=new BBB();
		}
		else if(no==3) {
			CCC c=new CCC();
		}
		else if(no==1) {
			DDD d=new DDD();
		}
		else if(no==1) {
			EEE e=new EEE();
		}*/
		
	}

}
