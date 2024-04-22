/*
 *  A~Z 사이 사용자가 입력한 알파벳 순서
 */

import java.util.Scanner;

public class 자바제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		char us=scan.next().charAt(0);
		
		int tp=1;
		for (char n='A'; n<='Z'; n++){
			if (us==n) 
				break;
			n++;
		}
		System.out.println( tp+ "번째");
		}
	}


