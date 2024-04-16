//정수입력 받기->양/음수 확인 후 출력

import java.util.Scanner;
public class 제어문_단일조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.println("정수 입력:");
		num=scan.nextInt();
		
		if (num>=0) {
			System.out.println(num+"양수");
		}
		if (num<0) {
			System.out.println(num+"는 음수");
		}

	}

}
