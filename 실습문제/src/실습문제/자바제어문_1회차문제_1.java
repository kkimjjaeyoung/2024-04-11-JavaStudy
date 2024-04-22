

package 실습문제;

import java.util.Scanner;

public class 자바제어문_1회차문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력:");
		int ap=scan.nextInt();

		if (ap>=10 && ap<=99) {
			if (ap%11==0) {
				System.out.println("10의 자리와 1의 자리가 같습니다");
			}
			else {
				System.out.println("10의 자리와 1의 자리가 다릅니다");
			}
		}
		else {
			System.out.println("10~99의 정수를 입력해주십시오");
		}
		
	}

}
