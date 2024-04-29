
import java.util.*;
public class 메소드2 {

	static boolean isLogin(String id, String pwd) {
		//매개변수 여러개 사용 가능. 리턴형 1개만 사용
		//매개변수가 ㅁ낳은 경우 : 클래스, 배열 -> 3개 이상
		final String ID="admin";
		final String PWD="1234";
		/*
		 * 매소드 안에서 선언된 변수, 상수, 매개변수는 메소드 안에서만 사용 가능.
		 */
		boolean bCheck=false;
		if(id.equals(ID) && pwd.equals(PWD)) {
			bCheck=true;
		}
		else { 
		bCheck=false;
		}
		
		return bCheck;		//사용자 요청에 대한 반환값
		//리턴에 사용하는 데이터형과 실 전송갑 일치
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디 입력");
		String id=scan.next();
		System.out.println("비밀번호 입력:");
		String pwd=scan.next();
		//기능 요청
		//메소드에서 넘겨주는 결과값 받기
		//기능처리->윈도우, 브라우저 출력
		boolean bCheck=isLogin(id, pwd);			//숫자인경우 큰 데이터형으로 수령 가능
		
		if(bCheck) {
			System.out.println(id+"님 로그인 되었습니다!");
		}
		else System.out.println("아이디나 비밀번호가 틀립니다.");
	}

}
