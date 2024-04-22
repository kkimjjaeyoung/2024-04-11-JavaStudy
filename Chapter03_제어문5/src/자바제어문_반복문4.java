/*
 *  1~100 사이의 정수 10개 추출 후 최대, 최소값
 */

import java.util.Random;

public class 자바제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max=1;				// 가장 낮은 숫자 (최대값)
		int min=100;			// 가장 높은 숫자 (최솟값)
		for (int n=1; n<=10; n++) {
			int a=(int)(Math.random()*100+1);
			System.out.print(a+" "); 
			if (max<a) {
				max=a;
			}
				if (min>a) {
					min=a;
			}

		}
		System.out.println("최대" + max);
		System.out.println("최소 " + min);
	}

}
