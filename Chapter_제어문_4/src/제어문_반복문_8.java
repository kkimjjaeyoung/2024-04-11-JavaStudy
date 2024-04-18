/*
 * 계산기(사칙연산)
 */

import java.util.Scanner;

public class 제어문_반복문_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("종료를 q/Q를 입력하세요");
		for(;;) {								//무한루프			
			System.out.print("첫 번째 정수 입력:");
			int num1=scan.nextInt();
			System.out.print("연산자 입력(+, -, *, /:");
			char op=scan.next().charAt(0);
			System.out.print("두 번째 정수 입력:");
			int num2=scan.nextInt();
			
			switch(op) {
			case '+':
				System.out.println(num1+"+"+num2+"="+(num1+num2));
			case '-':
				System.out.println(num1+"-"+num2+"="+(num1-num2));
			case '*':
				System.out.println(num1+"*"+num2+"="+(num1*num2));
			case '/':
				if(num2==0)
					System.out.println("0으로 나눌 수 없다");
				else 
				System.out.println(num1+"/"+num2+"="+(num1/num2));
			/*
			 * case 'q': case 'Q': System.out.println("프로그램 종료"); System.exit(0); //프로그램 자체
			 * 종료. 0=정상종료, 0!=비정상 종료 default:
			 */
					System.out.println("종료할까요?(y/n)");
					char exit=scan.next().charAt(0);
					if (exit == 'y') 
						System.out.println("프로그램 종료");
						break;
			}
			}
		
	}

}
