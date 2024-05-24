//사용자 정의

package com.sist.util;

import java.util.ArrayList;

class Student{
	private int hakbun;
	private String name;
	private int kor, eng, math;
	public int getHakbun() {
		return hakbun;
	}
	//읽기쓰기(getter/setter)
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	//자동으로 디폴트 생성자 생성 안됨
	public Student(int hakbun, String name, int kor, int eng, int math) {
		super();
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//매개변수 있는 생성자가 있는경우 디폴트 생성자 만들어야 제어가 편리
	public Student() {
		
	}
	
}

public class 컬랙션_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list=new ArrayList<Student>();		//object->student
		list.add(new Student(1, "홍길동", 90, 80, 70));
		list.add(new Student(2, "박문수", 70, 83, 75));
		list.add(new Student(3, "이순신", 95, 80, 70));
		list.add(new Student(4, "이신", 89, 80, 70));
		list.add(new Student(5, "심청이", 67, 80, 70));
		System.out.println("데이터 출력");
		for(Student std:list) {
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",
					std.getHakbun(), std.getName(), std.getKor(), std.getEng(), std.getMath());
		}
		System.out.println("데이터추가");		
		//Student 추가
		Student s=new Student();
		s.setHakbun(6);
		s.setName("강감찬");
		s.setKor(78);
		s.setEng(90);
		s.setMath(60);
		list.add(s);
		
		for(Student std:list) {
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",
					std.getHakbun(), std.getName(), std.getKor(), std.getEng(), std.getMath());
		}
		System.out.println("데이터 추가1");
		list.add(new Student(7, "춘향이", 89,80,90));
		for(Student std:list) {
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",
					std.getHakbun(), std.getName(), std.getKor(), std.getEng(), std.getMath());
		}
		System.out.println("데이터 추가2");
		list.add(new Student(7, "춘향이", 89,80,90));
		
		System.out.println("데이터 출력");
		for(int i=0; i<list.size();i++) {
			Student std=list.get(i);		//형변환없이 사용가능
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",
					std.getHakbun(), std.getName(), std.getKor(), std.getEng(), std.getMath());
		}
		System.out.println("학생삭제");
		list.remove(3);
		for(int i=0; i<list.size();i++) {
			Student std=list.get(i);		//형변환없이 사용가능
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",
					std.getHakbun(), std.getName(), std.getKor(), std.getEng(), std.getMath());
		}
		System.out.println("학생수정");	
		list.set(2, new Student(2, "수정", 90, 90, 90));
		for(int i=0; i<list.size();i++) {
			Student std=list.get(i);		//형변환없이 사용가능
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",
					std.getHakbun(), std.getName(), std.getKor(), std.getEng(), std.getMath());
		}
		System.out.println("학생졸업");
		list.clear();
		for(int i=0; i<list.size();i++) {
			Student std=list.get(i);		//형변환없이 사용가능
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n",
					std.getHakbun(), std.getName(), std.getKor(), std.getEng(), std.getMath());
		}
	}

}
