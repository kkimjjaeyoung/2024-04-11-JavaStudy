package 실습문제;
import java.util.*;
public class 메소드2_2_3 {
	static int input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력");
		return scan.nextInt();			//입력받은 값을 돌려준다
	}

	static void isYear(int year) {
		//윤년체크
		if(year%4==0 && year%100!=0 || (year%400==0)) {
			System.out.println(year+"년도는 윤년");
		}
		else {
			System.out.println(year+"년도는 윤년이 아니다");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
													//system.in(inputstream) : 키보드 입력값, sysyem.out(outperstream) : 화면 출력
													//system =.in은 키보드 입력값을 가져올수 있으나 모든 문자가 정수형
		int year=input();
		isYear(year);
		
	}

}
