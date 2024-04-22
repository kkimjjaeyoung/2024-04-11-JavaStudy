/*
 * while : 선조건을 가짐(한번도 수행 못할수 있다-> 초기값이 조건식을 만족하지 못할 경우)
 * 		(초기값)
 * 		while(조건식) {
 * 		(반복수행문장)
 * 		(증가식)
 * 		}
 * 
 * 
 * do~while : 후조건을 가짐(무조건 한번은 수행). while을 보완하기 위해 c/c++많이 사용(자바에서 거의 사용안함)
 * 
 * 	
 */
public class 자바제어문_반복문11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		for(i=1; i<=10; i++) {
			System.out.println(i+" ");
		}
		System.out.println();
		i=1;
		while(i<=10) {
			System.out.println(i+" ");
			i++;
		}
		System.out.println();
		i=1;
		do {
			System.out.println(i+" ");
			i++;
		}while(i<=10);
	}

}
