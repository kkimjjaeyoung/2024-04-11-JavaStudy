// startsWith / endsWith = cookie
//자동완성기

import java.util.Scanner;

public class 문자열배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] book= {
				"자바와 오라클",
				"자바로 시작하는 웹프로그램",
				"자바와 JSP",
				"JSP와 Ajax",
				"Ajax와 JQUery",
				"혼자 배우는 자바",
				"자바 프로그래밍",
				"오라클 AND 자바",
				"최신 자바"
		};
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력:");
		String fd=scan.next();
		for(String book:books) {
			if(book.endsWith(fd) || book.startsWith(fd)) {
				System.out.println(book);
				try {Thread.sleep(1000);
			}
				catch(Exception ex) {}
		}
	}
}
