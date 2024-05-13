/*
 * 오버로딩 : 중복 메소드 정의(같은 기능, 중복함수 정의)
 * 	상태 : class A{
 * 			public void aaa() {}			->		aaa()
 * 			public void aaa(int a) {}		->		aaa(int)
 * 			public void aaa(char c) {}			->		aaa(char)
 *  		public void aaa(char k) {}			->		aaa(char)
 *   		public void aaa(int a, int b) {}			->		aaa(int, int)
 *    		public int aaa(double d) {}			->		aaa(double)
 *     		void aaa(float f) {}				->		aaa(float)
 * 매소드명 : 동일
 * 매개변수 : 갯수, 데이터형이 다름
 * 리턴형 : 관계없음
 * 접근지정어 : 관계없음
 * 
 * 오버라이딩 : 기존의 클래스를 상속받아 재정의(메소드 기능을 변경)
 * 	매소드명 : 동일
 * 	매개변수 : 동일
 *	리턴형 : 동일
 *	접근지정어 : 확대만 가능
 *
 *		오버라이딩 상속 예외조건 : static(사용은 가능하나 상속 불가, 공유변수), private(상속은 가능, 접근을 불가->protected로 접근도 가능), 생성자, 초기화블록 || 맴버변수(인스턴스, 변수값 변경[변수 오버라이딩]), 메소드(기능변경[메소드 오버라이딩])
 */

/*
 * 메소드의 종류
 * 	1. 인스턴스 메소드 : new에 의해 따라 저장
 *  2. 공통메소드 : static (상속의 예외조건=변경시 전체변경), 오버라이딩 불가
 *  3. 종단메소드 : 확장이 불가능, 변경 불가능.
 *  
 * 접근지정어
 *  public : 생성자, 클래스, 메소드, 인터페이스 -> 다른 클래스와 연결
 *  private : 맴버변수, 데이터 노출 방지(데이터보호) ( get변수명()/set변수명() )
 *  	class A{
 *  		private String name;
 *  		private boolean login;
 *  
 *  class영역
 *  	static 메소드 : 기본은 static메소드/static변수만 사용 가능(인스턴스 메소드/변수는 사용불가). this가 없다.
 *  	인스턴스 메소드 : 인스턴스 메소드/변수, static 변수/메소드 사용 가능. this가 있다.
 */

package com.sist.main;
//import

//class
class ABC{
	public void display1() {}	// 맴버메소드
	public static void display2() {}	//공통메소드
	public final void display3() {}		//종단메소드(변경 불가)
}

class BCD extends ABC{
	public void display1() {}	// 맴버메소드	-> 맴버메소드만 오버라이딩 가능
	//public static void display2() {}	//공통메소드
	//public final void display3() {}		//종단메소드(변경 불가). 따라서 종속 불가능
}

class DGB {
	//this.~~	->	DGB가 가지고있는 변수. 생성자, 맴버 메소드에만 존재(static메소드엔 없음)
	private String name;
	private boolean login;
	private static int age;
	public void display() {
		this.name="홍길동";
		name="";
		age=100;
	}
	public static void aaa() {			//static안에는 static만 사용 권장
		// static은 클래스의 맴버변수가 아닌 공통사용부분을 구사
		System.out.println(age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;			//this는 지역변수와 충돌시 사용. 필수아님
		//name을 다른 변수로 치환해 입력 가능. ~~string n) { name=n }
	}
	public boolean isLogin() {
		return login;
	}
	public void setLogin(boolean login) {
		this.login = login;
	}

}

//main
public class MainClass_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
