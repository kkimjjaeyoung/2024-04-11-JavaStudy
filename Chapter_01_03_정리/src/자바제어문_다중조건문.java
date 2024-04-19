/*
 *  다중조건문 if , if else, else 
 */


import java.util.Scanner;

public class 자바제어문_다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		for(;;) {							//무한루프
		System.out.println("메뉴");
		System.out.println("1. 노래 목록 보기");
		System.out.println("2. 영화 상세보기");
		System.out.println("3. 영화 검색");
		System.out.println("4. 영화 추천");
		System.out.println("5. 영화 예약");
		System.out.println("6. 종료");
		System.out.println("=============");
		
		int menu=scan.nextInt();
		if(menu==6) {
			System.out.println("프로그램 종료");
			break;
		}
		if(menu==1) {
			System.out.println("영화 목록 출력");
		}
		else if(menu==2) {
			System.out.println("영화 상세보기 출력");
		}
		else if(menu==3) {
			System.out.println("영화 검색 목록 출력");
		}
		else if(menu==4) {
			System.out.println("영화 추천 목록 출력");
		}
		else if(menu==5) {
			System.out.println("영화 예약하기");
		}
		}
	}

}
