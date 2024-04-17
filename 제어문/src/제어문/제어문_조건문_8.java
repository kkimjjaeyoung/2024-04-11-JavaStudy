package 제어문;

//숫자를 입력받아 3, 5, 7의 배수인지 판별
import java.util.Scanner;
public class 제어문_조건문_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int num=scan.nextInt();
		
		if(num%3==0) {
			System.out.println(num+"는(은) 3의 배수");
		}
		if(num%5==0) {
			System.out.println(num+"는(은) 5의 배수");
		}
		if(num%7==0) {
			System.out.println(num+"는(은) 7의 배수");
		}
	}

}
