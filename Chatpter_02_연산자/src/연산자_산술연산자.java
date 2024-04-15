import java.util.*;			//라이브러리 읽어오기
public class 연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//임의 변수 지정, 선언
		int num1, num2;			//사용시 오류
		Random r=new Random();	//초기화
		num1=r.nextInt(101);		//0~100까지 사이 정수 추출(마지막 제외)
		num2=r.nextInt(101);
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		
		//+
		int plus=num1+num2;
		System.out.println("plus="+(num1+num2));
		
		int gop=num1*num2;
		System.out.println("gop="+gop);
		
		int a=10;
		int b=3;
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(a/(double)b);
		
		System.out.println(a%b);
		System.out.println(a%-b);
		System.out.println(-a%b);
		System.out.println(-a%-b);
	}

}
