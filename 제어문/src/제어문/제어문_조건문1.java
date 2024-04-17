/*
 *  단일 조건문 : 자바에서 제어문은 바로 밑의 문장만 제어가능
 *  	여러개의 문장을 동시에 수행	if(조건문){ 실행문장1, 실행문장2 }
 *  중첩 조건문 : 연속되는 두 if문이 참일떄 수행
 *  	if(조건문) { if(조건문){} }		=	if(조건문 && 조건문) { 실행문장 }
 */
package 제어문;

import java.util.Scanner;
public class 제어문_조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);	//모든 클래스는 메모리에 저장할때 new(동적메모리 할당)
		System.out.println("1~100까지 사이의 두자리 정수 입력:");
		int num=scan.nextInt();			//입력된 정수값 수령
		if (num>=10 && num<=99) {
			/*
			 * int a=num/10; intb=num%10; if(a==b) { System.out.println("같은 숫자입니다"); }
			 * if(a!=b) { System.out.println("다른 숫자입니다"); }
			 */
			if(num%11==0) {
				System.out.println("같은 숫자입니다");
			}
			if(num%11!=0) {
				System.out.println("다른 숫자입니다");
			}
		}
		if(!(num>=10 && num<=99)) { 		//사용자가 잘못 입력한 경우
			System.out.println("잘못된 입력입니다");
		}			//처음부터 다시 시행
			
	}

}
