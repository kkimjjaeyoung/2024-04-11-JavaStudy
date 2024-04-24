/*
 *  대입연산자>메모리에 변수 저장
 *  		int a=10; 10을 a라는 메모리에 저장
 *  	형변환 : int a='A'	작은값에 대입 가능, 65로 변경후 저장
 *  			long l=20;	20->20L
 *  			double d=20;	20.2
 */

/*
 *  복합대입연산자(+=, -=, *=, /=) : int a=10;
 *  	+= : a+=1;	->	a=a+1;	->	a=11
 *  	-= : a-=1;	->	a=a-1;	->	a=9
 *  	*= : a*=2;	->	a=a*2;	->	a=20
 *  	/= : a/=2;	->	a=a/2;	->	a=5
 */
public class 연산자_대입연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l=20;		//ㅣ값이 long값으로
		System.out.println("l="+l);
		
		double d=20;
		System.out.println("d="+d);
		
		int a=10;
		a++;
		a++;
		a++;
		a++;
		a++;
		System.out.println("a="+a);
		int b=10;
		b+=10;
		System.out.println("b="+b);
		
		int score1=10;
		int score2=5;
		score1+=score2;
		System.out.println("score1="+score1);
		
		score1-=score2;
		System.out.println("score1="+score1);
		
		int m=10;
		m++;			//m=11
		m+=10;			//m=21
		int n=20;
		System.out.println(m+n);
		System.out.println("n="+n);
	}

}
