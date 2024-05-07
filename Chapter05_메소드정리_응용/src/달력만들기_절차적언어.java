/*
 * 절차적 언어 : 순차적으로 명력문을 번역, 출력
 * 	메소드 : 기능별 나눠서 처리(변수가 메소드 안에서 사용)
 * 	전역변수 : 전체 메소드에서 사용되는 변수(리턴형/매개변수는 고려하지 않음)
 * 		지역변수 : 메소드 블록(배개변수 포함. 메소드 종료시 사라짐)
 * 		전역변수 : 클래스 불록(프로그램 종료 시 사라짐)
 */
/*
 * aaa() = {a, b, c}
 * bbb() = {a, b, d}
 * ccc() = {a, b, e}
 * ... 전역변수 : {a,b},  지역변수 : {c, d, e}
 * 공통으로 사용하는 변수는  class로 빼주고 그 외는 일반변수로 
 */



// 사용자 입력-요일 구하기-달력 출력 
 
import java.util.*;

public class 달력만들기_절차적언어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
	System.out.println("년도 입력:");
	int year=scan.nextInt();
	System.out.println("월 입력:");
	int month=scan.nextInt();
	
	Calendar cal=Calendar.getInstance();		//calendar 클래스 메모리 할당. 추상클래스
	
	cal.set(Calendar.YEAR, year);
	cal.set(Calendar.MONTH, month-1);
	cal.set(Calendar.DATE, 1);
	
	int week=cal.get(Calendar.DAY_OF_WEEK);				//요일
	int lastday=cal.getActualMaximum(Calendar.DATE);	//마지막날
	
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
		if(week>6) {
			
		}
	}
	}
}
