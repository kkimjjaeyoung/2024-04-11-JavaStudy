/*
 * 추상클래스의 단점
 * 	상속을 내리는 클래스로 상속을 받을순 없다
 * 
 */

package com.sist.main2;

abstract class AAA {
	int a;
	public abstract void aaa();
	public void bbb() {
		
	}
}

class BBB extends AAA{
	int b;
	public void ccc() {
		
	}
	@Override
	public void aaa() {
		// TODO Auto-generated method stub
	}
}
class CCC{
	int a, b;
	public void ddd() {}
}
class DDD extends CCC{
	int c;
	public void eee() {}
}
/*
 * 상속을 내린 클래스 : 자신의 변수, 메소드만 사용 가능
 * 상속을 받은 클래스 : 자신의 변수, 메소드, 상속받은 변수, 메소드 사용 가능
 * 	CCC 선언 : a, b, ddd()
 * 	DDD 선언 : a, b, DDD(), c, eee()
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA aa=new BBB();		//접근범위에 따라 객체선언 주의.
	}

}
