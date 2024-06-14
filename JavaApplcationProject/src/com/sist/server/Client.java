package com.sist.server;
import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Client extends JFrame implements ActionListener{


	JTextField tf, tf1;
	JButton b1, b2;
	JTextArea ta;
	String name;
	Socket s;	//서버연결
	OutputStream out;	//전송
	BufferedReader in;	//서버로부터 전송값 받기
	
	public Client() {
		tf=new JTextField(15);
		b1=new JButton("접속");
		b2=new JButton("종료");
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		tf1=new JTextField(30);
		tf1.setEnabled(false);
		
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b1);
		p.add(b2);
		add("North", p);
		ta.setEditable(false);
		add("Center", js);
		add("South", tf1);
		
		setSize(450, 400);
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		tf1.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {	//종료
			System.exit(0);
		}
		else if(e.getSource()==tf1) {	//채팅문자열
			
		}
	}

}
