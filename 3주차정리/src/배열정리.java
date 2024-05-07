/*
 * 배열 : 같은 데이터형의 데이터들을 모아서 관리. 연속적으로 같은 크기의 메모리 생성, 고정적, 한 이름으로 여러 변수 제어 가능
 * 																->단점 보완 : collection(가변)
 * 	선언 : 데이터형[] 배열명; , 데이터형 배열명[];
 * 	초기화 : 데이터형 [] 배열명={, , , , ...}; , 데이터형[] 배열명=new 데이터형[갯수]
 * 	인덱스 : int[] arr={1,2,3,4,5}		//인덱스는 무조건 0번부터 순차적으로. 범위를 벗어나면 arrayindexoutofboundsexception 에러 발생
 * 	
 * for-each : 많이 사용되는 for						// 데이터 수정(x), 출력용
 * 	for(배열에 저장된 데이터를 받는 변수:배열)			// 반드시 배열 데이터형과 일치 , 실제 배열에 저장된 값을 읽어온다
 */

import java.util.*;
public class 배열정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		List list=new ArrayList();		//배열수가 고정되지 않음. 
		list.add(1);
	}

}
