/*
 * 1)
 * 
 * 2) 초기화->실제값을 초기화
 * 	int arr[];
 * 	arr=new int[]{1, 2, 3, 4,}		int[] arr=new int[5] -> 0으로 초기화			
 * 		int[]=0
 * 		double[]=0.0
 * 		boolean[]=false
 * 		string[]=null14
 * 		long[]=0L
 * 		char[]='\0'=공백
 * 			**new 연산자 : malloc() 로 사용되다 연산자로 승격. 동적 메모리 할당(생성), 실행시마다 메모리 확보(메모리 따라 생성), 메모리 주소가 다르다
 * 					참조변수 : 주소를 이용해 원하는 데이터에 접근
 *	3) 값 변경
 *		int[] arr={10,20,30,40,50}
 *		stack(주소)					Heap(실제 데이터가 저장되는 영역)
 *			배열변수는 시작 주소값만 가짐		arr[n] -> 0x10주소로부터 n-1번째값
 *		arr[2]=100	->	30이 삭제, 100으로 변경
 *		배열의 값 변경시 : 배열명[인덱스]		.	lenght(갯수)
 *	배열복사 
 *		얕은 복사 : 공유
 *		깊은 복사 : 새로운 배열을 생성
 *	4) 출력(for-each)
 */
public class 배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		System.out.println(arr);			//실제 주소값 출력
		int[] arr1=new int[5];
		System.out.println(arr1);
		//얕은 복사
		int[] arr2= {10,20,30,40,50};
		int[] temp=arr2;
		temp[0]=100;
		temp[1]=200;					//데이터 공유해 카피를 수정해도 원본데이터 또한 바뀜
		System.out.println(arr2[0]);
		//깊은복사. 새로운 배열 생성. 배열은 메모리 주소를 이용. 같은 메모리 제어
		int[] arr3= {10,20,30,40,50};
		int[] temp1=arr.clone();
		temp1[0]=100;
		temp1[1]=200;
		System.out.println(arr2[0]);
	}

}
