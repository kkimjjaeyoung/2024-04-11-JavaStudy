import java.util.*;
public class 메소드계산기 {

	static int add (int a, int b) {
	return a+b;	
	}
	
	static int minus(int a, int b) {
		return a-b;
	}
	
	static int gop(int a, int b) {
		return a*b;
	}
	
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
		int num1=scan.nextInt();
		System.out.println("연산자 입력:");
		char op=scan.next().charAt(0);
		System.out.println("두 번째 정수 입력:");
		int num2=scan.nextInt();
		
		switch(op) {
		case '+':
			System.out.printf("%d + %d = %d\n", num1, num2, add(num1,num2));
			break;
		case '-':
			System.out.printf("%d - %d = %d\n", num1, num2, minus(num1,num2));
			break;
		case '*':
			System.out.printf("%d + %d = %d\n", num1, num2, gop(num1,num2));
			break;
		case '/':
			System.out.println(div(num1, num2));
			break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();			//연결만 처리
		
	}

}
