package 실습문제;

import java.util.*;

public class 메소드2_2_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("변경전");
		for(int i:arr) {
			System.out.println(i+" ");
		}
		System.out.println("변경후");
		/* 실무라면
		 * Arrays.sort(arr);
		 */
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}