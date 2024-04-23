/*
 * contains : 포함된 문자열 읽기 (true/false)
 */



/*searchMainDailyBoxOffice.do		일일박스오피스
searchMainRealTicket.do				실시간얘매율
searchMainDailySeatTicket.do			좌석점유율순위
		searchMainDailySeatTicket.do
*/


import javax.swing.text.Document;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import java.util.Scanner;
import netscape.javascript.JSObject;
import java.io.*;
public class 문자열1 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println();
			System.out.println("1. 일일 박스오피스");
			System.out.println("2. 실시간 예매율");
			System.out.println("3. 좌석점유율순위");
			System.out.println("4. 종료");
			System.out.println();
			System.out.println("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu==1) {
				Document doc=Jsoup.connect("https://www.kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do").get();
				String data=doc.toString();
				data=data.substring(data.indexOf("["),data.indexOf("]")+1);
				//System.out.println(data);
				JSONParser jp=new JSONParser();
				JSONArray arr=(JSONArray)jp.parse(data);		// [] = JSONArray, 		{} = JSONPParser
				for (int i=0; i<arr.size(); i++) {
					JSObject obj=(JSObject)arr.get(i);
					System.out.println((i+1)+"."+obj.get("movieNm"));
				
				}
			}
			else if(menu==2) {
				Document doc=Jsoup.connect("https://www.kobis.or.kr/kobis/business/main/searchMainRealTicket.do").get();
				String data=doc.toString();
				data=data.substring(data.indexOf("["),data.indexOf("]")+1);
				//System.out.println(data);
				JSONParser jp=new JSONParser();
				JSONArray arr=(JSONArray)jp.parse(data);		// [] = JSONArray, 		{} = JSONPParser
				for (int i=0; i<arr.size(); i++) {
					JSObject obj=(JSObject)arr.get(i);
					System.out.println((i+1)+"."+obj.get("movieNm"));
				}
			}
			else if(menu==3) {
				Document doc=Jsoup.connect("https://www.kobis.or.kr/kobis/business/main/searchMainDailySeatTicket.do").get();
				String data=doc.toString();
				data=data.substring(data.indexOf("["),data.indexOf("]")+1);
				//System.out.println(data);
				JSONParser jp=new JSONParser();
				JSONArray arr=(JSONArray)jp.parse(data);		// [] = JSONArray, 		{} = JSONPParser
				for (int i=0; i<arr.size(); i++) {
					JSObject obj=(JSObject)arr.get(i);
					System.out.println((i+1)+"."+obj.get("movieNm"));
				}
			}
			else if(menu==4) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("존재하지 않는 메뉴");
			}
		}
	}

}
