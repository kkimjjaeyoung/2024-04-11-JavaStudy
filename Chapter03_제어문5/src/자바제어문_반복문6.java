/*
 *  2~9사이의 정수를 입력받아 구구단 출력, 2~9사이가 아닐 경우 다시
 */

import java.util.Scanner;

public class 자바제어문_반복문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int gu=0;
/*		for (n=2; n<=9; n++) {
			if (n>=2 $$ n<=9) {
				us*
			}
			else 
				continue;
		}*/
		for (;;) { 
			System.out.println("입력");
			gu=scan.nextInt();
			if (gu<2 || gu>9) {
				System.out.println("입력오류");
				continue;
			}
			break;
		}
		System.out.println( gu );
		System.out.println("=================");
		for (int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n");
		}
	}

}
