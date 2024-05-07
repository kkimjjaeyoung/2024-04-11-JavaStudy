//3명의 학생의 국영수 점수를 받아 총점, 평균, 학점, 등수 구하기

import java.util.*;
public class 메소드정리_5 {
	static void userInput(int[] kor, int[] eng, int[] math, int[] total, double[] avg, char[] score) {
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<kor.length; i++) {
			System.out.println((i+1)+"번째 국어");
			kor[i]=scan.nextInt();					
			System.out.println((i+1)+"번째 영어");
			eng[i]=scan.nextInt();
			System.out.println((i+1)+"번째 수학");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];				//총점
			avg[i]=total[i]/3.0;						//평균
			
			switch(total[i]/30) {						//학점
			case 10: case9: {
				score[i]='A';
				break;
			}
			case 8:{
				score[i]='B';
				break;
			}
			case 7:{
				score[i]='C';
				break;
			}
			case 6:{
				score[i]='D';
				break;
			}
			default:{
				score[i]='F';
				break;
			}
			}

		}	
	}
	
	static void rankChange(int[] total, int[] rank) {
		for(int i=0; i<total.length; i++) {			//등수
			rank[i]=1;
			for(int j=0; j<total.length; j++) {
				if(total[i]<total[j]) {
					rank[i]++;
				}
			}
		}
	}
	
	static void print(int[] kor, int[] eng, int[] math, int[] total, double[] avg, char[] score, int[] rank) {
		for(int i=0; i<3; i++){					
			System.out.println(kor[i]+" "+eng[i]+" "+math[i]+" "+total[i]+" "+avg[i]+" "+score[i]+" "+rank[i]+" ");
		}
	}

	static void process() {
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		int[] rank=new int[3];
		char[] score=new char[3];
		userInput(kor, eng, math, total, avg, score);
		rankChange(total, rank);
		print(kor, eng, math, total, avg, score, rank);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();
		
		
		/*int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		int[] rank=new int[3];
		char[] score=new char[3];
		
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<kor.length; i++) {
			System.out.println((i+1)+"번째 국어");
			kor[i]=scan.nextInt();					
			System.out.println((i+1)+"번째 영어");
			eng[i]=scan.nextInt();
			System.out.println((i+1)+"번째 수학");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];				//총점
			avg[i]=total[i]/3.0;						//평균
			
			switch(total[i]/30) {						//학점
			case 10: case9: {
				score[i]='A';
				break;
			}
			case 8:{
				score[i]='B';
				break;
			}
			case 7:{
				score[i]='C';
				break;
			}
			case 6:{
				score[i]='D';
				break;
			}
			default:{
				score[i]='F';
				break;
			}
			}

		}	
		for(int i=0; i<total.length; i++) {			//등수
			rank[i]=1;
			for(int j=0; j<total.length; j++) {
				if(total[i]<total[j]) {
					rank[i]++;
				}
			}
		}
		for(int i=0; i<3; i++){						//출력
			System.out.println(kor[i]+" "+eng[i]+" "+math[i]+" "+total[i]+" "+avg[i]+" "+score[i]+" "+rank[i]+" ");
		}
	}
	*/
	}
}