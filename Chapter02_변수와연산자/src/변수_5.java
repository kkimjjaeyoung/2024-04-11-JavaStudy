/*
 *  byte, char, int, long, float, double
 *  기타 : boolean
 *  
 *  1. 데이터형의 크기 
 *  	byte < char < int < long < float < double				크기의 기준은 수 표현의 갯수
 *  	1=>1.000000
 *  	int a=10L; ==> X
 *  	long a=10; ==> O
 *  
 *  	byte + byte = int
 *  	char + char =int
 */
public class 변수_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자동 형변환, 강제 형변환
		int a='A';			//char->int
		System.out.println(a);
		char c=65;			//int->char
		double d='A';		//char->double
		byte b1=10;
		byte b2=110;
		//byte b3=(b1+b2);		//error 형변환 불가
		byte b3=(byte)(b1+b2);
		System.out.println(b3);
	}

}
