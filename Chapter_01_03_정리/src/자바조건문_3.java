/*
 *  if~else : 대/소문자, 양/음수, 쩍/홀수, 로그인, 아이디중복 
 */
public class 자바조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		if (c>='A' && c<='Z') {
			System.out.println(c+"는(은) 대문자");
			System.out.println(c+"의 소문자는 "+((char)(c+32)));		//대문자와 소문자의 차이는 32
			}
		else {
			System.out.println(c+"는(은)소문자");
			System.out.println(c+"의 대문자는 "+((char)(c-32)));
		}
	}

}
