package 선택문;

import java.util.Scanner;

public class 제어문_선택문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어점수입력:");
		int kor=scan.nextInt();
		System.out.println("영어점수입력:");
		int eng=scan.nextInt();
		System.out.println("수학점수입력");
		int math=scan.nextInt();
		
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+(kor+eng+eng));
		System.out.printf("평균:%2f\n", (kor+math+eng));
		
		int avg=(kor+eng+math)/30;
		char score=' ';
		switch(avg) {
		case 10:
		case 9:
			score='A';
			break;
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
			default:
				score='F';			
		}
		System.out.println("학점:"+score);
	}

}
