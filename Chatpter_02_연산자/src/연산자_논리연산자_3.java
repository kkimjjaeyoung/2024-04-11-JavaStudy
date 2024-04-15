/*
 * 	||(or) 연산자	: 조건중 하나 이상이 true 면 true인 연산자. 범위를 벗어난 경우 주로 처리.
 */
public class 연산자_논리연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=(int)(Math.random()*100)+1;		//0+1~99+1 추출
		boolean bCheck=(score<30) || (score>70);
		System.out.println(score);
		System.out.println(bCheck);
	}

}
