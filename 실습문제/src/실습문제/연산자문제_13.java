package 실습문제;

import java.util.Scanner;

public class 연산자문제_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		/*
		 * int a,b,c; System.out.println("첫 번째 정수"); a=scan.nextInt();
		 * System.out.println("두 번째 정수"); b=scan.nextInt();
		 * System.out.println("세 번째 정수"); c=scan.nextInt();
		 * 
		 * 	System.out.println("결과:"+(a*b+c));
		 */
		
		System.out.println("세 개의 정수 입력(10 20 30");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		System.out.println("==결과==");
		System.out.printf("%d * %d + %d = %d", num1, num2, num3, num1*num2+num3);


	}

}
