/*
 * 매개변수의 전송 : 매소드 안 변수는 메소드가 종료되면 자동으로 사라진다
 */

import java.util.Arrays;
import java.util.Scanner;
public class 메소드정리_4 {
	/*메소드연결
	 * 숫자야구개임
	 * 	1. 3개의 중복없는 난수 발생
	 * 	2. 사용자로부터 정수3개 입력
	 *  3. 난수와 사용자 입력 비교
	 *  4. 힌트 제공
	 *  5. 종료/재시작 여부 확인
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[3];
		for(int i=0; i<com.length; i++) {
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {			//중복체크
				if(com[i]==com[j]) {
					i--;						//중복이 있을 시 다시 발생
					break;
				}
			}
		}
		//System.out.println(Arrays.toString(com)); 		//난수 3개 출력식
		//사용자 입력->정답이 입력될때까지
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("세 자리 정수 입력 : ");
			int input=scan.nextInt();
			
			if(input<100 || input>99) {				//오류 처리(범위를 벗어난 값 처리)
				System.out.println("세 자리 정수를 입력 해 주십시오");
				continue;			//처음 상태로 회				
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[2]==user[3]) {
				
			}
			
			//비교
			int s=0, b=0;
			for(int i=0; i<com.length; i++) {
				for(int j=0; j<user.length; j++) {
					if(com[i]==user[j]) {
						if(i==j){
							s++;
						}
						else {
							b++;
						}
					}
				}
			}
			System.out.println("Input Number:%d, Result");
		}
	}

}
