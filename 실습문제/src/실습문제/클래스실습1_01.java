
package 실습문제;


class food{
	String name;
	double score;
	String address;
	String number;
	String foodType;
	String price;
	String time;
	String menu;	
}

class Recipe{
	String name;
	String writer;
	String ftype;
	String source;
	String steps;
}

class Member{
	String id;
	String pw;
	String name;
	String nm;
	String pubid;
	int birth;
	String sex;
	String email;
	int addnum;				//우편번호
	String address;
	String pnumber;			//전화번호
	String job;
	String enjthing;		//취미
	String prself;
}

class News{
	String whatnews;
	String time;
	String title;
	String main;
}

class Shop{
	String number;
	String web;
	String lang;
	String time;
	String rest;
	String impor;
	String address;
	String loc;
	String produce;
}

class Board{
	int num;
	String title;
	String id;
	String date;
	int view;
}

class Boardview{
	static Board[] Boards=new Board[5];
	String main;
}

class BoardWrite{
		
}

public class 클래스실습1_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		food fod=new food();
		fod.name="조점례남문피순대";
		fod.score=4.3;
		fod.address="전라북도 전주시 완산구 풍남문2길 39 남부시장";
		fod.number="063-232-5006";
		fod.foodType="탕/찌개/전골";
		fod.price="만원 미만";
		fod.time="06:00~24:00";
		fod.menu="순대국밥, 피순대 등등";
		
		Recipe rec=new Recipe();
		
		
		Member mem=new Member();
		
		
		Shop shop=new Shop();
		
		
		
	}

}
