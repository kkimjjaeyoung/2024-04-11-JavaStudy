//3개 정수 입력, 총점, 편균, 학점,출력

import java.util.*;
public class 메소드4 {
	static int scoreInput(String subject) {
		Scanner scan=new Scanner(System.in);
		System.out.println(subject+" 점수 입력:");
		return scan.nextInt();
	}
	static int scoreTotal(int k, int e, int m) {
		return k+e+m;
	}
	static double scoreAvg(int total) {
		return total/3.0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=scoreInput("국어");
		int eng=scoreInput("영어");
		int math=scoreInput("수학");
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		int total=scoreTotal(kor, eng, math);
		double avg scoreAvg(total);
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
	}

}
