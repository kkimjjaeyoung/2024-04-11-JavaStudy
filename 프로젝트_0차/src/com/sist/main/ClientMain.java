package com.sist.main;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import com.sist.serch.MainSerch;
import com.sist.serch.SerchGrid;

public class ClientMain extends JFrame implements ActionListener{
	public MainSerch ms=new MainSerch();
	public SerchGrid sg=new SerchGrid();
	
	public ClientMain() {
		setLayout(null);				//레이아웃 배치
		ms.setBounds(0, 150, 1920, 150);	//ms레이아웃 크기 설정
		add(ms);						//ms레이아웃 배치
		sg.setBounds(0, 220, 1920, 960);
		add(sg);
		
		//윈도우크기
		setSize(1920, 1080);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		//프로그램 종료. 백그라운드 종료.(x 클릭시 메모리 회수)
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");		//com.jtattoo.plaf.패키지명.패키지명+LookAndFeel				앞 패키지명은 소문자
		}catch(Exception ex) {}
		
		new ClientMain();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		if(ms.b1==e.getSource()) {		//b1(검색버튼)이 눌렸을 때
			/*
			 * 1. tf1의 입력문 체크
			 * 2. rb1의 유뮤 체크
			 * 3. rf2, tf3의 값 체크
			 */
			
		}
	}

}
