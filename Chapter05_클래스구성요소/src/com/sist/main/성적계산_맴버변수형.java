package com.sist.main;

import java.util.Scanner;


class Student2{
	//기본변수
	private int kor, eng, math, total;
	private double avg;
	private char score;
	//사용자입력
	public int input(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.println(msg+"입력:");
		return scan.nextInt();
	}
	//총점(total)
	public void totalData() {
		total=kor+eng+math;	
	}
	//평균(avg)
	public void avgData() {
		avg=total/3.0;
	}
	//학점(score)
	public void scoreData() {
		switch(total/30) {
		case 10: case 9:
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
	}	
	public void print() {
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균점수:%.2f\n", avg);
		System.out.println("학점:"+score);
	}
	public void process() {
		int kor=input("국어");
		int eng=input("영어");
		int math=input("수학");
		totalData();		//총점
		avgData();
		scoreData();
		
		print();
	}
	
}

public class 성적계산_맴버변수형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.process();
	}

}
