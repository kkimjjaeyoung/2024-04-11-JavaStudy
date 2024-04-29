package 실습문제;
import java.util.*;
public class 메소드1_3 {
	static int num3(int n) {		//n 사용자의 요청값
	int sum=0;
	for(int i=1; i<=n; i++) {
		sum+=sum+i;
	}
	return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수입력");
		int n=scan.nextInt();
		int sum=
	}

}
