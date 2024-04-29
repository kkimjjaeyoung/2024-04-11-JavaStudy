
public class 메소드3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck=메소드2.isLogin("admin", "1234");
		if(bCheck) {
			System.out.println("로그인성공");
		}
		else {
			System.out.println("로그인 실패");
		}
	}

}
