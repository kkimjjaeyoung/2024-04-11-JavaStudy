/*
 * 	1. 변수/상수 설정									//변수 : 변경가능, 상수 : 고정
 *  2. 변수/상수 초기화
 *  	final 데이터형 변수명=값 
 *  	값이 큰 경우 데이터형에 맞게 변환
 *  3. 변수명 만들기
 *  	1) 알파벳, 한글로 시작(대소문자 구분)
 *  	2) 숫자사용가능(첫문자는 불가)
 *  	3) 특수문자 사용(_, $만 사용 가능)
 *  	4) 키워드(사용중인 자바 단어) 사용 불가
 *  	5) 공백사용 금지
 *  	6) 길이 제한은 없다(3~10 권장)
 *  4.데이터형(기본형) : 자바에서 지원하는 메모리 크기
 *  	byte(1byte), int(4byte), long(8byte), double(8byte), char(2byte), boolean(1byte)
 *  5.형변환 : 필요시 형변경 가능
 *  	자동형변환 : 왼쪽의 데이터형이 값보다 큰 경우		
 *  	강제형변환 : 왼쪽의 데이터형이 값보다 작은 경우
 *  			ㅠㅛㅕㅅㄷ<ㅊ목 ㅑㅜㅅ ㅣㅐㅜㅎ 리ㅐㅁㅅ double
 */
public class 문제풀이 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=(byte)300;
		System.out.println(b);			//overflow
	

	}

}
