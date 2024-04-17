package 실습문제;

import java.util.Scanner;

public class 제어문문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	
		System.out.printf("정수 입력:");
		int num1=scan.nextInt();
		System.out.printf("+, -, *, / 입력:"); 
		char pm=scan.next().charAt(0);
		System.out.printf("정수 입력:");
		int num2=scan.nextInt();
		
		
		if (pm=='+') {
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		}
		else if(pm=='-') {
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		}
		else if(pm=='*') {
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		}
		else if(pm=='/') {
			System.out.println(num1+"/"+num2+"="+(num1/num2));
		}
	}

}
