import java.util.*;

class Student2{				//aoaqjqustn
	String name;
	int kor, eng, math, total;
	double avg;
	char score;
	int rank;
}

public class 클래스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2[] std=new Student2[3];			//사용자 정의 데이터형(배열사용 가능)
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<std.length; i++) {
			std[i]=new Student2();
			
			System.out.print((i+1)+"번째 국어 입력");
			std[i].kor=scan.nextInt();
			System.out.print((i+1)+"번째 영어 입력");
			std[i].eng=scan.nextInt();
			System.out.print((i+1)+"번째 수학 입력");
			std[i].math=scan.nextInt();
			std[i].total=std[i].kor+std[i].eng+std[i].math;
			std.avg=std[i].total/3.0;
		}
		
		for(int i=0; i<3; i++) {
			
		}

	}

}
