package 실습문제;

public class 자바제어문_1회차문제_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a7=0;			//for문
		int a9=0;
		for(int i=1; i<=1000; i++) {
			if(i%7==0) {
				a7+=i;
			}
			if (i%9==0) {
				a9+=i;
			}
		}
		System.out.println("7의 배수: "+a7);
		System.out.println("9의배수:"+a9);
		System.out.println("7의배수+9의배수"+(a7+a9));
		
		a7=0;					//while문으로의 초기화
		a9=0;
		int i=1;
		while(i<=1000) {
			if(i%7==0) {
				a7+=i;
			}
			if (i%9==0) {
				a9+=i;
			}
		}
		System.out.println("7의 배수: "+a7);
		System.out.println("9의배수:"+a9);
		System.out.println("7의배수+9의배수"+(a7+a9));
	}

}
