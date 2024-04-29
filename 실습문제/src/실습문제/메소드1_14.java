package 실습문제;

public class 메소드1_14 {
	static void munje_14(int num) {
		System.out.println(num);
		String s=String.valueOf(num);		//valueOf : 모든 데이터형을 문자열로 전환
		for(int i=s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
