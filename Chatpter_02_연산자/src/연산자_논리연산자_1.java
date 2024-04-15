/*
 *  논리연산자(true/false로 출력) : &&(and, 직렬연산자, 범위와 기간 포함), ||(or, 병렬연산자, 범위와 기간을 벗어난 경우)
 *  							jumsu>-0 && jumsu<=100				jumsu<0 || jumsu>100	-> 오류처리
 *  	(조건) && (조건)	->	결과값(4가지 경우의 수)
 *							  	
 */
public class 연산자_논리연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=9;
		
		boolean bCheck= x!=y && ++y==x;
		System.out.println("bCheck="+bCheck);
		System.out.println("x="+x);
		System.out.println("y="+y);

	}

}
