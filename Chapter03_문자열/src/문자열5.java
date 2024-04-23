/*
 *  subString(int startIndex)
 *  subStartIndex, int endIndex)
 */


//체리:chery

public class 문자열5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c="체리:chery";
		System.out.println("체리의 영어는?");
		System.out.println("영어는"+c.substring(c.indexOf(":")+1));		//subString은 문자열을 자르는 경우	
		
		String msg="Hello Java";
		System.out.println(msg.substring(3,8));				//3번째부터 8번째까지 자르기, 마지막 문자는 생략
		System.err.println(msg.substring(0,7)+1);
	}

}
