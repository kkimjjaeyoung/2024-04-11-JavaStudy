package com.sist.music;

import java.io.*;

public class MusicSystem {
	//music 데이터 공유
	private static Music[] musics=new Music[200];
	//파일읽기(데이터저장). 클래스영역은 사용 불가. 
	//초기화영역
	static {
		FileReader fr=null;
		try {
			// checkedException : 컴파일시 예외 감시
			// 초기화블록은 throws 사용 불가(메소드에서만 사용 가능)
			fr=new FileReader("C:\\javaDev\\genie.txt");
			int i=0;
			StringBuffer sb=new StringBuffer();
			   // 데이터 문자열 결합이 많은 경우 => StringBuffer / StringBulider 
			   //                            비동기            동기 
			   //                           ArrayList      Vector 
			//String data="";
			while((i=fr.read())!=-1) {
				sb.append((char)i);
				//data+=(char)i;
			}
			//System.out.println(data);
			//String dataString=sb.toString();
			String data=sb.toString();
			String[] temp=data.split("\n");				// \n으로 분리		
			i=0;
			for(String s:temp) {
				String[] m=s.split("\\|");
				musics[i]=new Music();
				musics[i].setMno(Integer.parseInt(m[0]));
				musics[i].setTitle(m[1]);
				musics[i].setSinger(m[2]);
				musics[i].setAlbum(m[3]);
				musics[i].setPoster(m[4]);
				musics[i].setKey(m[5]);
				i++;
			}
		}catch(Exception ex) { 		//에러발생시 처리
			ex.printStackTrace(); 		// FileNotFoundException / IOException => Exception
		}
		finally {
		try {
			fr.close();				//종료
		}catch(Exception ex) {}
		
		}
	}	
		public int musicTotalPage() {
			return (int)(Math.ceil(musics.length/20.0));	//올림함수. 한 회차에 20개 제한?
			
		}
		public Music[] musicListData() {
			return musics;
		}
		public Music musicDetailData(int mno) {		//세부정보
			Music m=new Music();
			for(Music mm:musics) {
				if(mm.getMno()==mno) {
					m=mm;
					break;
				}
			}
			return m;
		}
		public Music[] musicFindData(String fd) {		//검색
			int count=0;
			for(Music m:musics) {
				if(m.getTitle().contains(fd)) {		//fd 포함시
					count++;
				}
			}
			Music[] mm=new Music[count];
			int i=0;
			for(Music m:musics) {
				if(m.getTitle().contains(fd)) {
					mm[i]=m;
					i++;
				}
			}
			return mm;
		}
}



