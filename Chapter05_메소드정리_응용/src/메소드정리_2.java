
public class 메소드정리_2 {
	//매개변수 전송법(메소드 안에서만 변경, call by value)
	static void swap(int a, int b ) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println("변경후 : a="+a+",b="+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=200;
		swap(a, b);
		System.out.println("main=>원본값:a="+a+", b="+b);				//원본값은 변하지 않음
	}

}
