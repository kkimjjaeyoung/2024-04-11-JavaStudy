/*
 *  4칙연산 프로그램
 *   변수 3개(값, 연산자, 값)
 */

import java.util.Scanner;
public class 제어문_단일조건문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num1, num2;
		char op;
		
		System.out.println("첫번째 정수 입력:");
		num1=scan.nextInt();
		System.out.println("연산자 입력(+,-,*,/:");
		op=scan.next().charAt(0);
		System.out.println("두번째 정수");
		num2=scan.nextInt();
		
		if(op=='+') {
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		}
		if(op=='-') {
			System.out.println(num1+"-"+num2+"="+(num1+num2));
		}
		if(op=='*') {
			System.out.println(num1+"*"+num2+"="+(num1+num2));
		}
		if(op=='/') {
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다");
			}
			if(num2!=0) {
				System.out.println(num1+"/"+num2+"="+(num1+num2));
			}
		}
	}

}
