package 실습문제;

public class 메소드2_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gop=1;
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				gop=j*i;
				System.out.printf("%d * %d = %d\n", i, j, gop);
			}
		}
		
	}

}
