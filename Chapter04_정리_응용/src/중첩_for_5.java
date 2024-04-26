/*
 * 배열 : 인덱스 번호는 0번부터(lenght-1까지 사용가능). 제어(읽기/쓰기)가 편하고 반복문을 사용해 소스코딩 감소
 * 클래스 : 한개의 이름으로 여러개를 동시에 제어가능(인터페이스)
 * 
 * 
 * 중복없는 난수
 * 1~10 의 10개의 중복없는 난수 발생
 * 
 */
public class 중첩_for_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[10];			//용도가 값튼 정수 10개. lenght-1까지 사용가능
		for(int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*10)+1;
			for(int j=0; j<i; j++) {
				i--;					//다시 난수발생
				break;
			}
		}
		for(int i:num) {
			System.out.println(i+" ");
		}
	}

}
