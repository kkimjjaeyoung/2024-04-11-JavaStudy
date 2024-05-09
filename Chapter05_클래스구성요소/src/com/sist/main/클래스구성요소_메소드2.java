package com.sist.main;

import java.util.*;

class Diary2{
	private int year;				//private는 이 클래스 안에서만 사용 가능.
	private int month;
	private int week;
	private int lastday;
	
	public int input(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		return scan.nextInt();
	}
	
	public int getweek() {
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		/*
		 * 상수=static final(모든 프로그램에서 공유)
		 * 상수형=final(클래스내에서 사용)
		 */
		week=cal.get(Calendar.DAY_OF_WEEK)-1;
		lastday=cal.getActualMaximum(Calendar.DATE);
		
		return week-1;
		/*
		 * Calandar는 week 배열이 1부터 시작
		 */
	}
	
	
	public void print() {
		System.out.println(year+"년도 "+month+"월");
		String[] strWeek= {"일", "월", "화", "수", "목", "금", "토"};
		for(String s:strWeek) {
			System.err.print(s+"\t");			//err은 에러(빨간색)출력
		}
		System.out.println("\n");
		for(int i=1; i<=lastday; i++) {
			if(i==1) {
				for(int j=0; j<week; j++) {		//공백
					System.out.print("\t");
				}
			}

			System.out.printf("%2d\t", i);
			
			week++;
			if(week>6) {
				week=0;
				System.out.println();
			}
			
		}
	}
	
	public void process() {
		int year=input("년도");
		int month=input("월");
		getweek();
		print();
	}
}


public class 클래스구성요소_메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diary2 d=new Diary2();
		d.process();
	}

}
