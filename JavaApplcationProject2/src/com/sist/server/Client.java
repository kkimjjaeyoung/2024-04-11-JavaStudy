package com.sist.server;
import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Client extends JFrame implements ActionListener,Runnable{


	JTextField tf, tf1;
	JButton b1, b2;
	JTextArea ta;
	String name;
	Socket s;	//서버연결
	OutputStream out;	//전송
	BufferedReader in;	//서버로부터 전송값 받기
	JScrollBar bar;
	
	public Client() {
		tf=new JTextField(15);
		b1=new JButton("접속");
		b2=new JButton("종료");
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		bar=js.getVerticalScrollBar();
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
		if(e.getSource()==b1)// 접속
		{
			try
			{
				name=tf.getText(); 
				if(name.length()<1) // 강제로 입력 
				{
					tf.requestFocus();
					return;
				}
				// 1. 소켓 생성
				s=new Socket("localhost",1521);
				// 2. 서버의 송수신 위치 확인 
				// 수신 
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				// 송신
				out=s.getOutputStream();
				
				
				// 연결이 된 경우 
				b1.setEnabled(false);
				tf1.setEnabled(true);
				tf1.requestFocus();
				
			}catch(Exception ex){}
			new Thread(this).start(); //쓰레드 동작 // Client가 가지고 있는 run() 호출 
		}
		else if(e.getSource()==b2)// 종료
		{
			System.exit(0);
		}
		else if(e.getSource()==tf1)// 채팅 문자열 
		{
			try
			{
				String msg=tf1.getText();
				if(msg.length()<1) return;
				
				// 입력이 된상태 => 서버로 문자열 전송 
				out.write(("["+name+"] "+msg+"\n").getBytes());
				tf1.setText("");
				tf1.requestFocus();
			}catch(Exception ex) {}
		}
	}
	// 서버에서 응답한 값을 처리하는 역할 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				String msg=in.readLine();
				ta.append(msg+"\n");
				bar.setValue(bar.getMaximum());
			}
		}catch(Exception ex) {}
	}

}