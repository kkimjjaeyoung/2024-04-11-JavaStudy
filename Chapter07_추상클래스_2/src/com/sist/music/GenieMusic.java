package com.sist.music;

import java.io.*;

public class GenieMusic  extends MusicSystem{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		try {
			FileReader fr=new FileReader("c:\\javaDev\\genie.txt");
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1) {			//파일의 끝
				sb.append((char)i);
			}
			fr.close();
			//buffer : 임시기억장소
			
			String data=sb.toString();	//string은 문자 제한이없다
			String[] mdata=data.split("\n");
			i=0;
			for(String s:mdata) {
				//System.out.println(s);
				if(i>50) {
					break;
				}
				musics[i]=new Music();
				String[] temp=s.split("\\|");
				
				musics[]
				
				i++;
			}
		}catch(Exception ex) {}
	}

}
