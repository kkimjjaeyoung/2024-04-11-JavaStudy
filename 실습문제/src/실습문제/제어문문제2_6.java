package 실습문제;

import java.util.Scanner;

public class 제어문문제2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		
		int c=0;
		int a=scan.nextInt();
		for (int b=1; b<=a; b++) {
			c+=b;
		}
		System.out.print("1~"+a+"까지의 합:"+c);
		
		
		
	}

}
