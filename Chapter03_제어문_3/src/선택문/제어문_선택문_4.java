//중복인 경우 


package 선택문;

public class 제어문_선택문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=(int)(Math.random()*11);
		System.out.println("score="+score);
		switch(score) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
			default:
				System.out.println("F학점");
		}
	}

}
