/*
 *  1. 형식
 *  2. 동작순서
 *  3. 출력문
 *  
 *  조건문 : 프로그램 제어, 사용자 입력 처리(검색) 
 *  	1. 단일조건문 : if 단독으로 사용. 		if(조건 { 조건에 따른 처리 문장 } 		)) 검색어가 없다, 없는 페이지 
 *  	2. 선택조건문 : 두 개를 나눠서 처리				if(조건문) { true }			else { false } 		)) 로그인 처리(로그인된 경우/안된경우, 아이디중복/중복안됨)			**가장 많이 사용되는 조건문***프로그램 : 웹
 *  	3. 다중조건문 : 조건에 맞는 경우에만 1번 수행 	if (조건문) { true }		else if (조건문) { true }		else if (조건문) { true } 		else { false }			))메뉴작성, 화면이동			1개의 조건만 여러번일땐 단일조건문 다수
 *  반복문 : 여러개의 반복적인 소스코딩(출력 형식이 같은)이 있는 경우			)) 상품목록, 영화목록..
 *  	1. for : 반복횟수가 지정된 경우 		for (초기값; 조건문; 증가식) { 반복 수행문 } 		초기값, 조건문, 수행문, 증가식 순서 		)) 웹 화면 Ui
 *  			초기값 : 시작, 조건식 : 증가시작위치, 증가식 : 시작값부터 증가(대입연산자[+=, -=]로 증가치 조절), 실행문장 : true일때 실행
 *  	2. while : 반복횟수가 없는 경우				// 자바 웹에선 for/while 주로 사용
 *  	3. do~while : 반드시 한번 이상 수행(조건->후조건)
 */
public class 자바제어문_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			System.out.println(i+" ");
		}
		for (int i=10; i>=1; i--) {
			System.out.println(i+" ");
		}
		for (char c='A';c<='Z'; c++) {
			System.out.println(c+" ");
		}
		for (char c='Z'; c>='A'; c--) {
			System.out.println(c+" ");
		}
	}

}
