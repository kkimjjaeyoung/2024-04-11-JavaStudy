/*
 * 객체지향 프로그램 (객체지향 3대 특성. 권장사항)
 *  1. 데이터호보(캡슐화로 데이터은닉 및 메소드를 통한 접근)
 *  2. 상속(기존의 클래스를 재사용)
 *  	->상속 : 변경하여 사용할 때(상위클래스 메모리 할당 후 하위메모리 할당으로 메모리 누수 발생. 상위클래스에 맞춰야해 제약이 큼. 결합성이 크다[서로간 영향이 커짐], 속도가 느려짐)
 *  	|	포함 : 있는 그대로 사용할 때(사용빈도가 더 높음)
 *  3. 다형성(오버로딩, 오버라이딩) : 
 *  	->재사용, 수정, 추가 (유지보수)가 편리하다
 *  		오버로딩(new) : 새로운 기능 추가.			|  메소드명만 동일
 *  		오버라이딩(modify) : 기존의 기능을 변경.	|	리턴형, 매개변수, 베소드명, 접근지정어 동일.
 *  
 * 클래스 구성요소 
 * 	1. 설계(필요한 데이터 추출) : 변수
 * 	2. 기능(필요한 기능 추출) : 메소드
 * 		->	필요시 초기화 가능(생성자. 생략가능)
 * 	->메모리에 저장하여 인스턴스 생성. 사용해 객체 생성
 * 
 * class classname{
 	//클래스 영역에서는 제어문, 연산처리, 값을 다시 대입 불가능. 선언 혹은 선언과 동시에 값 대입만 가능
 * 변수 : 
 * 		인스턴스 변수(맴버변수, heap영역에 저장) : 따로 메모리 영역을 만들어서 저장(new를 이용). 클래스는 1개 정보를 설정. 접근시 '클래스명 객체명=new 클래스명()'
 * 		static변수(공통변수, Method Area에 저장. 메모리 1개만 생성.) : 컴파일러에 의해 생성. 접근시에는 '클래스명.변수명'
 * 메소드 : 변수의 활용(사용자 행위, 응답)		
 * 초기화 : 생성자/static블록	->	생략가능(컴파일러 자동 생성자 추가)
 * }
 * 
 * new 연산자 : 메모리에 변수/메소드가 동시에 저장
 */

package com.sist.main;

//class

public class Chapter06_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
