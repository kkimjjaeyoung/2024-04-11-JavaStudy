/*
 *  정렬
 *  	버블정렬 (인접한 수끼리 비교) -> 뒤에서부터 고정
 *  27,22,17,23,9,2	->	2,9,17,22,23,27(ASC:올림차순)' 
 *	
 */

import java.util.*;

public class 중첩_for_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {27,22,17,23,9,2};
		System.out.println("정렬전");
		System.out.println(Arrays.toString(arr));
		System.out.println("정렬후");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println("과정ASC"+Arrays.toString(arr));
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println("과정DESC"+Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}

}
