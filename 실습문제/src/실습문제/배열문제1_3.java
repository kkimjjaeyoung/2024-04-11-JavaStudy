/*
 * 
 */

package 실습문제;

import java.util.Arrays;

public class 배열문제1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha = {'a', 'b', 'c', 'd'};

		for(int i=0; i<alpha.length; i++) {			//값변경, 초기화(인덱스번호 필요)
		     System.out.println(alpha[i]);			
		     }
		System.out.println("for-each");				//출력용(웹 등)
		for(char c:alpha) {							//받는 변수와 배열의 데이터형이 동일 or 받는 변수 데이터형이 더 크다
			System.out.println(c);
		}
		System.out.println("API");
		System.out.println(Arrays.toString(alpha));		
	}

}
