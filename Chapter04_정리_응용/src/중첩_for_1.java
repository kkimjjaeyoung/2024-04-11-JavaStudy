/*
 * 중첩 for [반복문] : 코딩테스트/정보처리, 솔루션 등 (웹에서는 사용 빈도가 거의 없다)
 * 
 * 중첩 : if(~(if~))
 * 선택문 : switch~case(switch~case)
 * 반복문(주로 for) : for(~(for))
 *	형식	: 조건식이 true일때 다음 문장, false일때 종료 
 *	for(초기값; 조건식; 증가식){
 *		for(초기값; 조건식; 증가식){
 *		}
 *	}						
 * 		1. 출력 줄 수, 2. 출력 개수
 */

public class 중첩_for_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub						//총 25(5*5)바퀴 
		for(int i=1; i<=5; i++) {						//2차for문 종료 후 i값 증가		
			for(int j=1; j<=5; j++) {	
				System.out.println("i="+i+", j="+j);
			}
			System.out.println();
		}
	}

}
