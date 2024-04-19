/*
 * 돈까스 8000
 * 칼국수 6000
 * 왕마두5000
 * 		돈까스16 칼국8 만두1
 */

import java.util.Scanner;

public class 자바변수_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		final int kat=8000;
		int kal=6000;
		int man=5000;
		
		System.out.println("돈까스 수");
		int su1=scan.nextInt();
		System.out.println("칼국수 수");
		int su2=scan.nextInt();
		System.out.println("왕만두 수");
		int su3=scan.nextInt();
		
		System.out.println("총액="+(kat*su1+kal*su2+man*su3));
	}

}
