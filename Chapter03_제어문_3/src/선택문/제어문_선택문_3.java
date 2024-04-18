package 선택문;

import java.util.Scanner;
import java.io.*;

public class 제어문_선택문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("메모장, 그림판, 크롬 >>");
		switch(scan.next())	{
		case "메모장":
		Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe");
		break;
		case "그림판":
		Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe");
		break;
		case "크롬":
		Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe http//naver.com http:naver.com" );
		default:
				System.out.println("잘못된 입력입니다!!");
		}
	}

}
