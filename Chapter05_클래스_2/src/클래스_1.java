/*
 * 프로그램 
 * 	요구분석->DB설계-> 화면UI->구현->테스트->배포
 * 		필요 데이터(클래스. 설계)->변수
 * 		기능 설정->메소드
 * 	변수의 집합+메소드
 * 1. 객체 지향 프로그램
 * 	1) 변수 설정(관리할 데이터 분류)
 * 	   기능(메뉴, 작동)
 *  3) 설계( class CalssName {} )
 *  4) 클래스 구성 요소( classname~{ 변수묶음, 초기화, 기능 설정 }
 *  	변수묶음
 *  		1. 변수의 종류
 *  			객체변수(인스턴스) : new를 이용해 저장시마다 메모리가 달라진다(저장공간이 따로 생긴다)
 *  			공동변수 : 모든 객체가 동일한 변수 사용. static을 이용해 메모리 공간을 한개만 생성.
 *  		2. 데이터 보호 : 다른 프로그램에서 사용되지 않도록 한다(은닉화)
 *  						자체 프로그램에서 사용 가능(캡슐화)	->	접근지정어
 *  	초기화(변수)
 *  		1. 명시적 초기화(int a=0; -> 특별한 경우가 아님 사용이 적다)
 *  		2. 초기화 블록(인스턴스 블록) : ~classname{		변수	{	인스턴스 블록	}	}
 *  						클래스 영역	~classname {	구현 불가, 선언만 가능. 구현은 {}내에서 사용 가능
 *  									classname{	static 변수 | static	{	static 변수만 초기화 가능(new없이 자동 지정), 허나 저장된 모든 객체가 공통으로 사용하는 변수)
 *  						일반적 초기화 : 생성자(메모리에 저장시 반드시 호출, 클래스명과 동일). [new]
 * 																					연산자(클래스 메모리의 크기 확인, 메모리 확보와 주소를 객체에 전송)
 * 																					new는 사용할때마다 클래스 크기만큼 메모리 생성, 제한은 디스크 크기만큼
 * 																					new 를 이용해 저장되는 내용(변수, 메소드[객체])
 * 		메소드
 * 			1. 일반 메소드(객체 메소드) : 객체마다 따로 저장되는 메소드. 기능처리 등에 사용
 * 				[접근지정어] 리턴형 메소드(매개변수...)
 * 			2. 공통 메소드 : 객체가 동일하게 사용하는 메소드. 
 * 				[접근지정어[ static 리턴형 메소드(매개변수...)
 * 			3. 종단 메소드 : 수정이 불가능한 메소드(string/system/math).
 * 				[접근지정어] final 리턴형 메소드(매개변수...) 			
 * 			4. 추상 메소드 : 선언만 되어 있다(프로그램에 따라 변화되어 사용). 인터페이스, 윈도우 등 
 *  
 *     변수의 종류
 *     	1. 지역변수 : 메소드 호출시 메모리 저장, 메소드 종료시 메모리에서 해제(return시), stack에 저장됨. 메소드 범위 안에서만 사용 가능
 *      2. 인스턴스변수 : new를 이용할경우 메모리 저장, 프로그램 종료시 메모리에서 해제, Heap에 저장, 클래스 전체 사용이 가능
 *      3. 정적변수(static) : 컴파일시 메모리 저장, 프로그램 종료 시 메모리에서 해제, Method Area에 저장됨. 클래스 전체에서 사용 가능
 * 
 */

//클래스에 선언된 변수	
	/*
	 * 각자 사용되는 변수 : 인스턴스 변수
	 * 공통으로 사용되는 변수 : 정적 변수(static)
	 */
//카드에 사용되는 변수
	// number/type(개별), width/height(동일)
class card {							//class 영역에 선언시 프로그램 종료시까지 메모리 유지
	int number;		//0으로 초기화
	String type;	//null로 초기화			
		//아직 저장되지 않음. new를 사용해 저장
	static int width=300, height=500;		//명시적 초기화. 저장됨
}
public class 클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		card card1=new card();
		System.out.println("card1="+card1);//실제 저장된 메모리 주소
		card1.number=3;
		card1.type="♠";
		System.out.println("number="+card1.number);
		System.out.println("type="+card1.type);
		System.out.println("width="+card1.width+"height="+card1.height);
		card card2=new card();
		System.out.println("card2="+card2);//실제 저장된 메모리 주소
		card1.number=5;
		card1.type="♣";
		System.out.println("number="+card2.number);
		System.out.println("type="+card2.type);
		System.out.println("width="+card2.width+"height="+card2.height);
		
		card1.width=300;
		card1.height=500;
		card2.width=500;
		card2.height=1000;
		System.out.println("width="+card1.width+"height="+card1.height);
		System.out.println("width="+card2.width+"height="+card2.height);
		card.width=1200;
		card.height=1500;
		System.out.println("width="+card2.width+"height="+card2.height);
		
		card1.number=7;
		card1.type="♥";
		card2.number=5;
		card2.type="♥";
		
		System.out.println("number="+card1.number+"type="+card1.type);
		System.out.println("number="+card2.number+"type="+card2.type);
		
	}

}
