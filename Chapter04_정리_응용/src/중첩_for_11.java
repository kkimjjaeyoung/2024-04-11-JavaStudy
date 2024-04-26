/*
 * API
 */

import java.util.*;
public class 중첩_for_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		//전부 지원하지 않음-> 직접 만들어서 사용(오버로딩), 기존 라이브러리 수정(오버라이딩)
		
		
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("정렬 후:");
		System.out.println(Arrays.toString(arr));  			//ASC만 가능(오름차순만 가능)
		
		for(int i=arr.length-2; i>=0; i--) {
			System.out.println(arr[i]+" ");
		}
	}

}
