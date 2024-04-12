/*
 * 1. 변수/상수
 * 		변수는 한 개의 데이터를 저장하는 메모리 공간의 이름(변경가능)
 * 			->외부: 변경되는 데이터를 찾는다
 * 		데이터형 변수=값
 * 		상수는 한개의 데이터를 저장하는 메모리 공간의 이름= 변결 불가
 * 		final 데이터형 변수=값 : 모든 상수명은 대문자로 구성
 * 		=> IP
 * 	2. 변수/상수 선언
 *		: 데이터형 변수명; , final 데이터형 상수명=값;
 *	3. 데이터형 (기본형) : 저장범위, 메모리 크기(1,2,4,8)
 *		정수형 : byte(1byte-> -127~128 : 네트워크 전송에 주로 사용), int(4byte-> -21억4천~21억4천 : 모든 정수는 컴퓨터에서 int 인식, 가장 많이 사용됨), long(8byte-> 최근, 빅테이터에 주로 사용)
 *		실수형 : double(8byte : 실수형의 default. 실수가 나오면 컴퓨터에선 double로 인식. 평균치, 평균, 통계 등)
 *		문자형 : char(2byte-> 0~65535 : 문자 1개 저장[ '' ], 각국의 언어 사용이 가능[Unicode], 연산시에는 정수로 변경됨. 연산처리시 같은 데이터형끼리만 연산 가능[double형으로 자동 변환])
 *		논리형 : boolean(1byte-> 1=true, 0=false : 조건이 있는 경우 사용, 로그인 등. boolean bCheck=false;)
 *			선언방법(초기화)
 *			byte b=10;
 *			byte b;
 *			b=20;
 *			
 *			1. int i=10;		//선언+초기값
 *			2. int i;			//선언				==>사용자로부터 값을 받는 경우	
 *		       i=20;			//초기값
 *
 *			여러개가 있는 경우
 *			int a;
 *			int b;
 *			int c;
 *			->	int a,b,c;
 *
 *			여러개의 변수에 초기화
 *			int a=10;
 *			int b=10;
 *			int c=20;
 *			->	int a=10, b=10, c=20;		//같은 데이터형일 경우에만 가능
 *
 *			데이터형 변수명=값		-> 초기화
 *			
 *			변수의 명칭	
 *			1. 알파벳, 한글로 시작(대소문자 구분)
 *			2. 숫자 사용가능 (앞에 사용 불가)
 *			3. 키워드는 사용불가
 *			4. 특수문사 사용(_ $ 만 사용가능)
 *			5. 공백은 사용불가
 *
 *			데이터의 크기
 *			byte < char < int < long < double 		//boolean읜 크기에 제외
 *			
 *			데이터의 교환은 반드시 임시변수 설정
 *			int a=10;
 *			int b=20;
 *			int temp=a;			//임시변수 temp 설정
 *			a=b;
 *			b=temp;				//임시변수로 치환
 *
 *			변수에 값을 대입할 때 
 *			byte b = 값(byte 만 가능)
 *			char c = 값(char, int 가능)
 *			int i = 값(byte, char, int)
 *			long l = 값(byte, char, int, long)
 *			double d = 값(byte, char, int, long, double)
 *				: 작은 데이터형을 대입을 하면 자동으로 변경
 *					char c=65		:	c='A'
 *					int a='A'		:	a=65
 *					long a=10		:	a=10L
 *					double a='A'	:	a=65.0
 */
public class 변수_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
	}

}
