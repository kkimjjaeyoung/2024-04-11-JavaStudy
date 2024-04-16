package 실습문제;

import java.util.Scanner;

public class 연산자문제_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		/*
		 * int a, b; System.out.println("첫 번째 정수");
		 * a=scan.nextInt();
		 * System.out.println("두 번째 정수");
		 * b=scan.nextInt();
		 * 
		 * System.out.println("결과값:"+(a%b));
		 */
		
		int num1=(int)(Math.random()*100);
		int num2=(int)(Math.random()*100);
		
		System.out.println("결과값");
		System.out.printf("%d %% %d = %d\n", num1, num2, num1%num2);
		
	}

}
