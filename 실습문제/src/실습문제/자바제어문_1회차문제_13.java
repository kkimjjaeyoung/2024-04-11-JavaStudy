package 실습문제;

public class 자바제어문_1회차문제_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=10; i++) {
			int num=(int)(Math.random()*10)+1;
			sum+=num;
			System.out.println(num+" ");
		}
		System.out.println();
		System.out.printf("평균: %2f", sum/10.0);
	}

}
