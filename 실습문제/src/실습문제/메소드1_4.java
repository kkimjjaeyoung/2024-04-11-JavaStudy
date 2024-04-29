package 실습문제;

import java.util.*;
public class 메소드1_4 {
	static String div(int a, int b) {
		String result="";
		if(b==0) {
			result="0으로는 나눌 수 없습니다";
		}
		else {
			result=String.valueOf(a/b);
		}
		return result;
	}
	static void process() {
		Scanner scan=new Scanner(System.in);
		System.out.println("첫 번째 정수 입력:");
		int nim1=scan.nextInt();
		System.out.println("두 번째 정수 입력:");
		int nim2=scan.nextInt();
		System.out.println(div(nim1, nim2));
	}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
