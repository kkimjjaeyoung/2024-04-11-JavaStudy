
public class 메소드정리_3 {
	static void swap(int[] arr) {
		//call by reference
		//메모리 주소 자체를 넘겨준다=같은 메모리에서 변경되 원본값이 변경될 수 있다
		System.out.println("변경전;arr[0]="+arr[0]+", arr[1]="+arr[1]);
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		System.out.println("변경후;arr[0]="+arr[0]+", arr[1]="+arr[1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp= {100,200};
		swap(temp);
		System.out.println("main=>temp값:temp[0]"+temp[0]+"temp값:temp[1]"+temp[1]);
		
	}

}
