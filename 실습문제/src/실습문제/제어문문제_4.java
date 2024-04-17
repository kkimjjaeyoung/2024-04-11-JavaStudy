package 실습문제;

import java.util.Scanner;
public class 제어문문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.printf("정수 입력:");
		
		int year=scan.nextInt();
		if((year%4==0 && year%100!=0) || (year%400==0)) {
			System.out.println(year+"년도는 윤년입니다");
		}
		else { 
			System.out.println(year+"년도는 윤년이 아닙니다");
		}
	}

}
