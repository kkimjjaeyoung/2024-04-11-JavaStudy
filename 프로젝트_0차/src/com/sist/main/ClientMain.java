package com.sist.main;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import com.sist.serch.MainSerch;

public class ClientMain extends JFrame {
	public MainSerch ms=new MainSerch();
	
	
	public ClientMain() {
		setLayout(null);				//레이아웃 배치
		ms.setBounds(0, 150, 1920, 930);	//ms레이아웃 크기 설정
		add(ms);						//ms레이아웃 배치
		
		
		//윈도우크기
		setSize(1920, 1080);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ClientMain();
	}

}
