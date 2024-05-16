package com.sist.music;

public abstract class MusicSystem {
	
	public static Music[] musics=new Music[50];
	
	public abstract void init();
	
	public void list() {
		System.out.println("목록 출력");
		int i=1;
		for(Music m:musics) {
			System.out.println(i+"."+m.getTitle());
			i++;
		}
	}
	public void detail(int mno) {
		System.out.println("상세보기");
		Music m=musics[mno-1];			//1번부터 배열 0번까지
		
		System.out.println("제목:"+m.getTitle);
		System.out.println("가수명:"+m.getSinger);
		System.out.println("앨범":"+m.getAlbum);
	}
	public void find(String title) {
		System.out.println("검색");
		for(Music m:musics) {
			if(m.getTitle())
		}
	}
}
