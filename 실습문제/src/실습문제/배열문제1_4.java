package 실습문제;

import java.util.Arrays;

public class 배열문제1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[10];
		for(int i=0; i<arr.length; i++) { 
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=arr) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}

		
	}

}
