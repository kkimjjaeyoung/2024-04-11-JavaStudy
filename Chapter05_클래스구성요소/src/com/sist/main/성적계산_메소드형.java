package com.sist.main;
//국영수 점수를 받아 총점, 평균, 학점 출력
import java.util.*;
class Student{
	//반복 제거(반복적인 소스 제거)
	public int input(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+"입력:");
		return scan.nextInt();
	}
	
	public int totalData(int kor, int eng, int math) {
		return kor+eng+math;
	}
	public double avgData(int total) {
		return total/3.0;
	}
	public char scoreData(int avg) {
		char c='A';
		switch(avg/10) {
		case 10: case 9:
			c='A';
		break;
		case 8:
			c='B';
			break;
		case 7:
			c='C';
			break;
		case 6:
			c='D';
			break;
		default:
			c='F';
		}
		return c;
	}
	public void print(int kor, int eng, int math, int total, double avg, char score) {
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균점수:%.2f\n", avg);
		System.out.println("학점:"+score);
	}
	
	public void process() {			//프로그램 실행 
		int kor=input("국어");
		int eng=input("영어");
		int math=input("수학");
		int total=totalData(kor, eng, math);		//총점
		double avg=avgData(total);
		char score=scoreData((int)avg);
		
		print(kor, eng, math, total, avg, score);
	}
}

public class 성적계산_메소드형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.process();
	}

}
