/*
 * 
 *  5. for-each : 배열데이터형과 변수명의 데이터 일지. 실제 배열에 저장값. 형변환 불가. 출력만 가능.배열값 변경과 초기화 불가
 */
public class 배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 10개 저장 -> 용도가 같은 경우에만 배열
		int[] arr=new int[10];		//변수 10개. arr에 배열. 데이터형이 같다
		char[] alpha= {'A', 'B', 'C', 'D', 'E'};			//char 5개
		double[] data= {10.5, 20.0, 30.5, 40.5, 50};			//데이터형 변환(int 50 -> double 50.0)
		for(double d:data) {								
			System.out.println(d);
		}
		int[] arr2= {'A', 'B', 'C', 'D', 'E'};				//작은 데이터형(int, byte, char)은 추가 가능
		for (int i:arr2) {
			System.out.println(i);
		}
		char[] ch= {65,66,67,68,69};			//char와 int 는 서로 형변환없이 저장 가능
		for (char c:ch) {
			System.out.println(c);
		}
		//큰 데이터형으로 값이 설정
		boolean[] boo=new boolean[5];			//false(0), true(1)
		for(boolean b:boo) {
			System.out.println(b);
		}
		String[] str=new String[5];			//클래스->null
		for(String s:str) {
			double[] dd=new double[5];		//0.0
			for(double d:dd) {
				System.out.println(d);
			}
		}
	}

}
