package 선택문;

public class 제어문_선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*3);			//0, 1, 2로 한정
		switch(com) {			//정수형=상수형
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
		}
	}

}
