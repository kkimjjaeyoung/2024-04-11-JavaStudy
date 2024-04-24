/*
 *  비교연산자(==, !=, <, >, <=, >=) : true/false로 나오며 숫자(정수,실수), 문자, boolean(==, !=만 사용 가능)사용가능, 조건문엔 자주 쓰임(if, if~else, 삼항연산자)
 *  
 */
public class 연산자_비교연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=30.5;
		double e=20.0;
		
		System.out.println("d="+d+", e="+e);
		System.out.println(d+"=="+e+":"+(d==e));
		System.out.println(d+"!="+e+":"+(d!=e));
		System.out.println(d+"<"+e+":"+(d<e));
		System.out.println(d+">"+e+":"+(d>e));
		System.out.println(d+"<="+e+":"+(d<=e));
		System.out.println(d+">="+e+":"+(d>=e));


	}

}
