package 실습문제;

public class 자바1주정리_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int a=3; a<=4462; a++)
			if (a%2==0) {
				sum+=a;
			}
		System.out.println(sum);
	}

}
