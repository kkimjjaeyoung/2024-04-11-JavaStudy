/*
 * 
 * 
 * 
 * 배열 ->변수(인덱스번호로 구분)를 모아 한 이름으로 제어. 데이터 추가, 삭제 불가능(선언개수만큼만 사용 가능), 	**갯수를 늘릴 땐 새로운 배열을 생성(복사:arraycopy)
 * 			-> 제어문 사용 편리, 0부터 순서적. 인덱스번호만 참조해 코딩
 * 		선언 : 데이터명[] 배열명;				데이터형 배열명[];				같은 데이터형, 같은 사용용도를 가져야함
 * 		초기화 : 배열명= new 데이터형[]{}->선언과 동시에 초기화			데이터형[] 배열명={ , , ,}			데이터형[] 배열명=new 데이터형[갯수]->자동초기화
 * 			배열 갯수 확인 : 배열명.lenght
 * 			배열 한개씩 사용 : 배열명[인덱스]=값		읽기 : 배열명[인덱스]	
 * 
 * 	ex) int[] arr={10,20,30};			arr[0]=10,arr[1]=20...		
 * 
 */

package 실습문제;

public class 배열문제1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n1= {1,2,3,4,5};
		System.out.println(n1.length);
		int n2[]= {0};			// c/c++에서 주로 사용
		System.out.println(n2.length);
		int[] n3=new int[3];
		System.out.println(n3.length);
		//int n4[3]=new int[3]; 	배열로 데이터를 저장
	}

}
