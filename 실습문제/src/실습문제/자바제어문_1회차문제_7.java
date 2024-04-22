package 실습문제;

public class 자바제어문_1회차문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int n=0;
		for(int i=1; i<=30; i++) {
			if (i%2==0) {
				a+=i;
			}
			else {
				n+=i;
			}

		}
		System.out.println(a);
		System.out.println(n);
	}

}
