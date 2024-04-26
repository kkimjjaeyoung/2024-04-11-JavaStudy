/*
 *  1차 : 줄4 갯1~4,		2차 : 1~5
 * 
 * 	A~P 줄4 갯4
 * 
 * 	A~D 4번
 * 
 *   1차 : 줄4 갯1~4,		2차 : 1~5	(ooxoo)
 *   
 *   xoooo, oxooo, ooxoo ...
 *   
 *   oooox, oooxo, ooxoo ...
 *   
 *   !@#$ 4번
 */

public class 중첩_for_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=4; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		char c='A';
		for(int i=1; i<=4; i++) {
			for(char j=1; j<=4; j++) {
				System.out.print(c++);
			}
			System.out.println();
		}
		
		System.out.println();

		for(int i=1; i<=4; i++) {
			char al='A';						//변수 위치에 따른 출력값 변환
			for(char j=1; j<=4; j++) {
				
				System.out.print(al++);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5; j++) {
				if(j==3) {
					System.out.println("x");
			}
				else {
					System.out.println("o");
				}
			}
		}
		
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j) {
					System.out.println("x");
			}
				else {
					System.out.println("o");
				}
			}
		}
		
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j) {
					System.out.println("x");
			}
				else {
					System.out.println("o");
				}
			}
		}
		
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==6-j || i==j) {
					System.out.println("x");
			}
				else {
					System.out.println("o");
				}
			}
		}
		
		System.out.println();
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				char[] imo= {' ', '1', '2', '3', '4'};
				System.out.println(imo[j]);
			}
		}
		
	}
}

