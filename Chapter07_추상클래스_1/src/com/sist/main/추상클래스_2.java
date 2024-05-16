package com.sist.main;


abstract class Button{
	public abstract void click();		//button을 공통기반으로 선언
}

class Login extends Button{
	@Override
	public void click() {
		System.out.println("로그인 요청");
	}
}
class Join extends Button{
	@Override
	public void click() {
		System.out.println("회원가입요청 ");
	}
}

public class 추상클래스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn=new Login();
		
		btn=new Join();
		btn.click();
		btn=new Login();
		btn.click();
	}

}
