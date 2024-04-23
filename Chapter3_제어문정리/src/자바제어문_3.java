import java.util.Scanner;

public class 자바제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		boolean run=true;
		int balance=0;
		while (run) {
			System.out.println();
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println();
			System.out.println("메뉴 선택->");
			int menu=scan.nextInt();
			switch(menu) {
			case 4:
				run=false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
