/*
 *  비교연산자 : 숫자(int), 문자(char)에서만 사용 가능(문자열은 비교 불가, 결과값이 true/false 고정)(
 *  	==(같다), !=(같지 않다), <(작다), >(크다), <=(작거나 같다), >=(크거나 같다)
 *  			***자바스크립트(===), 오라클(=)
 *  	1. 단항연산자, 산술연산자, 비교연산자, 대입연산자, 논리연산자, 형변환
 *  		변수, 연산자, 제어문
 *  	
 */
public class 연산자_비교연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;		//1~100 사이의 난수 추출
		int b=(int)(Math.random()*100)+1;
		System.out.println("a="+a+" ,b="+b);
		
		System.out.println("===== 비교 =====" );
		
		System.out.println("a==b:"+(a==b));
		System.out.println("a!=b:"+(a!=b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>b:"+(a>b));
		System.out.println("a<=b:"+(a<=b));
		System.out.println("a>=b:"+(a>=b));

		System.out.println("===== 알파벳 비교 =====");
		
		char c=(char)((int)(Math.random()*26)+97);		//random, *26, (int), +65, (char) 순으로 진행
		char d=(char)((int)(Math.random()*26)+97);
		System.out.println("c="+c+", d="+d);
		System.out.println("c!=d:"+(c!=d));
		System.out.println("c<d:"+(c<d));
		System.out.println("c>d:"+(c>d));
		System.out.println("c<=d:"+(c<=d));
		System.out.println("c>=d:"+(c>=d));
	}

}
