
public class 자바제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			if(i==3)
				continue;
			System.out.println("i="+i);
		}
		System.out.println();
		int i=1;
		while(i<=5) {
			System.out.println(i);
			if(i==3)
				continue;
			System.out.println(i);
			i++;										//continue, break는 자신의 반복문에서만 제어
		}
	}

}
