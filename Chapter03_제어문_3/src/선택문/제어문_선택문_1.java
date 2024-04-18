package 선택문;

import java.util.Scanner;

public class 제어문_선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("첫 번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.println("연산자 입력:");
		char op=scan.next().charAt(0);
		System.out.println("두 번쨰 정수 입력");
		int num2=scan.nextInt();
		
		switch(op) {				//문자'' ,문자열"
		case '+': 												//처리문장
		System.out.println(num1+"+"+num2+"="+(num1+num2));		//case한 문장씩만 수행->break사용
		break;
		case '-': 
		System.out.println(num1+"-"+num2+"="+(num1+num2));
		break;
		case '*': 
		System.out.println(num1+"*"+num2+"="+(num1+num2));
		break;
		case '/': 
			if(num2==0)
				System.out.println("0으로 나눌수 없습니다");
			else
				System.out.println(num1+"/"+num2+"="+(num1+num2));
			break;
			default:						//연산자가 잘못된 경우(생략가능)
				System.out.println("잘못된 연산자입니다.");			//마지막은 break 생략가능, 
																//***case에 등록된 값이 중복되면 오류 발생, case에 등록되는 데이터형은 통일되야함

		}
	}

}
