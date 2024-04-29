/*
 * 1. 클래스와 구성 요소
 * 	class ClassName{ 변수(데이터저장=캡슐화), 생성자(변수에 대한 초기화), 메소드(데이터를 활용하는 기능 }
 * 		1)기능 설정 : 단락을 만들어 처리(메소드[클래스 종속], c에선 함수[독립적으로 사용])
 * 		2)데이터 저장 : 변수(하나), 배열(여러개, 같은 데이터형), 클래스(사용자정의 데이터형, 다른 데이터형)
 * 			데이터 처리(가공) : 연산자, 제어문, 메소드(연산자+제어문, 명령문의 집합), 구조적 프로그램(단락, 재사용)
 * 			요청 결과 전송 : 
 * 
 *  	1^. 메소드 : 기능별로 묶음(기능별 구분, 재사용성, 가독성 향상[에러처리 편리])
 *  				: 기능별 처리, 다른 클래스에 연결해 재사용, 반복 제거
 *  		1. 메소드 형식
 *  			선언문 : [접근지정어][옵션] 리턴형(결과값) 메소드명(매개변수...) {
 *  					 //구현
 *  					}
 *  						리턴형(결과값) : 모든 메소드가 가짐. 요청에 대한 처리 결과를 넘겨준다. 리턴형은 1개 사용만(데이터가 많은 경우 묶어서)
 *  						매개변수(요청값) : 사용자 요청값.
 *  						메소드명 : 알파벳, 한글로 시작(대소문자 구분), 숫자사용 가능(앞에는 불가), 키워드 사용 불가, 특수문자 사용(_ , $ ), 공백 사용 불가. 변수는 중복사용 불가능(한 메소드에서 같은 변수 사용 불가),같은 메소드 이름 사용 가능
 *  							->	암묵적 룰 : 소문자로 시작, 단어가 2개일 때 두번째 시작하는 단어 대문자로 혹은 언더바
 *  							메소드 유형 : 리턴형, 매개변수,  
 *  		2. 메소드 사용법
 *  			호출방법
 *  			1)결과값이 있는 경우 :  데이터형 변수명=메소드명(매개변수)
 *  			2)결과값이 없는 경우 : 매소드명(매개변수)
 *  		3. 반복 제거
 *  			오라클 연결, 문장(전송), 오라클 닫기 	->	(select), (insert), (update), (delete)반복	
 *  			형식 : [접근지정어][옵션] 리턴형 메소드명([매개변수]...) {
 *  					.....기능구현
 *  					결과값 전송
 *  					return값;	->	값은 개만 사용 가능. 	데이터가 많은 경우 [] 로 보낸다
 *  					}
 *  				모든 메소드는 return으로 종료. void일 경우 생략 가능
 *  			클래스 : 사용자 데이터형(~VO, ~DTO, ~Bean), 액션 클래스(~DAO, ~Manager)
 */

public class 메소드1 {
	//자동 메모리 할당->메소스 메모리에 저장해 사용
	//void : 자체 처리. 출력을 메소드 안에서 처리
	static void display(String name) {
		System.out.println("display : 진입");
		System.out.println("사용자가 보내준 값:"+name);
		System.out.println("display : 처리완료");
		System.out.println("display : 종료" );
		
	}
	public static void main(String[] args) {
		System.out.println("display 진입전");
		display("홍길동");
		System.out.println("공란");
		System.out.println("display 진입전");
		display("심청이");
		
	}

}
