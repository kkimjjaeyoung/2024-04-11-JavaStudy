package 실습문제;

public class 자바제어문_1회차문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int plu=0;
		int cun=0;
		
		for(int i=100; i<=999; i++) {
			if(i%4!=0) {
				cun++;
				plu+=i;
			}
			}
		System.out.println("4의 배수가 아닌 수의 갯수:"+cun);
		System.out.println("4의 배수가 아닌 수의 합:"+plu);
	}

}
