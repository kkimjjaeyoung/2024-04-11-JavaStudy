package 실습문제;

import java.util.Scanner;

public class 제어문문제_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//while(true) {							//반복문 조건
		
		int a=scan.nextInt();
		System.out.printf("2자리수 정수 입력");
		if(a>=10 && a<=99) {
			if(a%11==0) {
				System.out.println("10의 자리와 1의 자리가 같습니다");
			}
			else if(a%11!=0) {
				System.out.println("10의 자리와 1의 자리가 같지 않습니다");
			}
		}
		else {
			System.out.println("값 오류");
		}
		//continue; }							//반복문 조건
	}

}
