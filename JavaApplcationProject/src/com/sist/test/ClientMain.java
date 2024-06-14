package com.sist.test;
import java.util.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

import com.sist.commons.Function;
import com.sist.dao.MemberDAO;

import java.awt.*;
import java.awt.event.*;


public class ClientMain extends JFrame implements ActionListener, Runnable{
	CardLayout card=new CardLayout();
	Login login=new Login();
	WaitRoom wr=new WaitRoom();
	MemberDAO dao;
	//네트워크관련
	Socket s;//통신기기
	//서버로 전송
	OutputStream out;	// 이벤트 발생시 처리
	//서버에서 값 읽기
	BufferedReader in;	//자동화 처리(쓰레드)	
	
	public ClientMain() {
		dao=MemberDAO.newInstance();
		setLayout(card);
		add("LOGIN", login);
		add("WR", wr);
		setSize(800, 600);
		setVisible(true);
		
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);

	}
	
	public static void main(String[] args) {
		new ClientMain();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b2) {
			dispose();
			System.exit(0);
		}
		else if(e.getSource()==login.b1) {
			String id=login.tf.getText();
			if(id.length()<1) {
				login.tf.requestFocus();
				return;
			}
			String pwd=String.valueOf(login.pf.getPassword());
			if(pwd.length()<1) {
				login.pf.requestFocus();
				return;
			}
			
			String result=dao.memberLogin(id, pwd);
			if(result.equals("NOID")) {
				JOptionPane.showMessageDialog(this, "아이디가 존재하지 않습니다");
				login.tf.setText("");
				login.pf.setText("");
				login.tf.requestFocus();
			}
			else if(result.equals("NOPWD")) {
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");
				login.pf.setText("");
				login.tf.requestFocus();
			}
			else {
				//서버와 연결
				try {
					s=new Socket("localhost", 4582);
					in=new BufferedReader(new InputStreamReader(s.getInputStream()));
					out=s.getOutputStream();	//서버와 연결 완료
					//서버로 로그인 요청
					out.write((Function.LOGIN+"|"+id+"\n").getBytes());
				}catch(Exception ex) {}
				//서버로붵 응답값을 받아서 처리
				new Thread(this).start();
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				//서버의 응답값
				String msg=in.readLine();
				StringTokenizer st=new StringTokenizer(msg, "|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol) {
				case Function.LOGIN:{
					String[] data= {
							st.nextToken(),
							st.nextToken(),
							st.nextToken(),
							st.nextToken(),
							st.nextToken()							
					};
					wr.model2.addRow(data);
				}
				break;
				case Function.CHAT: {
					String id=st.nextToken();
					String name=st.nextToken();
					setTitle(name+"님의 채팅창");
					card.show(getContentPane(), "WR"); //대기실창 이동
				}
				break;
				case Function.MYLOG: {
					wr.ta.append(st.nextToken());
				}
				break;
				}
			}catch(Exception ex) {}
		}
	}
}
