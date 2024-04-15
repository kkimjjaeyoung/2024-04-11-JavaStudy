/*
 * 연산자 : 사용자의 요청에 따라 처리하는 기능
 * 프로그램(데이터 저장>데이터처리>화면출력). 변수(한개씩), 배열, 클래스(여러개씩)
 * 
 * 	연산처리
 * 	1. 단항연산자
 * 		증감연산자(++, --) : 전치연산자(먼저 증가, 앞에 붙음), 후치연산자(나중에 증가, 뒤에 붙음)
 * 		부정연사자 : boolean만 사용가능, 조건문에서 주로 사용
 * 		형변환연산자 : 숫자와 관련된 데이터만 가능, (데이터형)값
 * 		반전연산자 (~) : 양수를 음수로 변경
 * 	2. 이항연산자 : 연산대상이 2개인 경우
 * 		산술연산자 : 같은 데이터형을 만들어두고 시작
 * 			1) 일반 산술
 * 			2) 문자열 결합
 * 					
 * 	3. 삼항연산자
 */
public class 연산자_단항연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=127;
		byte b2=40;
		
		int b3=b1+b2;
		byte b4=(byte)(b1+b2);
		
		System.out.println(b3);
		System.out.println(b4);
		System.out.println("b3="+b3);
		System.out.println("b4="+b4);
	}

}
