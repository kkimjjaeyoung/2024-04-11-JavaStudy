/*
 * 
 */

import java.lang.reflect.Array;
import java.util.*;
public class 배열_for_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto=new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(lotto[j]==lotto[i]){
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		//정렬 후 출력
		for(int i=0; i<lotto.length;i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		System.out.println("오늘의 로또번호");
		for(int i:lotto ) {					//2초후 출력
			System.out.println(i+" ");
			try {
				Thread.sleep(2000);
			}
			catch 
			
		}
	}

}
