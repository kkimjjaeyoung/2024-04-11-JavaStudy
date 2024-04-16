/*
 *  컴퓨터/사용자->가위바위보
 */

import java.util.Scanner;
public class 제어문_단일조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rsp=(int)(Math.random()*3);			//0:가위 1:바위 2:보
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2)");
		int user=scan.nextInt();
				
		if(user==0) {
			System.out.println("컴퓨터:가위");
		}
		if(user==1) {
		System.out.println("컴퓨터:바위");
		}
		if(user==2) {
			System.out.println("컴퓨터:보");
		}

		if(rsp==0) {
			System.out.println("컴퓨터:가위");
		}
		if(rsp==1) {
			System.out.println("컴퓨터:바위");
		}
		if(rsp==2) {
			System.out.println("컴퓨터:보");
		}
		
		/*
		if(user==0 && rsp==0) {
			System.out.println("비겼습니다");
		}
		if(user==0 && rsp==1) {
			System.out.println("졌겼습니다");
		}
		if(user==0 && rsp==2) {
			System.out.println("이겼습니다");	
		}
		if(user==1 && rsp==0) {
			System.out.println("이겼습니다");
		}
		if(user==1 && rsp==1) {
			System.out.println("비겼습니다");
		}
		if(user==1 && rsp==2) {
			System.out.println("졌습니다");	
		}
		if(user==2 && rsp==0) {
			System.out.println("졌습니다");
		}
		if(user==2 && rsp==1) {
			System.out.println("이겼습니다");
		}
		if(user==2 && rsp==2) {
			System.out.println("비겼습니다");	
		}
		*/
		
		int result=rsp-user;
		if(result==-2 || result==1) {
			System.out.println("졌습니다");			
		}
		if(result==-1 || result==2) {
			System.out.println("이겼습니다");			
		}
		if(result==0) {
			System.out.println("비겼습니다");			
		}
	}

}
