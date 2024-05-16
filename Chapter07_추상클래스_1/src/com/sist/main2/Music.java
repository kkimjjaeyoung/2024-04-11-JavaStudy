//1|SPOT! (feat. JENNIE)|지코 (ZICO)|SPOT!|https://cdnimg.melon.co.kr/cm2/album/images/114/74/894/11474894_20240426103349_500.jpg/melon/resize/120/quality/80/optimize
//1|SPOT! (Feat. JENNIE)|지코 (ZICO)|SPOT!|//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/085/072/667/85072667_1714091257020_1_140x140.JPG/dims/resize/Q_80,0|xfqBQ2XhBCg\u0026pp=ygUUU1BPVCEgKEZlYXQuIEpFTk5JRSk%3D


package com.sist.main2;

public class Music {			//music 안에서만 사용(메소드를 이용해 다른 클래스 접근)
	private String mno;
	private String title;
	private String singer;
	private String album;
	private String poster;
	public String getMno() {
		return mno;
	}
	public void setMno(String mno) {
		//임시변수 : 메소드 안에서만 사용가능(다른 클래스에선 사용 불가)
		this.mno = mno;			//this : 자신의 클래스 객체주소를 저장해 사용
			//this는 static:모든 객체는 this 소지
			//this가 많이 사용되는곳 : 맴버변수/지역변수의 이름이 같은 경우 구분
			//this.mno:Music이 가지는 변수
	}
	public String getTitle() {
		return title;
		//1. 지역변수, 매개변수 ->> 없는경우 2. 맴버변수
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	
}
