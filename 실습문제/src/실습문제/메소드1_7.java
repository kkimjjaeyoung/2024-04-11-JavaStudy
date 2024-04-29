package 실습문제;

public class 메소드1_7 {
	static void ban(String msg) {
		for(int i=msg.length()-1; i>=0; i--) {
			System.out.println(msg.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ban(msg);
	}

}
