/*
 * 인터페이스 : 추상클래스 보완, 일종
 * 	설계와 관련, 표준화, 독립적사용 가능, 클래스를 묶어서 관리, 결합성이 낮음
 * 		1. 윈도우 프로그램 : 이벤트 처리
 * 		2. 컬랙션 : 데이터를 모아서 쉽게 관리(자료구조)
 * 		3. 데이터베이트 : 연결, 닫기, SQL문장
 * 		4. 웹 프로그램에서 요청받기/요청처리/결과값 전송
 * 			확인 : new를 사용하지 않고 객체생성하면 인터페이스(추상클래스와 인터페이스는 객체생성/new사용 불가능)ㄴ
 * 	형식/구성요소
 * 	[접근지정어] interface 인터페이스명 {
 * 		//다른클래스와 연결을 위해 public 주로 사용. 생성자가 없어 변수가 없다.
 * 		(public static final) 데이터형 상수명			//()는 없는경우 자동추가/생략가능
 * 		//구현안된메소드
 * 		(public abstract) 리턴형 메소드형(매개변수)		//자동추가
 * 		//구현된 메소드
 * 		(public) default 리턴형 메소드명(매개변수)			//자동추가. default는 반드시 서술
 * 			->default/static 구현 가능
 * 			->유지보수(전에 개발된경우엔 사용 불가)
 * 			->권장(메소드 선언ㅁ나)
 * 	}
 * 	->인터페이스도 상위 클래스 개념
 * 		1. 인터페이스 -> extends -> 인터페이스		//다중상속가능
 * 			interface A, b;			interface C extends A, B;
 * 		2. 인터페이스 -> 클래스			//다중상속 가능
 * 			interFace A, B;			class C implements A, B
 * 		3. 클래스 -> 클래스				//단일상속만 지원
 * 			class A;				class B extends B
 * 		4. 혼합 (윈도우 등에서만 등장. **특별한 경우가 아닌 경우)
 * 			interface A, B; class C			class D (클래스 상속) (인터페이스 상속)			class D extends C implements A, B			
 * 			
 * 		
 */
public class 인터페이스_2 {

}
