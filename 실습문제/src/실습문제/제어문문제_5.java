package 실습문제;

import java.util.Scanner;
public class 제어문문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.printf("점수 입력:");
		
		int score=scan.nextInt();
		if(score>=90 && score<=100) {
			System.out.println("A학점입니다");
		}
		if((score<90) && (score>=80)) {
			System.out.println("B학점입니다");
		}
		if((score<80) && (score>=70)) {
			System.out.println("C학점입니다");
		}
		if((score<70) && (score>=60)) {
			System.out.println("D학점입니다");
		}
		if((score<60) && (score>=0)) {
			System.out.println("F학점입니다");
		}
		if((score<0) || (score>100)) {
			System.out.println("범위 내의 값을 입력해 주십시오");
		}
		
	}

}
