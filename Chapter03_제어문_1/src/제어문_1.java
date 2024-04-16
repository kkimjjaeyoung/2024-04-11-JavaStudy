/*
 * 자바에서 지원하는 제어문(프로그램의 흐름, 건너뜀, 실행, 반복, 선택)
 * 		1. 조건문
 * 			단일조건문 ( 부정연산자, 비교연산자, 논리연산자만 사용 가능 ) 
 * 				if(조건문) {
 * 					조건이 true일 경우 수행하는 문장 (false면 스킵)
 * 					}
 * 			선택조건문
 * 				if(조건문) {
 * 					조건이 true일 경우 수행하는 문장 (false면 스킵)
 * 					}
 * 				else(조건문) {
 * 					조건이 false일 경우 수행하는 문장
 * 					}
 * 			다중조건문
 * 				if(조건문) {
 * 					조건이 true일 경우 문장 수행 (false면 다음 조건문으로)
 * 					}
 * 				else if(조건문) {
 * 					조건이 true일 경우 문장 수행 (false면 다음 조건문으로)
 * 					}
 * 				else if(조건문) {
 * 					조건이 true일 경우 문장 수행 (false면 다음 조건문으로)
 * 					}
 * 				else(조건문) {
 * 					조건이 false일 경우 수행하는 문장 (생략 가능)
 * 					}
 * 						***중첩
 * 								if(조건문) {
 * 									if(조건문){
 * 										}
 * 									}
 * 								if(조건 && 조건)
 * 		2. 선택문
 * 		3. 반복문
 * 			for : 반복 횟수가 지정된 경우
 * 			while : 반복 횟수가 없는 경우
 * 			do~while : 반드시 한번이상 수행
 * 		4. 반복제어문
 * 			break : 반복수행을 종료할 때
 * 			continue : 특정 부분을 제외
 * 				***모든 제어문은 바로 밑에 있는 문장만 제어 가능 (두 문장 제어시엔 블록 지정 필요)
 */
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=(int)(Math.random()*101);
		System.out.println("score="+score);
		if(score>=60) {
			System.out.println("합격");
		}
		if(score<60) {
			System.out.println("불합격");
		}
		
			

	}

}
