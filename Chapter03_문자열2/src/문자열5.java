
public class 문자열5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String s1="Hello";
		String s2="hello";
		
		if(s1.equalsIgnoreCase(s2)) {			//equals : 같은 경우 true, 다른경우 false(비밀번호 등)		equalsIgnoreCase : 대소문자 구분안함(검색기 등)			둘 다 조건문에서 주로 사용
			System.out.println("s1 s2가 같다");
		}
		else {
			System.out.println("s1과 s2가 다름");
		}
	}*/
		String msg="Hello Java";
		for (int i=0; i<msg.length()-1; i++) {				//정방향 출력
			System.out.println(msg.charAt(i));
		}
		for (int i=msg.length()-1; i>=0; i--) {				//거꾸로 출력
			System.out.println(msg.charAt(i));
		}
		// length() 문자갯수 -> index=0 시작으로 -1이 필요
	}
}
