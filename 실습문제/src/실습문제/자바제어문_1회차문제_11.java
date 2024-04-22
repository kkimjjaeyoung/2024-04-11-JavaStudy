package 실습문제;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class 자바제어문_1회차문제_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=0;
		while(true) {
			System.out.print("1~100정수입력:");
			num=scan.nextInt();
			if (num<0 || num>100) {
				System.out.println("잘못된 입력");
				continue;
			}
			break;
		}
		if (num>=60)
			System.out.println("합격");
		else 
			System.out.println("불합격");
	}

}
