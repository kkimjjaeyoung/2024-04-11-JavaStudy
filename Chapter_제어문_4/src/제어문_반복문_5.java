/*
 * 1~100의 짝수의 합, 홀수의 합, 전체합, 
 */
public class 제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, even=0, odd=0;			//초기값
		int ecnt=0, ocnt=0;					//갯수
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				even+=i;		//짝수합
				even++;			//짝수 갯수
			}
			else {
				odd+=i;			//홀수합
				ocnt++;			//홀수 갯수
			}
			sum+=i;
		}
		System.out.println("1~100 사이의 짝수 합:"+even);
		System.out.println("1~100사이의 짝수의 갯수:"+ecnt);
		System.out.println("1~100 사이의 홀수 합:"+odd);
		System.out.println("1~100 사이의 홀수 합:"+ocnt);
		System.out.println("1~100 사이의 숫자 합"+sum);
	}

}
