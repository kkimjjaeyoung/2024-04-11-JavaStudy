package 실습문제;

public class 자바1주정리_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int a=1; a<=6; a++) {
			for (int b=1; b<=6; b++) {
				if (a+b==6) {
					System.out.printf("[%d, %d]\n",a,b);
				}
			}
		}
	}

}
