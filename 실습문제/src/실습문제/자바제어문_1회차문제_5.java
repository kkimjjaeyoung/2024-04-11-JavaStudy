package 실습문제;

public class 자바제어문_1회차문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int plu=0;
		int cun=0;
		
		for(int i=100; i<=999; i++) {
			if(i%7==0) {
				cun++;			//i값의 갯수
				plu+=i;			//i값의 누적
			}
			}
		System.out.println("7의 배수의 갯수:"+cun);
		System.out.println("7의 배수의 합:"+plu);
	}

}
