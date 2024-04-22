/*
 * 	while : 반복횟수를 모르는 경우 주로 사용
 * 		***for/while/do~while 차이
 * 
 * 		초기값
 * 		while(조건식) {
 * 			반복수행문장
 * 			증가식
 * 		}
 *
 */

// 1부터 시작해 입력한 정수까지의 합 출력

import java.util.Scanner;

public class 자바제어문_반복문9 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/*
		 * Runtime.getRuntime().
		 * exec("\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" +
		 * "https://www.youtube.com/embed/");
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		
		int num=scan.nextInt();
		int sum=0;
		
		int i=1;					//while문을 이용한계산
		while(i<=num) {
			sum+=i;
			i++;
		}
		System.out.println("결과값:"+ sum);
		
		sum=0;						//누적된 sum값을 0값으로 초기화.
		for (i=1; i<=num; i++) {			//for문을 이용한 계산
			sum+=i;
		}
		System.out.println("결과값:"+sum);
	}

}
