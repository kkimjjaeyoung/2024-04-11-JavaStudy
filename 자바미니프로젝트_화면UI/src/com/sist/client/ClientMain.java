package com.sist.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClientMain extends JFrame implements ActionListener {			//implements ActionListener : 버튼처리
	public MenuPanel mp=new MenuPanel();
	public ControlPanel cp=new ControlPanel();
	public ClientMain() {
		//배치
		setLayout(null);
		mp.setBounds(150, 15, 600, 30);
		cp.setBounds(0, 50, 800, 530);
		add(mp);
		add(cp);
		//add("North", mp);			//North, South, West, East, Center : BorderLayout(JFrame)
		//add("center", cp);
		//윈도우 크기
		setSize(800, 600);
		
		setVisible(true);			
		setResizable(false);			//윈도우 크기 고정
		setDefaultCloseOperation(EXIT_ON_CLOSE);		//프로그램 종료. 백그라운드 종료.(x 클릭시 메모리 회수)
		
		mp.b1.addActionListener(this);  			//b1(홈버튼)클릭시 actionPerformed 를 호출
		mp.b2.addActionListener(this);  			//b2(검색버튼)클릭시 actionPerformed 를 호출
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
		if(mp.b1==e.getSource()) { 			//b1버튼이 늘렸을 때
			cp.card.show(cp, "HOME");
		}
		else if(mp.b2==e.getSource()) {
			cp.card.show(cp, "FIND");
		}
		else if(mp.b6==e.getSource()) {
			JOptionPane.showMessageDialog(this, "프로그램을 종료");
			System.exit(0);
		}
	}

}
