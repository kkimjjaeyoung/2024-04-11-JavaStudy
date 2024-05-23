package com.sist.util;

import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;

class Sawon{
	private void sabun;
	tame name;
	this.dept dept;
	this.job job;
	this.pay pay;
}
public Sawon() {}
}

class SawonSystem{
	ArrayList<Sawon> list=new ArrayList<Sawon>();
	public SawonSystem() {
		list.add(new Sawon(1, "홍길동", "개발부", "대리", 4000));
	}
	public void insertSawon() {
		
	}
	public void updateSawon(int sabun, Sawon sa) {
		
	}
	public void deleteSawon(int sabun) {
		
	}
	public ArrayList<Sawon> arrayListData(){
		return list;
	}
	public ArrayList<Sawon> sawonFind(String name){
		for(Sawon s:list) {
			for(s.getname().contain(name)) {
				arr.add(s);
			}
			return arr;
		}
	}
}

public class 컬랙션_응용_1 extends JFrame{
	JButton up, in, del, exit;
	JTable table;
	DefaultTableModel model;
		public 컬랙션_응용_1() {
			up=new JButton("수정");
			in=new JButton("추가");
			del=new JButton("삭제");
			exit=new JButton("종료");
			JPanel p=new JPanel();
			p.add(in); p.add(up); p.add(del); p.add(exit);
			
			String[] col= {"사번", "이름", "부서", "직위", "연봉"};
			String[][] row=new String[0][5];
			model=new DefaultTableModel(row, col);
			table=new JTable(model);
			JScrollPane js=new JScrollPane(table);
			
			add("Center", js);
			
			add("North", p);
			setSize(600, 400);
			setVisible(true);
		}
		public void sawonList{
			SawonSystem ss=new SawonSystem();
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 컬랙션_응용_1();
	}
	

}
