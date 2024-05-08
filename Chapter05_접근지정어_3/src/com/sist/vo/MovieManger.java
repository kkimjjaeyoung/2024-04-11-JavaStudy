/*
 * 접근지정어
 * 	private : 자신의 클래스(0), 
 * 	default : 자신의 클래스(0), 같은 패키지(0), 
 * 	protected : 자신의 클래스(0), 같은 패키지(0+다른패키지[상속받는경우]), 
 *  public : 자신의 클래스(0), 같은 패키지(0), 
 *  
 *  맴버변수 : 데이터 보호 목적
 *  메소드 : 다른 클래스와 통신/연결 담당(public)
 *  클래스 : 
 */

package com.sist.main;
import com.sist.vo.*;			//package가 다르면 import로 클래스 읽기

	/*
	 * 인스턴스 변수 : class A{ [접근지정어] 데이터형 변수명; 클래스 블록안에 선언}
	 * 정적변수 : class A{ [접근지정어] static 데이터형 변수명; } 클래스 블록 안에서만선언 가능
	 * 지역변수 : void display(){ 데이터형 변수명; }	메소드 안에 선언. 접근지정으로 사용 불가. static 사용 불가. final로 유일하게 사용 가능
	 * 맴버변수 : static, 인스턴스변수. 자동초기화
	 */
/*
 * Method area : 메소드, static변수 저장	->	메소드 안에서만 사용가능
 * stack : 지역변수, 매개변수 -> 메모리 자체 관리, 메소드 안에서만 사용 가능
 * heap ; 배열, 클래스 맴버변수	->	프로그래머가 관리
 */
 
import java.io.FileReader;
import java.util.*;

import Movie;

ieManger {
	public static Movie[] movies=new Movie[1938];		//static은 변경이 없는경우. 모든 사용자가 같은 내용을 보는(고정) 경우. 인스턴스 변수는 각 따로 저장(new). private를 이용해 은닉화
	/*
	 * 초기화
	 *  생성자 : 인스턴스 변수에 대한 초기화
	 *  초기화블록 : static블록을 사용하는 것이 편함.	
	 *  		static은 new를 사용하지 않는다
	 */

	static {							//static에 대한 초기화 블록. 컴파일러가 자동 처리(호출하지 않는다)
		try{
			FileReader fr=new FileReader("C:\\javaDev\\movie.txt");
			StringBuffer sb=new StringBuffer();		//읽어온 모든 문자를 저장
			int i=0;								// 문자번호를 읽어온다.
			
			while((i=fr.read())!=-1) {		//-1 EOF(End Of File)
				sb.append((char)i);
			}
			fr.close(); 					//파일닫기
			
			
			
		}
		catch(Exception ex) {ex.printStackTrace();}
	}
	public static Movie[] getMovieData(int page) {
		Movie[] movie=new Movie[20];
		int leng=20;
		if(page==total) {
			leng=18;
		}
		Movie[] movie=new Movie[leng];
		
		int j=0;
		int rowSize=20;
		int pagecnt=(page*rowSize)-rowSize;
		for(int i=0; i<movies.length; i++) {
			if(j<20 && i>=pagecnt) {
				movie[j]=new Movie();
				movie[j]=movies[i];
				j++;
			}
		}
		return movie;
		
	}
	static int movieTotalPage() {
		return (int)(Math.ceil(movies.length/20.0));		//ceil : 올림메소드. .0이상이면 올림한다.	->	총페이지
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
