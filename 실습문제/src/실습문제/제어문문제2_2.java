package 실습문제;

import java.util.Scanner;

public class 제어문문제2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("첫 번쨰 정수 : ");
		int num1=scan.nextInt();
		System.out.println("연산자 입력 : ");
		char plum=scan.next().charAt(0);
		System.out.println("두 번째 정수 : ");
		int num2=scan.nextInt();
		
		
		switch(plum) {
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
		}
	}

}
