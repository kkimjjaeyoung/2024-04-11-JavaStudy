package com.sist.music;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		MusicSystem ms=new GenieMusic();
		ms.init();
		
		while(true) {
			System.out.println("메뉴");
			System.out.println("1. 목록");
			System.out.println("2. 상세보기");
			System.out.println("3. 검색");
			System.out.println("4. 종료");
			System.out.println(" d ");
			System.out.println("메뉴 선택");
			int menu=scan.nextInt();
			switch(menu) {
			case 1:
				ms.list();
				break;
			case 4:
				System.out.println("프로그램 종료");
				System.exit(0);
			case 2:
				System.out.println("번호 선택(1~50)");
				int no=scan.nextInt();
				ms.detail(no);
				break;
			case 3:
				System.out.println("검색어 입력:");
				String title=scan.next();
				
			}
		}
	}

}
