import java.util.Scanner;
public class 메소드1 {
	static char alp() {
		return (char)((Math.random()*26)+65);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력");
		int num=scan.nextInt();
		System.out.println("num"+num);
		
		char c=alp();
		System.out.println("c"+c);
	}

}
