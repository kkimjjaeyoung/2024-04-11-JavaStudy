/*
 *    Jsoup => 라이브러리 (웹 크롤링) => HTML데이터 읽기 
 *    HTML 
 *     <div class="name">데이터</div>
 *     ----        ----- => div.name
 *     <div id="name">데이터</div>
 *                       => div#name
 *     1. 태그 
 *        => 구분자 (class/id)
 *     2. 바로 위에 있는 태그 
 *        <div>
 *         <div></div>
 *        </div> 
 */
// 지니뮤직 ==> 멜론 
// 사용자 정의 데이터형 

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.*;
import java.net.URLEncoder;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Music
{
   String rank;
   String title;
   String singer;
   String album;
   String poster;
   String key;
}
class MelonMusic1111
{
	static Music[] musics=new Music[100]; // 클래스 블록은 선언하는 위치 
	/*
	 *    <td class="info">
                 <a href="#" class="title
	 */
	{
		try
		{
		  int k=1;
		  for(int i=1;i<=4;i++)
		  {
			  Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm"+i).get();
			  Elements title=doc.select("table.list-wrap td.info a.title");
			  Elements singer=doc.select("table.list-wrap td.info a.artist");
			  Elements album=doc.select("table.list-wrap td.info a.albumtitle");
			  Elements poster=doc.select("table.list-wrap a.cover img");
			  for(int j=0;j<title.size();j++)
			  {
				  System.out.println("순위:"+k++);
				  System.out.println("노래명:"+title.get(j).text());
				  System.out.println("가수명:"+singer.get(j).text());
				  System.out.println("앨범:"+album.get(j).text());
				  System.out.println("이미지:"+poster.get(j).attr("src"));
				  System.out.println("===================================================");
				  FileWriter fw=new FileWriter("c:\\javaDev\\Melon.txt",true);//append
				  String data=k+"|"
						     +title.get(j).text()+"|"
						     +singer.get(j).text()+"|"
						     +album.get(j).text()+"|"
						     +poster.get(j).attr("src")+"|";
				  fw.write(data);
				  fw.close();
				  k++;
			  }
		  }
		  // 파일에서 데이터 읽기
		  FileReader fr=new FileReader("c:\\javaDev\\Melon.txt");
		  int i=0;
		  StringBuffer sb=new StringBuffer();
		  while((i=fr.read())!=-1)
		  {
			  sb.append((char)i);
		  }
		  fr.close();
		  
		  String data=sb.toString();
		  String[] temp=data.split("\n");
		  i=0;
		  for(String s:temp)
		  {
			  String[] ss=s.split("\\|");
			  musics[i]=new Music();
			  musics[i].rank=ss[0];
			  musics[i].title=ss[1];
			  musics[i].singer=ss[2];
			  musics[i].album=ss[3];
			  musics[i].poster=ss[4];
			  i++;
		  }
			
		}catch(Exception ex){}
	}
	static void musicList()
	{
		System.out.println("================Music List===============");
		int i=1;
		for(Music s:musics)
		{
			System.out.println(i+"."+s.title);
			i++;
		}
	}
	static void musicDetail(int rank)
	{
		try
		{
			Music m=musics[rank-1];
			String url="http://youtube.com/embed/"+m.key;
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "+url);
		}catch(Exception ex) {}
	}
	static void musicTitleFind(String title)
	{
		int count=0;
		for(Music m:musics)
		{
			if(m.title.contains(title))
			{
				System.out.println(m.title);
				count++;
			}
		}
		System.out.println("검색 결과 총 "+count+"건");
	}

}
public class 크롤링실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        MelonMusic11 gm=new MelonMusic11();
        gm.musicList();

	}

}