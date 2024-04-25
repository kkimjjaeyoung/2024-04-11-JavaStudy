package 실습문제;

import java.util.Arrays;

public class 배열문제2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] total=new int[10];
		int even=0, odd=0;
		for(int i=0; i<total.length; i++) {
			total[i]=(int)(Math.random()*100)+1;
			if(total[i]%2==0) {
				even+=total[i];
			}
			else {
				odd+=total[i];
			}
		}
		System.out.println(Arrays.toString(total));
		System.out.println("짝수의합:"+even);
		System.out.println("홀수의합:"+odd);
	}

}
