package 실습문제;

import java.util.Scanner;

public class 자바제어문_1회차문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("달을 입력하세요:");
		int tip=scan.nextInt();
		if(tip>=1 && tip <=12) {
			switch (tip) {
			case 12:
			case 1:
			case 2:	
				System.out.println("봄");
				break;
			case 3:	
			case 4:	
			case 5:	
				System.out.println("여름");
				break;
			case 6:	
			case 7:	
			case 8:	
				System.out.println("가을");
				break;
			case 9:	
			case 10:
			case 11:	
				System.out.println("겨울");
				break;
			}
		}
		else {
			System.out.println("1~12의 수를 입력해주십시오");
		}
	}

}
