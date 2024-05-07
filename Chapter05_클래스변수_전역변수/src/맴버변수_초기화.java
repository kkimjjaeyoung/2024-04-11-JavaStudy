/*
 * 1|쇼생크 탈출|드라마|https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|
 * 팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|
 * 2016 .02.24 재개봉, 1995 .01.28 개봉|
 * 15세 관람가|
 * 프랭크 다라본트
 */
import java.util.*;
import java.io.*;		//파일 입출력

class Movie{
	String mno;
	String title;
	String genre;
	String poster;
	String actor;
	String regdate;
	String grade;
	String directer;
}
public class 맴버변수_초기화 {
	Movie[] movies=new Movie[1938];
	//맴버변수 : 프로그램 종료시까지 유지
	{
		try {
			FileReader fr=new FileReader("C:\\Users\\sist113_1\\Downloads\\데이터모음\\movie.txt");  //파일읽기
			StringBuffer sb=new StringBuffer();			//문자열을 임시로 저장
			int i=0;
			while((i=fr.read())!=-1) {
				sb.append((char)i);
				}
			fr.close();
			String temp= sb.toString();
			System.out.println(sb.toString());			//내보내기. 스트링 버퍼가 속도면에서 이득.	
			String[] movie=temp.split("\n");
			int j=0;
			for(String mm:movie) {
				movies[j]=new Movie();						//클래스 초기화 : 저장할 공간 생성
				String[] data=mm.split("\\|");				//|를 기준으로 분류
				movies[j].mno=data[0];
				movies[j].title=data[1];
				movies[j].genre=data[2];
				movies[j].poster=data[3];
				movies[j].actor=data[4];
				movies[j].regdate=data[5];
				movies[j].grade=data[6];
				movies[j].directer=data[7];
				j++;
			}
		}
		catch(Exception ex) {}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	맴버변수_초기화 m=new 맴버변수_초기화();
	Scanner scan=new Scanner(System.in);
	/*System.out.println("===== 영화 목록 =====");
	for(Movie movie:m.movies) // 클래스변수.
    {
    	System.out.println(movie.mno+"."+movie.title);
    }
    System.out.println("-----------출연진 검색-----------------");
    System.out.print("출연자명 입력:");
    String actor=scan.next();
    int count=0;
    for(Movie movie:m.movies)
    {
    	if(movie.actor.contains(actor))
    	{
    		System.out.println(movie.title+"("+movie.actor+")");
    		count++;
    	}
    }
    System.out.println("출연한 영화 총 "+count+"건입니다");
    System.out.println("---------- 영화명 검색 -------------");
    System.out.print("영화명 입력:");
    String movieName=scan.next();
    count=0;
    for(Movie movie:m.movies)							//배우명 검색
    {
    	if(movie.title.contains(movieName))
    	{
    		System.out.println(movie.title+"("+movie.actor+")");
    		count++;
    	}
    }
    System.out.println("출연한 영화 총 "+count+"건입니다");
    System.out.println("---------- TOP 10 -------------");
    for(int i=0; i<10; i++) {
    	System.out.println(m.movies[i].mno+"."+m.movies[i].title);
    }
    */
	System.out.println("1~1938번 사이의 정수 입력");
	int no=scan.nextInt();
	Movie mm=m.movies[no-1];
	System.out.println("순위:"+mm.mno);
	System.out.println("영화명 : "+mm.title);
	System.out.println("출연 : "+mm.actor);
	System.out.println("이미지 : "+mm.poster);
	System.out.println("장르 : "+mm.genre);
	System.out.println("등급 : "+mm.grade);
	System.out.println("감독 : "+mm.directer);
}

}