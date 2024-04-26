/*
 * 구구단 
 * 
 * 
 */


public class 중첩_for_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=9; i++) {				//줄수
			for (int j=1; j<=9; j++) {			//출력 갯수
				//구구단출력
				System.out.printf("%2d * %2d = %2d\t", j, i, j*i);
			}
			//다음출에 출력
			System.out.println();
		}
	}

}
