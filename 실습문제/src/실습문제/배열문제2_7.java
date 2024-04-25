

package 실습문제;

import java.util.*;
public class 배열문제2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] abc=new char[5];
		for(int i=0; i<abc.length; i++) {
			abc[i]=((char)(Math.random()*26)+65);
		}
		System.out.println("변경전");
		System.out.println(Arrays.toString(abc));
		System.out.println("변경후");
		Arrays.sort(abc); 			//올림차순
		System.out.println(Arrays.toString(abc));
		for(int i=abc.length-1; i>=0; i--) {
			System.out.println(abc[i]+" ");
		}
	}

}
