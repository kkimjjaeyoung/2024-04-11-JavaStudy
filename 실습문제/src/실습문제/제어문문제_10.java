package 실습문제;

import java.util.Scanner;

public class 제어문문제_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("달 입력");
		
		int mon=scan.nextInt();
		if(mon>=1 && mon<=12) {
			if(mon>=3 && mon <=5) {					// if (mon==3 || mon==4 || mon==5)
				System.out.println("봄");
			}
			else if(mon>=6 && mon<=8) {
				System.out.println("여름");
			}
			if(mon>=9 && mon <=11) {
				System.out.println("가을");
			}
			if(mon>=12 && mon <=2) {
				System.out.println("겨울");
			}
	}
		else {
			System.out.println("잘못된 입력입니다");
		}
	}
}
