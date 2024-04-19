package 실습문제;

import java.util.Scanner;

public class 자바1주정리_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int even=0;
		for (int i=1; i<=10; i++) {
			System.out.println(i+"정수");
			int num=scan.nextInt();
			if (num%2==0) {
				even++;
				}
		}
		System.out.println(even);
	}

}
