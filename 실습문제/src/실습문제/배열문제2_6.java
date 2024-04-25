package 실습문제;

public class 배열문제2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[100];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10);
		}
		
		int[] result=new int[10];
		for(int i=0; i<arr.length; i++) {
			result[arr[i]]++;
		}
		
		for(int i=0; i<result.length; i++) {
			System.out.println(i+"=>"+result[i]);
		}
	}
}
