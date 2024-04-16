/*
 * 
 */
import java.util.Scanner;
public class 연산자_삼항연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char c='A';
		System.out.println(c>='A' && c<='Z'?"대문자":"소문자");
				*/
		Scanner scan=new Scanner(System.in);			//클래스를 저장할땐 반드시 new(동적메모리 할당). //System.in : 키보드로부터 값을 받는다
		System.out.println("알파벳 입력");
		char c=scan.next().charAt(0);		//문자 1개를 받는 경우
		System.out.println("c="+c);			
				/*
				 *  문자입력 scan.next().charAt(0)
				 *  정수입력 scan.nextInt()
				 *  논리입력 scan.nextboolean()
				 *  실수입력 scan.nextDouble()
				 * 
				 * 변수 초기화 방법(저장방법)
				 * 		명시적 초기화 (int a=10)
				 * 		난수발생( Math.random() )
				 * 		입력값 받기(Scanner / BufferedReader)
				 * 
				 */
		System.out.println(c>='A' && c<='Z'?"대문자":"소문자");
		
		System.out.println("국여, 영어, 수학 입력:(60 70 80):");
		kor=scan.nextInt();
		eng=scan.nextInt();
		math=scan.nextInt();
	}

}
