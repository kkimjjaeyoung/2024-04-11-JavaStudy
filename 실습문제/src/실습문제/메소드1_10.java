package 실습문제;

import java.awt.print.Printable;
import java.util.Scanner;

public class 메소드1_10 {
	static void process() {
		Scanner scan=new Scanner(System.in);
		System.out.println("첫 번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.println("두 번째 정수 입력:");
		int num2=scan.nextInt();
		
		if(num1>num2) {
			System.out.println(num1);
		}
		else if(num1<num2) {
			System.out.println(num2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
