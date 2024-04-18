/*
 *  1. 형식 	
 *  	for (초기값; 조건식; 증가식){
 *  		반복실행문장
 *  		}
 *   2. 순서	: 초기값 실행 후 조건식, 반복실행문장, 증가식 순환 후 false 시 종료
 *   3. 초기값 : 시작점(int i= 0, 1, 'A'...)
 *   4. 조건식 : 출력 범위
 *   5. 증가 : n씩 증가
 */

package 실습문제;

public class 제어문문제2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		
		for (int b=0; b<=100; b+=2) {
				a+=b;
				
			}
		System.out.println("2+4+....100의 합 : " + a);
	}

}
