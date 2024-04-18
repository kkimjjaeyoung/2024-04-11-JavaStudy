package 실습문제;

public class 제어문문제2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i=1;i<=10;i++) {
			if(i%2==0);{
				sum-=i;
			}
			else {
				sum+=i;
			}
		}
		System.out.println("계산값:"+sum);
	}

}
