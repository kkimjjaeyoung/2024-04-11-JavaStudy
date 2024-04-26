/*
 * 
 * 
 */

//3명의 국영수 점수를 입력받아 총점, 평균, 학점, 등수

import java.util.Scanner;

public class 중첩_for_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		/*
		 * 1.프로그램에 필요한 변수/배열 선언(저장공간 catch)	
		 * 2. 사용자 입력
		 * 3. 입력된 데이터 처리(요청 처리
		 * 4. 처리된 데이터를 출력(사용자에 반환)
		 */
		
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		
		//사용자입력
		//처리결과값
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] score=new char[3];
		int[] rank=new int[3];					// 용도별로 나눠서 저장
		
		for(int i=0; i<kor.length; i++) {

			
			System.out.print((i+1)+"번째 국어:");
			kor[i]=scan.nextInt();
			
			System.out.print((i+1)+"번째 영어:");
			eng[i]=scan.nextInt();
			
			System.out.print((i+1)+"번째 수학:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/(double)kor.length;
			
			switch(total[i]/30) {
			case 10:
			case 9:
				score[i]='A';
				break;
			case 8:
				score[i]='B';
				break;
			case 7:
				score[i]='C';
				break;
			case 6:
				score[i]='D';
				break;
			default:
				score[i]='F';
			}
		}
		//순위 결정
		for(int i=0; i<kor.length; i++) {
			rank[i]=1;
			for(int j=0; j<kor.length; j++) {
				if(total[i]<total[j]) {
					rank[i]++;
				}
			}
		}
		
		for(int i=0; i<kor.length; i++) {
			System.out.printf("%-5d%-5d%-5d%-5d%-7.2f%3c-3d%\n", kor[i], eng[i], math[i], total[i], avg[i], score[i], rank[i]);
		}
		
	}

}
