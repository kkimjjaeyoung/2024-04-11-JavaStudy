
public class 자바제어문_반복문10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt0=0;
		int cnt1=0;
		int i=1;
		while(i<=100) {
		int num=(int)(Math.random()*2);						//반복문장->난수발생(0,1판별)
		if(num==0) {
			cnt0++;
		}
		if(num==1) {
			cnt1++;
		}
			i++;
		}
		System.out.println("0이 나올 경우:"+cnt0);
		System.out.println("0이 나올 경우:"+cnt1);
	}

}
