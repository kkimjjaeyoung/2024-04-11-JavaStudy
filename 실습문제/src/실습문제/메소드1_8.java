package 실습문제;

import java.util.Scanner;

public class 메소드1_8 {
	static char mun8(int score) {
		char c=' ';
		switch(score/10) {
		case 10: case 9:
			
			break;
		case 8:
			c='B';
		break;
		case 7:
			c='C';
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력:");
		String str=scan.next();
		char c=mun8(85);
		
	}

}
