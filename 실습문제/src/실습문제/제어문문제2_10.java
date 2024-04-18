package 실습문제;

public class 제어문문제2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=30; i++) {
		if(i%2==0) {
			System.out.printf("%2d ", i);
			if(i%3==0) {
				System.out.println();
			}
		}
		}
	}

}
