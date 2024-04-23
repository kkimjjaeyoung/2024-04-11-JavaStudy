//contains

import java.util.Scanner;

import javax.lang.model.util.Elements;
import javax.swing.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
public class 문자열2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("1. 노래명 검색, 2. 가수명 검색");
		int menu=scan.nextInt();
		int k=1;
		if (menu==1) {
			System.out.print("노래명 입력");
			String fd=scan.next();
			for (int i=1; i<=4; i++) {
				Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg=2"+i).get();
				Elements title=doc.select("table.list-warp a.title");
				Elements title=doc.select("table.list-warp a.artist");
				for(int j=0; j<title.size(); j++) {
					if(title.get(j).text().contains(fd)) {
					System.out.println(k+"."+title.get(j).text()
							+"("+")"
					}
				}
			}
		}
		else {
			System.out.print("가수명 입력");
			String fd=scan.next();
			for (int i=1; i<=4; i++) {
				Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg=2"+i).get();
				Elements title=doc.select("table.list-warp a.title");
				Elements title=doc.select("table.list-warp a.artist");
				for(int j=0; j<singer.size(); j++) {
					if(singer.get(j).text().contains(fd)) {
					System.out.println(k+"."+title.get(j).text()
							+"("+")"
		}
	}
}
}
	}
}
	
