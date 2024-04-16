package 실습문제;

import java.util.Scanner;

public class 연산자문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a, b; a = 6; b = 2; System.out.printf("덧셈 연산 결과: %d \n", a+b);
		 * System.out.printf("뺄셈 연산 결과: %d \n", a-b);
		 * System.out.printf("곱셈 연산 결과: %d \n", a*b);
		 * System.out.printf("나누기 연산 결과: %d \n", a/b);
		 * System.out.printf("나머지 연산 결과: %d \n", a%b);
		 */
		
		int money=369;				//100= 몇 개
		int won100=money/100;		//10= 몇 개
		int won10=(money%100)/10;	//1= 몇 개
		int won1=money%10		;	// %는 윤년구하기
		System.out.println("100원 동전:"+won100);
		System.out.println("10원 동전:"+won10);
		System.out.println("1원 동전:"+won1);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");
		int year=scan.nextInt();
		
		if((year%4==0 && year%100!=0) || (year%400==0)) {
			System.out.println((year+"년도는 윤년입니다"));
		}
		if(!(year%4==0 && year%100!=0) || (year%400==0)) {
			System.out.println((year+"년도는 윤년이 아닙니다"));
		}
		
	}

}
