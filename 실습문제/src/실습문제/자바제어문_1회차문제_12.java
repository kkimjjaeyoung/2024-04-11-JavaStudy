package 실습문제;

public class 자바제어문_1회차문제_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		int min=100;
		
		for (int i=1; i<=5; i++) {
			int num=(int)(Math.random()*100)+1;
			System.out.println(num+" ");
			if (max<num)
				max=num;
			if(min>num)
				min=num;
		}
		System.out.println();
		System.out.println("최대값:"+max);
		System.out.println("최솟값:"+min);
		
		System.out.println(" while문으로");
		
		int i=1;
		int num=(int)(Math.random()*100)+1;
		while(i<=5) {
			if(max<num)
				max=num;
			if(min>num)
				min=num;
			i++;
		}
		System.out.println();
		System.out.println("최대값:"+max);
		System.out.println("최솟값:"+min);
	}

}
