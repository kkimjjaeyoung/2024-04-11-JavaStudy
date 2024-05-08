/*
 * 객체지향 프로그램 -> 자바(CBD)	->	존재하는 기능을 조립해서 만드는 프로그램
 * 	//기본문법
 * 	1. 클래스
 * 		변수설정(필요 데이터 선정) : 캡슐화(데이터보호. getter/setter)
 * 			기본형 -> 정수, 실수, 논리, 문자 
 * 			배열 -> 
 * 			클래스 -> 포함 클래스(String 데이터형)
 * 		변수 초기값 : 생성자(서버/데이터베이스)
 * 		변수 활용 : 메소드(기능 : 수정/추가) -> 다형성(오버로딩/오버라이딩)
 *  2. 접근지정어 
 *  	public/private/protected/default (접근지정범위)
 *  3. 상속/포함 (재사용 기법)
 *  	포함(있는 그대로 사용) -> Spring
 *  	상속(변경해서 사용)	-> 윈도우, 네트워크, 쓰레드
 *  		---객체지향 3대 특성(캡슐화, 상속, 다형성)
 *  4. 클래스 종류
 *  	*일반 클래스 : 
 *  	추상 클래스 : 
 *  	*인터페이스 : 
 *  	내부 클래스
 *  		*맴버 클래스
 *  		*익명의 클래스
 *  		지역 클래스 
 *  	종단 클래스
 *  5. 조립법
 * 		패키지(관련 클래스를 모아서 관리) : import,
 *  6. 예외처리 : 프로그램 비정상 종료 방지, 사전 에러 방지
 *  7. 라이브러리(자바) : 외부에서 지원(Jsoup, lombok)
 *  
 */

/*
 * 접근지정어 
 * 	private
 * 	default
 * 	protected
 * 	public 
 */

class Sawon{
	private int hakbun;
	private String name;
	private String sex;
	// 읽기: getter, 쓰기: setter
	
}

public class 접근지정어_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
