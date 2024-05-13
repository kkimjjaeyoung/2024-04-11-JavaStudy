package com.sist.main;

class Movie {
	void display() {
		
	}
}

class MegaBox extends Movie {
	//int display() {}		->		오류. 리턴형이 동일해야함
	int display(int a) {		
	return 10;				// 오버라이딩이 아닌 오버로딩이 됨. 상속이 아닌 다른 메소드 선언
	}
	void display() {}		//오버라이딩. 
	/*오버라이딩 조건
	 * 1. 상속 : 재정의(메소드내용을 변경해 사용)
	 * 2. 메소드명이 동일
	 * 3. 매개변수가 동일(매개변수가 다르면 메소드가 다른것을 정의->오버로딩)
	 * 4. 리턴형이 동일
	 * 5. 접근지정어가 동일/확대가 되야 한다.( private < default < protected < public )
	 * 		->상속이 여러개일때 가장 큰 클래스를 상속
	 */
}


public class MainCalss_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
