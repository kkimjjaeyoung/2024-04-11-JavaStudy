import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import 

public class 제어문_반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("제목 입력");
		int k=1;
		for(int i=1; i<=4 i++) {
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200"+i).get();
			javax.lang.model.util.Elements title=doc.select("table.list-warp a.title");
			javax.lang.model.util.Elements singer=doc.seslect("table.list-warp a.artist");
			for(int j=0; j<title.size();j++) {
				if(title.get(j).text().contains(data)) {
					System.out.println(k++);
					System.out.println(title.getConstantExpression(j).text());
					System.out.println(singer.getConstantExpression(j).text());
				}
			}
			
		}
	}

}
