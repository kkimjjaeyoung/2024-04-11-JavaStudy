package com.sist.user;

import java.util.*;
import com.sist.manager.*;
import com.sist.vo.*;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		MovieManager mgr=new MovieManager();
		
		while(true) {
			System.err.println("메뉴");
			System.out.println("1. 목록");
			System.out.println("2. 검색");
			System.out.println("3. 상세보기");
			System.out.println("4. 종료");
			System.out.println();
			System.out.println("메뉴선택:");
			int menu=scan.nextInt();
			if(menu==1) {
				int total=mgr.movieTotalPage();
				System.out.print("1~"+total+"사이의 페이지 입력:");
				int page=scan.nextInt();
				Movie[] movie=mgr.movieListData(page);
				for(Movie m:movie) {
					System.out.println(m.getRank()+"."+m.getTitle());
				}
			}
			else if(menu==2) {
				System.out.println("검색어 입력:");
				String title=scan.next();
				Movie[] movie=mgr.movieFindData(title);
				for(Movie m:movie) {
					System.out.println(m.getRank()+"."+m.getTitle());
				}
			}
			else if(menu==3) {
				System.out.print("번호입력:");
				int mno=scan.nextInt();
				Movie mmm=mgr.movieDetailData(mno);
				   System.out.println("순위:"+mmm.getRank());
				   System.out.println("영화명:"+mmm.getTitle());
				   System.out.println("감독"+mmm.getDirector());
				   System.out.println("출연:"+mmm.getActor());
				   System.out.println("장르:"+mmm.getGenre());
				   System.out.println("등급:"+mmm.getGrade());
				   System.out.println("개봉일:"+mmm.getRegdate());
			}
			else if(menu==4) {
				
			}
			else {
				System.out.println("없는 메뉴입니다");
			}
		}
		
	}
}
