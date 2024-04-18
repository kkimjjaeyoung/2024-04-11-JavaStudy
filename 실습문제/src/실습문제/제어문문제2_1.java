package 실습문제;

import java.util.Scanner;

public class 제어문문제2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.printf("점수 입력:");
		int score=scan.nextInt();
		int a=score/10;
		char gra=' ';
		if (score>10 && score<0) { 
			System.out.println("다시 입력");
		}
		else {
		switch (a) {
		case 10:
		case 9 :
			gra='A';
			break;
		case 8:
			gra='B';
			break;
		case 7:
			gra='C';
			break;
		case 6:
			gra='D';
		break;
		default:
			gra='F';
		}
		System.out.println("학점:"+gra);
		}
	}

}
/*
 *	값 1개씩 여러개인 경우 switch, 범위가 있는 경우 if 
 */
