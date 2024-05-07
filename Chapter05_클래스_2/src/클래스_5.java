/*
 * 
 * 
 *  ***객체지향 프로그램
 * 
 * 	*** 예외처리(프로그램이 비정상 종료를 막음)
 */

class Movie{
	int rank;
	String title;
	String reserve;
	String regdate;
}
public class 클래스_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m1=new Movie();
		System.out.println("m1="+m1);				//메모리 주소
		m1.rank=1;
		m1.title="범죄도시4";
		m1.reserve="27.4%";
		m1.regdate="2024.04.24";
		
		Movie m2=new Movie();
		System.out.println("m2="+m2);
		m2.rank=2;
		m2.title="혹성탈출-새로운 시대";
		m2.reserve="24.2%";
		m2.regdate="2024.05.08";
		
		Movie m3=new Movie();
		System.out.println("m3="+m3);
		m3.rank=3;
		m3.title="악마와의 토크쇼";
		m3.reserve="15.2%";
		m3.regdate="2024.05.08";
	}

}
