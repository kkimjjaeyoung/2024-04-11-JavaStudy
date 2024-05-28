/*
 * 1. 목록출력->검색(Select) : read
 * 2. 개시물추가(Insert)	: create
 * 3. 상세보기->조건(Select) : read
 * 4. 수정(Update)	: update
 * 5. 삭제(Delete)	: delete
 * 		CRUD : 메모리/파일/데이터베이스 (컬랙션/ObjectInput,Output/오라클)
 */

package com.sist.model;

import java.util.*;
import java.io.*;

public class BoardSystem {
	private static ArrayList<Board> list=new ArrayList<Board>();
	

	
	static {
		ObjectInputStream ois=null;
		try {
			FileInputStream fis=new FileInputStream("c:java.dev\\java_data\\board.txt");
			ois=new ObjectInputStream(fis);
			list=(ArrayList<Board>)ois.readObject();
		}catch(Exception ex) {
			
		}
		finally {
			try {
				ois.close();
			}catch(Exception ex) {}
		}
		
	}
	//저장, 목록, 상세보기, 추가, 수정, 삭제, 검색
	public void boardSave() {			//저장 메소드화
		ObjectOutputStream oos=null;
		try {
			FileOutputStream fos=new FileOutputStream("c:java.dev\\java_data\\board.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(list); 		//파일 객체단위저장
		}catch(Exception ex) {
			
		}
		finally {
			try {
				oos.close();
			}catch(Exception ex) {}
		}
	}
	
	public void boardSave(Board board) {		//저장
		list.add(board);
		boardSave();
	}
	public void boardUpdate(int no,Board board) {
		int index=0;
		for(int i=0;i<list.size();i++) {
			Board b=list.get(i);
			if(b.getNo()==no) {
				index=i;			//인덱스 번호 구하기
				break;
			}
		}
		list.set(index, board);
		boardSave();			//파일저장
	}
	public void boardDelete(int no) {
		int index=0;
		for(int i=0;i<list.size();i++) {
			Board b=list.get(i);
			if(b.getNo()==no) {
				index=i;			//인덱스 번호 구하기
				break;
			}
		}
	list.remove(index);		//삭제
	boardSave();		//파일에 저장
	}
	public void boardInsert(Board baord) {
		board.setNo(boardSequence()+1);
		list.add(baord);
		boardSave();
	}
	public ArrayList<Board> boardList(int page){
		ArrayList<Board> bList=new ArrayList<Board>();
		int j=0;						//10개씩
		int pagecnt=(page*10)-10;		//시작위치
		/*
		 * 1page -> 0~9, 2page-> 10~19 ...
		 */
		for(int i=0; i<list.size(); i++) {
			Board b=list.get(i);
			if(j<10 && i>=pagecnt) {
				bList.add(b);
				j++;
			}
		}
		return bList;
	}
	public int boardTotalPage() {
		return (int)(Math.ceil(list.size()/10.0));
	}
	public Board boardDetail(int no) {
		Board board=new Board();
		for(Board b:list) {
			if(b.getNo()==no) {
				board=b;
				break;
			}
		}
		return board;
	}
	public ArrayList<Board> boardFInd(String subject){
		ArrayList<Board> bList=new ArrayList<Board>();
		for(Board b:list) {
			if(b.getSubject().contains(subject)) {
				bList.add(b);
			}
		}
		return bList;
	}
	
	//sequence(자동 증가번호)
	public int boardSequence() {
		int max=0;
		//종료하지 않는 프로그램 제작(임의) : 반드시 예외처리하는것은 아님(에러처리)
		try {
			for(Board b:list) {
				if(b.getNo()>max)
					max=b.getNo();
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return max;
	}
}

