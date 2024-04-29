//char 리턴->알파벳 전송(대소문자 바꿔주기)
public class 메소드7 {
	
	static char upper(char c) {
		return (char)(c-32);
	}
	static char lower(char c) {
		return (char)(c+32);
	}

	static char upperLower(char c) {					//한번에 변환
		char res=' ';		//결과값이 여러개인 경우 변수선언 후 시작
		if(c>='A' && c<='Z') {
			res=(char)(c+32);
		}
		else {
			res=(char)(c-32);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=upper('m');
		System.out.println(c);
		c=lower('M');
		System.out.println(c);
		

		
	}

}
