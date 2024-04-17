package 제어문;
/*
 * if~ else if : if가 아닐경우 else if~~~ 전부 아닐경우 else(생략가능)
 * 			if~else->단일조건문->다중조건문(대체:switch~sace)
 * 		
 */

//성적(학점)계산->다중조건문
import java.util.Scanner;
public class 제어문_조건문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);	//new->클래스 메모리 저장, system.in->키보드 입력값
		System.out.printf("국어점수:");
		int kor =scan.nextInt();	//nextInt : 정수값만 입력 가능
		System.out.printf("영어점수:");
		int eng =scan.nextInt();
		System.out.printf("수학점수:");
		int math =scan.nextInt();
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		System.out.println("총점:"+(kor+eng+math));
		System.out.printf("평균:%.2f\n",(kor+eng+math)/3.0);
		
		char score='A';				//기초값 필요
		int avg=(kor+eng+math)/3;
		if (avg>=90) {
			score='A';
		}
		else if (avg>=80) {
			score='B';
		}
		else if (avg>=70) {
			score='C';
		}
		else if (avg>=60) {
			score='D';
		}
		else if (avg<60) {
			score='F';
		}
		System.out.println("학점:"+score);
		
	}

}
