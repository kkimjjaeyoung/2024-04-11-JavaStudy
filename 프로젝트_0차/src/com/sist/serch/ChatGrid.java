package com.sist.serch;

import java.awt.Font;

import javax.swing.*;

public class ChatGrid extends JPanel{
	public JTextArea ta1;
	public JTextField tf1;
	public JButton b1, b2;
	public JTextPane jp1;
	
	public ChatGrid() {
		ta1=new JTextArea();
		tf1=new JTextField();
		b1=new JButton();
		b2=new JButton();
		jp1=new JTextPane();
		
		setLayout(null);
    	ta1.setFont(new Font("맑은 고딕",Font.BOLD,35));			//폰트, 글씨크기
    	ta1.setBounds(40, 15, 100, 40);							//위치
    	add(ta1);
    	
    	tf1.setFont(new Font("맑은 고딕",Font.BOLD,35));			//폰트, 글씨크기
    	tf1.setBounds(40, 15, 100, 40);							//위치
    	add(tf1);
    	
    	b1.setFont(new Font("맑은 고딕",Font.BOLD,35));			//폰트, 글씨크기
    	b1.setBounds(40, 15, 100, 40);							//위치
    	add(b1);
    	
    	la1.setFont(new Font("맑은 고딕",Font.BOLD,35));			//폰트, 글씨크기
    	la1.setBounds(40, 15, 100, 40);							//위치
    	add(jp1);
	}
}
