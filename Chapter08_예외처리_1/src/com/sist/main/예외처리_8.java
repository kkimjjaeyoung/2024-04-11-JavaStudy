//finally
/*
 * 예외처리
 *  try
 *  {
 *  }catch(예외처리클래스)
 *  {
 *  }catch(예외처리클래스
 *  {
 *  		->에러 대비 -> 사전에 에러 방지 -> 에러 복구 -> 다시 입력
 *  }
 *  finally			->		생략가능(필요시만 사용)
 *  {
 *  	파일닫기 / 서버닫기 / 오라클닫기 
 *  	try 수행, catch 수행 -> 무조건 수행이 된다
 *  }
 */

/*
 * 흐름 
 *\\에러가 없는 경우
 * 	문장1
 *  문장2
 *  try
 *  {
 *  	문장3
 *  	문장4
 *  	문장5
 *  }catch(예외처리클래스)		->	에러가 있을때만 실행(없으면 없는문장 취급)
 *  { 
 *  	문장6
 *  }
 *  finally
 *  {
 *  	문장7
 *  }
 *  
 *  	일반적인 순서 : 1->2->3->4->5->7
 *  
 *  \\에러가 있는 경우
 * 	문장1
 *  문장2					--> 에러발생(1)
 *  try
 *  {
 *  	문장3
 *  	문장4				--> 에러발생(2) || catch로 이동
 *  	문장5
 *  }catch(예외처리클래스)		
 *  { 
 *  	문장6
 *  }
 *  finally			//필요시에만 사용
 *  {
 *  	문장7		//에러 상관없이 무조건 시행
 *  }
 *  
 *  	에러가 발생한 경우 순서(1) : 1->2 ....
 *  	에러가 발생한 경우 순서(2) : 1->2->3->6->7ㄴ
 *  에러 예외처리는 try안에 있을때만 작동
 */


package com.sist.main;



public class 예외처리_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		System.out.println("2");
		try {
			System.out.println("3");
			System.out.println("10/0");		//error. catch로 이동시 
			System.out.println("5");
		}catch(Exception e)			//에러 발생시에만 수행
		{
			System.out.println("에러처리-<6");
		}
		finally
		{
			System.out.println("7");			//파일, 오라클 등 닫기 || 서버 부하 감소 및 지속적 오류 회피
		}
	}

}
