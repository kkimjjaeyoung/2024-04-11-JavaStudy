
//매개변수 : 메소드 자체에서 출력
//단입력을 받아 해당 단을 출력

import java.util.*;

public class 메소드4 {

	static void gugudan(int dan) {			//결과값이 없는 경우 void사용
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan(2);						//반복 제어
		System.out.println();
		gugudan(3);
		System.out.println();
		gugudan(4);
		System.out.println();		
		gugudan(5);
		System.out.println();		

		for(int i=1; i<=9; i++) {
			gugudan(i);				//항상 호출시 처음부터 수행
		}
	}

}
