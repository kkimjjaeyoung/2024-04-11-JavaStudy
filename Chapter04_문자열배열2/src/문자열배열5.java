import java.io.*;
import java.util.Scanner;
public class 문자열배열5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C:\\Users\\sist113_1\\Downloads\\데이터모음\\seoul_location.txt");
		String data="";
		int i=0;
		
		while((i=fr.read())!=-1) {		//-1 = 파일 끝
			data+=(char)i;
		}
		fr.close();
		System.out.println(data);
		String[] location=data.split("\n");
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("=메뉴");
			System.out.println("1. 목록");
			System.out.println("2. 명소찾기");
			System.out.println("3. 주소 검색");
			System.out.println("4. 종료");
			System.out.println("=====");
			System.out.println("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu==4) {
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu==1) {
				for(String loc:location) {
					String[] locData=loc.split("\\|");
					System.out.println("명소명:"+locData[1]);
					System.out.println("명소소개:"+locData[2]);
					System.out.println("명소위치"+locData[3]);
					System.out.println("=======");
				}
			}
			else if(menu==2) {
				System.out.println("검색어 입력:");
				String fd=scan.next();

				for(String loc:location) {
					if(loc.contains(fd)){
						String[] locData=loc.split("\\|");
						System.out.println("명소명:"+locData[1]);
						System.out.println("명소소개:"+locData[2]);
						System.out.println("명소위치"+locData[3]);
						System.out.println("=======");
					}
				}
			}
			else if(menu==3) {
				System.out.println("주소 검색:");
				String fd=scan.next();

				for(String loc:location) {
					if(loc.contains(fd)){
						String[] locData=loc.split("\\|");
						System.out.println("명소명:"+locData[1]);
						System.out.println("명소소개:"+locData[2]);
						System.out.println("명소위치"+locData[3]);
						System.out.println("=======");
					}
				}
			}
		}
	}
}
