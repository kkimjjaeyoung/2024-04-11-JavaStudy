package 실습문제;

public class 배열문제2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bus= {50, 45, 35, 12, 70};
		
		int sum=0;
		double avg=0.0;
		int max=bus[0];
		int min=bus[0];
		for(int i=0; i<bus.length; i++) {
			sum+=bus[i];
			if(max<bus[i]) {
				max=bus[i];
			}
			if(min>bus[i]) {
				min=bus[i];
			}
			System.out.println((i+1)+"번 사원"+bus[i]+"점");
		}
		System.out.println("총점 : "+sum);
		System.out.printf("평균 : %.2f\n", sum/(double)bus.length);			// bus의 데이터형 변경- 
																			//printf : 정수= %d, 실수= %f, 문자= %c, 문자열= %s
		System.out.println("실적이 가장 높은 수:"+max);
		System.out.println("실적이 가장 낮은 수:"+min);
	}

}
