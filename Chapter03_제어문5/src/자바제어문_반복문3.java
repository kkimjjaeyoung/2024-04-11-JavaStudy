/*
 * 1~100까지 정수 중 3의 배수 갯수, 5의 배수 갯수, 7의 배수 갯수
 */

public class 자바제어문_반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0;
		int a5=0;
		int a7=0;			//갯수 누적
		for (int i=1; i<=100; i++) {
			if (i%3==0) {
				a3++;
			}
			if (i%5==0) {
				a5++;
			}
			if (i%7==0) {
				a7++;
			}
			System.out.println("1~100 3의배수"+a3);
			System.out.println("1~100 5의배수"+a5);
			System.out.println("1~100 7의배수"+a7);
		}
	}
}
