/*
 * 
 * 1)변수 명칭법
 * 		1. 알파벳이나 한글로 시작. 알파벳시 대소문자 구분
 * 		2. 숫자사용이 가능 (앞에는 사용 불가)
 * 		3. 특수문자 사용 가능 (_,  $). _name= 임시변수
 * 		4. 키워드는 사용 불가 (자바에서 사용중인 단어)
 * 		5. 공백이 있으면 안됨
 * 		6. 변수명에 제한이 없다 (3~10글자 적당. 압축)
 * 		
 * 	kor=89, 변수명=실제 저장된 값(리터널)
 * 	변수=다음에 다시 사용한다
 * 	변수의 형식 
 * 		데이터형 변수명 = 값
 * 		데이터형 = 정수(1(파일읽기, 업로드 다운로드, 네트워크 전송), 2(C언어와 호환성), 4(int=default), 8(금융권)byte)
 * 						byte->
 * 				실수(4, 8byte)
 * 				문자
 * 				논리
 * 		데이터를 저장해 재사용->변수(한개만 저장 가능)
 * 			byte= 1byte(-128~127)
 * 			short= 2byte(-32768~32767)
 * 			int= 4byte(-21억4천~21억 4천)
 * 			long= 8byt
 */
public class 변수_25페이지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=127;			// 사용범위, 메모리 크기(데이터형)
		System.out.println(Short.MAX_VALUE);
		final byte b1 = -128;		// 데이터형, 변수명, 실제메모리에 저장된 값.  final = 상수 변경 불가
		System.out.println(b1);
		b1=100;
		long a=210000;
		int b=21000;
		
		
		int total=0;
		System.out.println(total);
		System.out.println(kor+eng+math);
/*
 * 변수
 * 		1. 지역변수(반드시 초기화 후 사용)
 * 			1)선언과 동시에 초기값 부여				int a=10;
 * 			2)선언을 먼저 한 후 나중에 값을 대입		int a;		a=10;
 * 			3)여러개 동시에 선언						int a=10;		int b=20;		int a,b,c;		a=b=c=10;	int a=10, b=10, c=10;
 * 		2. 맴버변수
 * 		3. 공유변수
 * 		4. 참조변수
 * 
 * 30page
 * 		논리형->boolean->저장하는 값->true/false
 * 		1byte-> true=1, false=0	
 * 		->사용위치는 조건을 사용할 때
 * 		->boolean bCheck=false;
 */
	boolean bCheck=false;
	System.out.println(bCheck);
	
/* 문자형
 * 	=> char : 멀티바이트-> 2byte-> UniCode
 * 		C언어 =싱글바이트=1byte=ASC
 * 		0~65535
 * 		0~255
 * 		A=65
 * 		a=97
 * 		'0'=48
 * 		표현방식= 문자1개= ''
 */
	char hakjum='B';
	System.out.println(hakjum);
	char fname='홍';
	System.out.println(fname);
	char num=0;
}
