import java.util.Scanner;
/*
 *  난수 발생 후 up/down 맞추기
 */

public class 자바제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int cum=(int)(Math.random()*100)+1;				//1~100사이 난수
		while(true) {					// 무한루프
			System.out.println("1~100사이 정수 입력:");
			int user=scan.nextInt();
			if(user<1 || user>100) {
				System.out.println("잘못된 입력입니다!!");	
				continue;						//while 처음(조건식)으로 이동
			}
			
			if(cum>user) {
				System.out.println("입력값보다 큰 숫자");
			}
			else if (cum<user) {
				System.out.println("입력값보다 작은 숫자");
			}
			else { 				//com = user
			System.out.println("정답");
			break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
