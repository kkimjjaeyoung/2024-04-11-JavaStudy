/*
 * while형식
 * 
 * 	while (조건식) {
 * 			반복실행문장
 * 			증감식
 * 		}
 * 		: 주로 사용 횟수를 알 수 없는 경우 사용.
 *  종료할수있는 프로그램(break)
 *  
 */

//dan을 입력받아 해당 단 출력

import java.util.Scanner;

public class 자바제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("2~9사이의 정수 입력:");
		int dan=scan.nextInt();
		
		for (int i=1; i<=9; i++) {								//for문
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		
		int i=1;
		while (i<=9);{
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			i++;
		}
	}

}
