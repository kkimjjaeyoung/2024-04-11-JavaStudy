package 실습문제;

import java.util.*;
public class 배열문제1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];						//배열선언
		for(int i=0; i<arr.length; i++) {			//초기화
			arr[i]=(int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(arr));	//요청처리
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		double avg=sum/(double)arr.length;					//결과값 출력
		System.out.printf("평균:%.2f", avg);
	}

}
