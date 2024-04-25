package 실습문제;

public class 배열문제2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score= {100,90,85};
		int sum=0;
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
			System.out.println((i+1)+"번 학생"+score[i]+"점");
		}
		System.out.println("총점"+sum);
	
	}

}
