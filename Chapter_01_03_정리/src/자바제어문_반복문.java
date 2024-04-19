/*
 *  반복문 : 중복을 제어할 때 사용
 *  	for : 반복 횟수가 지정된 경우		(front-end)
 *  	while : 반복 횟수를 모르는 경우	(back-end)
 */

//1~45 정수중 6개를 추출
public class 자바제어문_반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int num1=(int)(Math.random()*45)+1;
		System.out.println(num1+" ");
		int num2=(int)(Math.random()*45)+1;
		System.out.println(num2+" ");
		int num3=(int)(Math.random()*45)+1;
		System.out.println(num3+" ");
		int num4=(int)(Math.random()*45)+1;
		System.out.println(num4+" ");
		int num5=(int)(Math.random()*45)+1;
		System.out.println(num5+" ");
		int num6=(int)(Math.random()*45)+1;
		System.out.println(num6+" ");
		*/
		
		for (int i=1; i<=6; i++) {
			int num1=(int)(Math.random()*45)+1;
			System.out.println(num1+" ");
		}
	}

}
