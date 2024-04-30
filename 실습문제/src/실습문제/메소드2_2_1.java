package 실습문제;

import java.util.*;
public class 메소드2_2_1 {
	static int input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("0~32767사이의 정수 입력 : ");
		return scan.nextInt();
	}
	static int[] binaryCheck(int num) {
		int[] binary=new int[16];		//new(동적 메모리 할당)를 이용해 16의 정수가 0으로 초기화	 
		/*
		 * int=0
		 * double=0.0
		 * boolean=false
		 * char=\0
		 * string=null
		 */
		int index=15;		//인덱스 번호 15. 뒤에서부터 값을 저장
		while(true) {			//무한루프. 반복횟수를 모르는 경우
			//2로 나누고 0이 될때까지 반복
			binary[index]=num%2;
				num=num/2;
				if(num==0) {
					break;
				}
				index--;
		}
		return binary;
	}
	static void print(int[] binary) {
		for(int i=0; i<binary.length; i++) {
			if(i%4==0 && i!=0) {
				System.out.println(" ");
			}
			System.out.println(binary[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 입력
		input();
		
		//이진법 처리
		binary();
		
		//출력
		 
	}

}
