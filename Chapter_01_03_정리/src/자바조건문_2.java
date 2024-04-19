//초를 받아서 시간/분/초 출력

import java.util.Scanner;

public class 자바조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("초 입력:");
		int num=scan.nextInt();
		
		int hour=num/3600;
		System.out.println(hour+"시");
		int minute=(num%3600)/60;
		System.out.println(minute+"분");
		int second=(num%3600)%60;
		System.out.println(second+"초");
	}

}
