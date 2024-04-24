import java.util.*;

public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("년도입력");
		int year=scan.nextInt();
		
		System.out.println("월입력");
		int month=scan.nextInt();
		
		System.out.println("일입력");
		int day=scan.nextInt();
		
		System.out.println("api 이용");
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day);
		
		String[] strWeek= {"","일","월","화","수","목","금","토"};
		int week=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(year+"년도"+month+"월"+day+"일은"+strWeek[week]+"요일입니다");
	}

}
