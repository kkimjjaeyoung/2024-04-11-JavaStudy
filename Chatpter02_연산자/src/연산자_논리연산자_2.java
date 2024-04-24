/*
 * 
 */

// 점수 >=60 <=100 = true
public class 연산자_논리연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=(int)(Math.random()*100)+1;
		System.out.println("난수값:"+score);
		
		boolean bCheck=(score>=60) && (score%2==0);
		System.out.println(bCheck);
		// score가 40이상이고 score홀수
		boolean cCheck=(score>=40) && (score%2==1);
		System.out.println(cCheck);
		
		bCheck=(score>=40) && (score%2!=0);
		System.out.println(bCheck);
		
		int a=10;
		a++;		//a=11
		a=100;
		a++;		//a=101
		a=200;
		a++;		//a=201
		a=300;
		a--;		//a=299
		System.out.println(a);		//변수는 필요시 변경가능. 
	}

}
