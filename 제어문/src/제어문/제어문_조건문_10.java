package 제어문;

//문자를 받아서 대문자/소문자/숫자/기타 판별
import java.util.Scanner;
public class 제어문_조건문_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("문자 입력:");
		char c=scan.next().charAt(0);		//문자 1개를 받는 경우
	
	if(c>='A' && c<='Z') {
		System.out.println(c+"는(은) 대문자");
	}
	else if(c>='a' && c<='z') {
		System.out.println(c+"는(은) 소문자");
	}
	else if(c>= '0' && c<='9') {
		System.out.println(c+"는(은) 숫자");
	}
	else {
		System.out.println("기타입니다");
	}
	
	}
}
