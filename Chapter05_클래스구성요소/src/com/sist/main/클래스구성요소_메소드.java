/*
 * 메소드 : 기능별 분리해 재사용, 수정이 쉽고 수가가 가능해 유지보수가 편해져 분업이 가능하다. -> 다른 클래스와 연결해 사용
 */

package com.sist.main;

import java.util.*;
// Diary.class / 클래스구성요소_메소드
class Diary
{
	public int input(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		return scan.nextInt();
	}
	
	public int getweek(int year, int month) {
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		/*
		 * 상수=static final(모든 프로그램에서 공유)
		 * 상수형=final(클래스내에서 사용)
		 */
		int week=cal.get(Calendar.DAY_OF_WEEK);
		
		return week-1;
		/*
		 * Calandar는 week 배열이 1부터 시작
		 */
	}
	
	public int getLastDay(int year, int month) {
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		int lastday=cal.getActualMaximum(Calendar.DATE);
		
		return lastday;
	}
	
	public void print(int year, int month, int week, int lastday) {
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
		int week=getweek(year, month);
		int lastday=getLastDay(year, month);
		print(year, month, week, lastday);
	}
	// 요일 구하기 
	// 달력 출력 => 전역변수 없이 => 전역변수(멤버변수)
}


//public이 있는 클래스가 저장명이 된다 => 자바는 파일명=클래스명이 동일 
public class 클래스구성요소_메소드 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Diary d=new Diary(); // input => 저장 
		 Scanner scan=new Scanner(System.in);
		 while(true) {
			 d.process();
			 System.err.print("\n종료할까요?(y/n)");
			 char end=scan.next().charAt(0);
			 if(end=='y' || end=='Y') {
				 System.out.println("프로그램 종료");
				 System.exit(0);
			 }
		 }
		}
}
