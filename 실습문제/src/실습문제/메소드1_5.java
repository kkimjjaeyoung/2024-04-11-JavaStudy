package 실습문제;
import java.util.*;
public class 메소드1_5 {
	
	static String mun5(String str) {
		return str.toUpperCase();
	}
	/*for문으로
	 * string res="";
	 * for(int i=0; i<str.lenght(); i++){
	 * char c=str.chatAr(i);
	 * if(c>='A' && c<='Z'){
	 * res+=c;}
	 * else if (소문자일경우) {
	 * res+=(char)(c-32);}
	 * else{
	 * }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력:");
		String str=scan.next();
		String res=mun5(str);
		System.out.println(res);
		
		
	}

}