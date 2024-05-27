package com.sist.io;

import java.io.*;
import java.util.*;
import javax.xml.crypto.Data;
import java.text.*;

/*
 * file관련
 * 1. 생성자 -> 경로명 : 폴더정보읽기
 * 				File dir=new File("c:\\javaDev");
 * 			-> 경로명/파일명 : 파일에 대한 정보
 * 				File dir=new File("c:\\javaDev\\파일명");
 * 2. 폴더생성 : mkdir()
 * 		파일생성 : createNewFile()
 * 3. 폴더/파일삭제 : delete()
 * 			-> 폴더안에 파일.폴더가 있는경우 삭제불가. 먼저삭제 후 삭제
 * 4. 폴더안에 있는 파일/폴더의 정보 읽기 : listFiles() : file[] 
 * 		
 */

public class 라이브러리_4 {
	//코딩이 된 상태 -> throws
	//코딩이 시작 -> try~catch
	// io/sql/net -> 클래스 -> CheckedException
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File dir=new File("c:\\javaDev");
			File[] list=dir.listFiles();		//javadev의 모든 파일 읽기
			for(File file:list) {
				if(file.isFile()) {		//파일
					System.out.print(file.getName()+"    ");
					String s=file.getName();
					s=s.substring(s.lastIndexOf(".")+1);
					System.out.println(s+"파일");
					/*
					String s=file.length()/1024!=0?file.length()/1024+"kb":file.length()+"Bytes";
					System.out.print(file.length()+"    ");
					System.out.print(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
					System.out.println();
					*/
				}
				else {			//디랙토리
					/*
					System.out.print(file.getName()+"    ");
					System.out.print(file.length()+"    ");
					System.out.print(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
					System.out.println();
					*/
				}
				
			}
		}catch(Exception ex) {}
	}

}
