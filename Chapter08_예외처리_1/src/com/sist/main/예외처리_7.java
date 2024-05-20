/*
 * 에러메세지 출력
 * 	에러확인
 * 		getMessage()		->	에러내용만 출력
 * 		printStackTrace()	->	에러위치확인(권장사항)
 * 	Exception : 상속을 내린 모든 클래스의 예외처리기능. 예외처리의 최상위 클래스
 * 		->	IOException, SQLException, classNotfound, runtime
 * 	runtimeException : 실행시 예외처리의 모든 기능을 가지고 있음
 * 		-> classcastException, arithmeticException, nullpointerException, numberException
 *  // 상속내리는 클래스가 받는 클래스보다 크다
 */	

package com.sist.main;

class AAA{
	
}
class BBB extends AAA{
	
}

public class 예외처리_7 {
	String msg;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a=Integer.parseInt("10");		//정수변환	
			/*
			 * int[] arr=new int[2];
			arr[0]=10;
			arr[1]=20;			
			*/
			//System.out.println(10/0);
			/*
			예외처리_7 aa=new 예외처리_7();
			String s=aa.msg.concat("java");
			*/
			//System.out.println(s);
			/*
			AAA a=new BBB();
			BBB b=(BBB)a;			//classcastexception
			형변환 반드시 생성자 일치
			*/
		}catch(Exception ex)		//Exception : 자바에서 지원하는 모든 오류처리 가능 -> Throwable : 에러도 출력
		{
			ex.printStackTrace();
			//에러가 자주 나는 경우 : try~catch
		}
	}

}
