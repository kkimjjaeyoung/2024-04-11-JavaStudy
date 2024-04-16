/*
 *  국영수 점수를 받아 총점, 평균, 학점(100~90:A, 89~80:B, 79~70:C, 69~60:D, 나머지F) 구하기
 */
import java.util.Scanner;
public class 제어문_단일조건문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int kor, eng, math;
		char score='A';				//지역변수는 초기값 필수
		
		System.out.println("국어점수 입력:");
		kor=scan.nextInt();
		System.out.println("영어점수 입력:");
		eng=scan.nextInt();
		System.out.println("수학점수 입력:");
		math=scan.nextInt();
		
		int avg=(kor+eng+math)/3;
		if(avg<=100 && avg>=90) {
			score='A';
		}
		if(avg<90 && avg>=80) {
			score='B';
		}
		if(avg<80 && avg>=70) {
			score='C';
		}
		if(avg<70 && avg>=60) {
			score='D';
		}
		if(avg<60) {
			score='F';
		}

		
		
		System.out.println("결과값 출력");
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+(kor+eng+math));
		System.out.printf("평균:%.2f\n",(kor+eng+math)/3.0);		// 	\n : 이후 문장을 다음 줄에 출력(ln)
																//	\t : tab. 같은 줄 내에서 일정 간격을 띄움.
		System.out.println("학점:"+score);
	}

}
