/*
 * 3개의 중복없는 난수
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class 메소드6 {

	static void rand(int num) {				//매개변수 num
		int[] aom=new int[num];
		for(int i=0; i<aom.length; i++) {
			aom[i]=(int)(Math.random()*100)+1;
			for(int j=0; j<i; j++) {
				if(aom[i]==aom[j]) {
					i--;
					break;
				}
			}
		}			
		System.out.println(Arrays.toString(aom));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rand(5);
	}

}
