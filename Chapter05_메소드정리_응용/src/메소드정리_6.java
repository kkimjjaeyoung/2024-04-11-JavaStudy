import java.util.Scanner;

public class 메소드정리_6 {
	//클래스 영역에 선언시 모든 메소드에 적용 가능(멤버변수)				
		//지역변수 : 메소드 안에서 사용(리턴형)
	static int[] kor=new int[3];
	static int[] eng=new int[3];
	static int[] math=new int[3];
	static int[] total=new int[3];
	static double[] avg=new double[3];
	static int[] rank=new int[3];
	static char[] score=new char[3];
	
	static void userInput() {
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
	
	static void rankChange() {
		for(int i=0; i<total.length; i++) {			//등수
			rank[i]=1;
			for(int j=0; j<total.length; j++) {
				if(total[i]<total[j]) {
					rank[i]++;
				}
			}
		}
	}
	
	static void print() {
		for(int i=0; i<3; i++){					
			System.out.println(kor[i]+" "+eng[i]+" "+math[i]+" "+total[i]+" "+avg[i]+" "+score[i]+" "+rank[i]+" ");
		}
	}
	
	static void process() {
		userInput();
		rankChange();
		print();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
