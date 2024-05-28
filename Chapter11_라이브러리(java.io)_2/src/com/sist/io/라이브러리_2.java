
//데이터 읽기
package com.sist.io;

import java.io.*;
import java.util.*;

public class 라이브러리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois=null;
		try {
			FileInputStream fis=new FileInputStream("C:\\javaDev\\java_data\\sts.txt");
			ois=new ObjectInputStream(fis);
			ArrayList<Student> list=(ArrayList<Student>)ois.readObject();
			for(Student s:list) {
				System.out.println(s.getHakbun()+" "+s.getName()+" "+s.getKor()+" "+s.getEng()+" "+s.getMath());
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				ois.close();
			}catch(Exception ex) {}
		}
	}

}
