package 실습문제;

import java.util.*;
public class 메소드1_6 {
	static void num6(String msg) {
		if(msg.length()%2!=0) {
			System.out.println("잘못된 입력입니다");
			return;		//메소드 종료. return은 원하는 위치에서 사용 가능
		}
		boolean bCheck=false;
		for(int i=0; i<msg.length()/2; i++) {
			char c1=msg.charAt(i);
			char c2=msg.charAt(msg.length()-1-i);
			if (c1!=c2) {
				bCheck=false;
				return;
			}
		}
		if(bCheck==true) {
			System.out.println("좌우대칭");
		}
		else {
			System.out.println("좌우대칭이 아닙니다");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력:");
		String str=scan.next();
		num6();
	}

}
