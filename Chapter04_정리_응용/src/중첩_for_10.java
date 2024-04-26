/*
 * 
 * 
 */

// 알파벳 10개를 임의로 추출한 후 정렬해서 출력
import java.util.*;
public class 중첩_for_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alp=new char[10];
		for(int i=0; i<alp.length; i++) {
			alp[i]=(char)((Math.random()*26)+65);
		}
		System.out.println("정렬:");
		System.out.println(Arrays.toString(alp));
		
		for(int i=0; i<alp.length;i++) {
			for(int j=i+1; j<alp.length; j++) {
				if (alp[i]>alp[j]) {
					char temp=alp[i];
					alp[i]=alp[j];
					alp[j]=temp;
				}
			}
			System.out.println(Arrays.toString(alp));
		}
		for(int i=0; i<alp.length;i++) {
			for(int j=i+1; j<alp.length; j++) {
				if (alp[i]<alp[j]) {
					char temp=alp[j];
					alp[i]=alp[i];
					alp[j]=temp;
				}
			}
			System.out.println(Arrays.toString(alp));
		}
	}

}
