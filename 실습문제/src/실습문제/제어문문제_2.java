package 실습문제;

import java.util.Scanner;
public class 제어문문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.printf("정수 입력:");
		
		int a=scan.nextInt();
		if((a%3==0) && (a!=0)) {
			System.out.println(a+"는(은)3의 배수입니다");
		}
		else {
			System.out.println(a+"는(은)3의 배수가 아닙니다.");
		}
		
	}

}
