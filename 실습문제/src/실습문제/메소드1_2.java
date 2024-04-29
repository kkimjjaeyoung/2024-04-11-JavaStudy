package 실습문제;

import java.util.*;

public class 메소드1_2 {
	static int num() {
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int sum=num();
		System.out.println("sum"+sum);
	}

}
