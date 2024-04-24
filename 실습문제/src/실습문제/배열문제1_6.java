

package 실습문제;

public class 배열문제1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {94,85, 95,88,90};			//생성, 초기화
		int max=num[0];							//최대값 구하기
		int min=num[0];							//최소값 구하기
		
		for(int i:num) {
			if(max<i){
				max=i;
			}
			if(min>i) {
				min=i;
			}
		}
		System.out.println("최대값:"+max);
		System.out.println("최솟값:"+min);
	}

}
