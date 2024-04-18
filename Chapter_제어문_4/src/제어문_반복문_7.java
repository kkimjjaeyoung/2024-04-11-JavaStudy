/* 무한루프
 * 	up-down 게임
 * 		1~100사이의 난수를 맞추기
 */

import java.util.Scanner;

public class 제어문_반복문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner scan=new Scanner(System.in);
		
		int com=(int)(Math.random()*100)+1;			//1~100의 정수 한개 추출
		for (;;) {									//종료하지 않는 프로그램(무한루프)
			System.out.println("1~100사이의 정수를 입력:");
			int user=scan.nextInt();				//사용자의 입력값
			
			if(user<1 || user>100) {
				System.out.println("입력값에 오류가 있습니다");
				continue;							//for문의 처음으로 돌아간다.
			}
		
			count++;								//제대로 입력된 값 수 중 입력수
			if (com>user) {
				System.out.println("입력값보다 큰 수를 입력하세요");
			}
			else if (com<user) {
				System.out.println("입력값보다 작은 수를 입력하세요");
			}
			else {
				System.out.println("정답입니다");
				break;								//break로 게임 종료
			}
			}		
			System.out.println(count);
	}

}

