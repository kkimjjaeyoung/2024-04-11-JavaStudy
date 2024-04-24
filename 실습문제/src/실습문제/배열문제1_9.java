package 실습문제;

public class 배열문제1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,50,3,60,-3};
		int index=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==60) {
				index=i;
				break;
			}
		}
		System.out.println("인덱스번호:"+index);
		
		for(int i:arr) {
			if(i==60) {
				break;
			}
			index++;
		}
		System.out.println(index);						//값 누적으로 10이 나옴(5+5)
	}

}
