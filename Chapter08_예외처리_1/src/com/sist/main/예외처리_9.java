/*
 * 1. 반복문장이 많다 -> 제거
 * 재사용, 다른 클래스에서 연결
 * 		->메소드
 * 2. 관련된 클래스 여러개 -> 한개의 객체명으로 처리
 * 		-> 인터페이스
 * 3. 비정상종료 없이 프로그램 유지 
 * 		-> 예외처리
 * 
 * 	변수->배열/클래스
 *  명령문(연산자, 제어문)->메소드
 *  필요시 변수 초기화->생성자
 *  클래스 여러개->인터페이스
 *  에러처리->예외처리
 *  윈도우->상속->오버라이딩(인터페이스)
 *  
 *  	예외처리
 *  		1. 파일 입출력
 *  		2. 네트워크
 *  		3. 오라클 연동(데이터를 모아두는 장소.)
 * 1. 생략이 가능
 * 		=import hava.lang.*;
 * 		=void -> return
 * 		=생성자 생략 가능(자동 추가)
 * 		=extends Object
 * 		=실행시 파일에서 예외처리 생략 가능
 * 		
 * 		interface ( 인터페이스의 접근지정어는 전부 퍼블릭)
 * 			=상수, 추상메소드, default, static
 *		구조 : 
 *			interface A{
 *				//public static final// int a=10;
 *					->//public//static final int A=100;
 *
 *				//public abstract// void disp();
 *					-> public //abstract// void disp();
 *
 *				//public// default void aaa(){}
 */

package com.sist.main;

interface ABC{
	int AA=100;			//public 생략됨
}

public class 예외처리_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
