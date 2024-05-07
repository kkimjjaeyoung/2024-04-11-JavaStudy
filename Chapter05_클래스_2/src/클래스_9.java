/*
 * 객체생성	{	new 생성자()	}
 * 		new : 클래스에 있는 맴버변수를 저장할 수 있는 공간을 만든다
 * 		생성자 : 맴버변수의 초기값을 대입해주는 역할. 생성자 호출시에는 반드시 new
 * 	1. 설계 : class
 * 	2. 메모리 저장 : new
 *  3. 활용 : new로 받은 메모리 활용(객체)
 *  목적 : 재사용, 수정, 추가를 편하게 한다
 *  
 *  객체생성
 *  	1. 생성
 *  	2. 사용시 a.변수/메소드
 *  참조변수 : 메모리 주소를 이용하는 방식
 *  일반변수 : 메모리에 저장된 값을 이용하는 방식
 */
class A{
	String name;
	int age;
}

public class 클래스_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=10; int b=a;
		 * 
		 * b=100; System.out.println("a="+a); System.out.println("b="+b);
		 */
		A a=new A();						//a=name/age
		System.out.println("a="+a);			//메모리 주소 확인
		a.name="박문수";
		a.age=30;
		System.out.println("a.name="+a.name);
		System.out.println("a.age="+a.age);
		
		A b=a;			//메모리 주소를 받는 경우. 메모리에 있는 변수 자체를 제어
		System.out.println("a="+a);			//메모리 주소 확인
		a.name="이순신";
		a.age=25;
		System.out.println("b.name="+b.name);
		System.out.println("b.age="+b.age);
		
		System.out.println("a.name="+a.name);
		System.out.println("a.age="+a.age);
		// 배열/클래스는 메모리 주소를 이용. 대입시 같은 메모리(참조변수)
	}

}
