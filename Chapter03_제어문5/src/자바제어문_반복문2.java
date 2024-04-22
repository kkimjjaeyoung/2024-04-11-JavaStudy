/*
 *  반복 -> 필요한 내용만 출력
 *   for (초기값; 조건식; 증감식) {
 *   	if(조건){
 *   		(조건문)
 *   		}
 *   	}							// for 에 지정된 횟수만큼 도는 동안 if를 만족할 경우만 출력
 */
public class 자바제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.println(i+" ");			//1~10수 중 짝수만 출력
			}
		}
		for(int i=1; i<=10; i+=2) {
			System.out.println(i+" ");				//1~10수 중 짝수만 출력
		}
		System.out.println();
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");				//가독성 쉬움, 유지보수 어려움
		
		for (int i=1; i<=4; i++) {
			for (int j=1; j<=i; j++) {
				System.out.println("*");
			}
			System.out.println();				//유지보수 쉬움
		}

	}

}
