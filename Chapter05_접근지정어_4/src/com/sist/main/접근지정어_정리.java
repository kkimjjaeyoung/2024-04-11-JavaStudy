package com.sist.main;
/*
 * 데이터저장 -> 데이터 처리 -> 화면에 출력
 * 	데이터저장 
 * 		1. 변수
 * 		2. 배열
 * 		3. 클래스
 * 	데이터처리
 * 		1. 연산자
 * 		2. 제어문
 * 		3. 메소드
 * 	화면출력
 * 		1. 명령프롬프트 : sysout
 * 		2. 윈도우	: JFrame
 * 		3. 브라우저 : HTML
 * 
 * 1. 묶기
 * 	데이터 묶기
 * 		배열
 * 		클래스 : 변수만 설정(getter/setter)
 * 	명령문 묶기 
 * 		메소드 : ~Manager
 *  동시에 묶기
 *  	클래스 : 
 * 2. 사용범위 지정(접근지정어)
 * 	private : 자신의 클래스 내에서 접근 가능(데이터를 감추는 경우/은닉화)
 * 	default : 같은 패키지안에서만 접근 가능
 * 	protected : 같은 패키지 안에서만 접근 + 상속받은경우의 다른 패키지
 * 	public : 패키지 상관없이 모든 클래스에서 접근 가능
 * 		private/public(공개/비공개)
 * 			class main{ public JButton b=new Jbutton(")}		//로그인버튼, 공개	->	윈도우관련(버튼/텍스트필드) 공개	-> public
 * 			class member { private string id; private string pw; }		//id, pw, 비공개	->	개인정보 비공개			-> private
 * 
 * 	패키지 : 관련 큰래스를 묶어서 관리(검색 편리, 분업 효율성)
 * 		패키지는 클래스 구분 홀더
 * 		식별자 사용 : 알파벳(소문자), 숫자는 앞에 사용 불가, 키워드 사용 불가, 특수문자 사용빈도 극히 적음, 공백 불가
 * 		실무 : dao(DB 연결), manager(외부 API. 파일, 이메일 등), vo(데이터형. 사용자정의), service(BI. 통합,조립), controller(브라우저와 연결)
 * 			패키지는 반드시 첫번째쭐에 사용(한번만)
 * 			불러오는법 : import com.블라블라.dao.*;	->	dao폴더 안의 모든 클래스 불러오기
 * 						import com.블라블라.dao.BoardDAO	->	BoardDAO 한개를 불러온다
 * 				패키지가 다를 경우 같은 이름의 클래스 생성 가능
 * 					충돌 : import java.util.*;
 * 							import java.sql.*;			//둘 다 date가 있을 때
 * 							Date date=new Date();	->	오류발생(지정되지 않음)
 * 
 * 			클래스 : 설계
 * 			메소드 : 기능설정
 * 			생성자 : 시작점, 초기화
 * 			변수 : 화면 출력할 데이터를 모아준다
 * 
 * 
 */

public class 접근지정어_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
