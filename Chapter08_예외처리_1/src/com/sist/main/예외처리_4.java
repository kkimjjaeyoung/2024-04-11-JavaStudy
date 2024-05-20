package com.sist.main;

import java.util.*;

class A1{
	
}

class B1 extends A1{
	
}

public class 예외처리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			A1 a=new A1();
			B1 b=(B1)a;
		}
		catch(ArithmeticException e) //0으로 나눌때 에러 처리
		{
			
		}catch(ArrayIndexOutOfBoundsException e) //배열범위 초과시에만 처리
		{
			
		}catch(NumberFormatException e) //문자열을 정수로 변환할때 오류처리
		{
			
		}catch(RuntimeException e) {
			// 위 3개를 포함. 포함영역이 클수록 아래로 배치
		}
		System.out.println("프로그램 종료");
	}

}
