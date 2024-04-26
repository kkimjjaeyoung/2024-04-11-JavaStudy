/*
 * 1.중복없는 난수	
 * 	1)난수 3개에 사용자 입력으로 맞추기
 * 
 * 
 * 연산자
 * 	단항연산자 : [], (), 전치/후치연산자(++,--)		// [], (), 전치, 후치연산자 순서대로 연산	)1
 * 		upcasting : 데이터형을 크게 만든다.		downcasting : 데이터형을 작게 만든다
 * 	이항연산자
 * 		산술연산자	: /,*, +,-				// 곱/나눗셈, 덧/뺼셈 순서대로 연산					)2
 * 										// +는 산술 외 문자열 결합 연산자 기능 포함
 * 		비교연산자 : <, >, <=, >=, ==, !=, equals, instanceof	//숫자, 문자, 논리형 비교		)3
 * 		논리연산자 : && (범위에 포함될때), || (범위를 벗어날 때) 								)4
 * 	삼항연산자 : if~else 등.	웹/게임 등에서 복잡도를 줄이기 위해 주로 사용						
 * 	대입연산자	: =, +=, -=																)6
 * 
 * 제어문 : 프로그램 제어, 반복수행, 건너뛰기. 선택수행
 *  for : 반복횟수가 있는 경우
 *  while : 반복횟수를 모르는 경우
 *  do~while : 반복횟수를 모르며 반드시 한 번 이상 수행될 경우
 *  단일조건문 : 건너뛰기
 *  다중조건문, 선택문 : 선택수행
 *  조건문 : 오류처리(예외처리)
 *  throws/try~catch : 반드시 예외처리
 *  	반복문 제어
 *  		종료 : break; (반복문, 선택문에서 사용가능)
 *  		제외 : continue; (반복문에서 사용 가능)
 * 조건문
 * 	단일조건문
 * 		1) 제어문 형식
 * 			if(조건){}			//조건이 true일때 {}실행, false일때 건너뜀
 * 		2) 동작 순서 : 조건이 맞는 경우에만 실행
 * 		3) 사용위치 : 오류처리(사용자 입력받은경우 주로 사용)
 * 		4) 조건 설정 : 비교연산자/논리연산자
 * 			**if를 여러개 쓰면 독립적이므로 모든 조건을 검색해 속도가 느려질수있다
 * 			**여러 문장을 동시에 수행 가능
 * 	선택조건문(if~else) : true, false에 따른 다른 출력
 * 		if() {}		else if() {}	else {}
 * 		switch(정수, 문자, 문자열){}	case1: 처리문장 break;		default:
 * 		
 * 반복문
 * 		무
 */

import java.util.Arrays;
import java.util.Scanner;
public class 중첩_for_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 컴퓨터가 난수 발생(1~9의 중복없는 숫자 3개)
		int[] com=new int[3];
		for(int i=0; i<com.length; i++) {	//3번(com.lenght)만큼 반복
			com[i]=(int)(Math.random()*9)+1;		
			for(int j=0; j<i; j++) {						//중복여부확인
				if(com[i]==com[j]) {						//i와 j가 같은수가 있다면
					i--;									//다시 난수발
					break;
				}
			}
		}
		//System.out.println(Arrays.toString(com));
		
		//사용자가 입력한 데이터 저장
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		// 2. 사용자 입력 요청
		while(true) {				//반복횟수 없다(무한루프)
			System.out.println("세자리 정수를 입력하세요");
			int input=scan.nextInt();
			if(input<100 || input>999) {									//세자리 정수가 입력 안됐을 때
					System.out.println("세자리 정수만 입력해주십시오");
					continue;												//while문의 처음으로 이동
					/*
					 * while문의 continue : 조건식으로 이동
					 * 		while(조건식) {} 					처음으로 다시 시작
					 * for문의 continue : 증가식으로 이동
					 * 		for(초기값; 조건식; 증가식)			제외
					 */
			}
			user[0]=input/100;												//세자리정수를 입력한 경우
			user[1]=(input%100)/10;
			//오류처리(1. 같은 숫자, 2. 0입력불가)
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]){
				System.out.println("중복된 수를 사용할수 없습니다");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[0]==0){
				System.out.println("0을 사용하면 안됩니다.");
			}
			// 3. 비교 후 힌트 출력
			int s=0, b=0;						//s는 숫자와 자리수가 맞는 경우, b는 숫자는 있고 자릿수가 다른 경우
			for(int i=0; i<3; i++) {		//com
				for(int j=0; j<3; j++) {	//user
					if(com[i]==user[j]) {			//같은수가 존재하는지
						if(i==j) {				//같은수에 같은 자리
							s++;
						}
						else {					//같은수에 다른자리
							b++;
						}
					}
				}
			}
			System.out.printf("Input Number:%d, Result:%ds-%dB\n", input, s, b); 				//힌트 제공
			if(s==3) {
				System.out.println("정답");
				break;
			}
		}

		

		// 4. 정답 비교 후 정답은 종료, 오답은 다시 입력
		
		
	}

}
