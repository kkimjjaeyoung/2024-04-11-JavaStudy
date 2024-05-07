import java.util.Calendar;
import java.util.Scanner;

public class 달력만들기_전역변수 {
	static int year, month, week;
	static void userInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");
		year=scan.nextInt();
		System.out.println("월 입력:");
		month=scan.nextInt();
	}
	
	static void getweek() {
		Calendar cal=Calendar.getInstance();		//calendar 클래스 메모리 할당. 추상클래스
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		week=cal.get(Calendar.DAY_OF_WEEK);				//요일
		int lastday=cal.getActualMaximum(Calendar.DATE);
	}
	
	static void print() {
		String[] strWeek= {"일", "월", "화",	"수", "목", "금", "토"};
		
		System.out.println(year+"년도"+month+"월");
		for(String s:strWeek) {
			System.out.printf(s+"\t");
		}
		System.out.printf("\n");
		for(int i=1; i<=lastday; i++) {
			if(i==1) {for(int j=0; j<week; j++) {
				System.out.print("\t");
			}
		}
			System.out.printf("%2d\t", i);
			week++;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
