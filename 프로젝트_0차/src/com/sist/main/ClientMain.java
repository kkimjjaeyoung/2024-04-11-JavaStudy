package com.sist.main;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import com.sist.serch.MainSerch;
import com.sist.serch.SerchGrid;

public class ClientMain extends JFrame {
	public MainSerch ms=new MainSerch();
	public SerchGrid sg=new SerchGrid();
	
	public ClientMain() {
		setLayout(null);				//레이아웃 배치
		ms.setBounds(0, 150, 1920, 200);	//ms레이아웃 크기 설정
		add(ms);						//ms레이아웃 배치
		sg.setBounds(0, 220, 1920, 960);
		add(sg);
		
		//윈도우크기
		setSize(1920, 1080);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ClientMain();
	}

}
