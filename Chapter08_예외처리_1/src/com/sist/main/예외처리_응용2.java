package com.sist.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;	//interface
import java.lang.invoke.StringConcatFactory;

public class 예외처리_응용2 extends JFrame implements ActionListener{

	JTextField tf;
	JButton b1, b2;
	JTextArea ta=new JTextArea();

	int[] com=new int[3];
	int[] user=new int[3];
	
	int s,b;
	//맴버변수(메소드 2개이상에 사용) : 1. 입력값을 받는 경우, 2. 비교시 사용
	//지역변수(메소드 한개에서만 사용) : 
	//처리는 입력 : 엔터시 입력값을 받아 비교 후 결과값 출력
	public 예외처리_응용2() {
		tf=new JTextField();
		b1=new JButton("시작");
		b2=new JButton("종료");
		
		
	
		
		//배치
		setLayout(null);
		tf.setBounds(10,15,150,30);
		tf.setEnabled(false);
		
		//윈도우 추가
		add(tf);
		b1.setBounds(162,15,100,30);
		add(b1);
		b2.setBounds(270, 15,100, 30);
		add(b2);
		
		ta.setEditable(false);
		JScrollPane js=new JScrollPane(ta);
		js.setBounds(10,55,360,300);
		
		//윈도우
		setSize(400,600);
		setVisible(true);
		
		//버튼클릭 -> 등록 -> 메소드 자동 호출
		// this : 자신이 가진 객체(값)
		b1.addActionListener(this);		//actionPerformed : 어디 있는지
		b2.addActionListener(this);
		tf.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성자 호출
		new 예외처리_응용2();
	}
	public void getRand() {
		for(int i=0; i<3; i++) {
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0; j<i;j++) {
				if(com[j]==com[i])
				{
					i--;
					break;
				}
			}
		}
	}
	public void compare() {
		s=0;
		b=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(com[i]==user[j]) {
					if(i==j) {
						s++;
					}
					else {
						b++;
					}
				}
			}
		}
	}
	
	String msg="Input Number:"+user[0]+""+user[1]+""+user[2]+",Result:"+s+"S-"+b+"B\n";
	ta.append(msg);

	if(i==3) {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2) {			//b2 버튼을 클릭했다면
			System.exit(0);
		}
		else if(e.getSource()==b1) {
			getRand(); 		//com에 난수발생
			JOptionPane.showMessageDialog(this, "게임을 시작합니다!!");
			tf.setEnabled(true);
			tf.requestFocus();
			b1.setEnabled(false);
		}
		else if(e.getSource()==tf) {
			String no=tf.getText();  			//입력값을 읽어온다
			//예외처리
			try {
				user=Integer.parseInt(no);
				if(input<100 || input>999) {
					JOptionPane.showMessageDialog(this, "정수만 입력 가능합니다");
					tf.setText("");
					tf.requestFocus();
					return;		
				}
				
				user[0]=input/100;
				user[1]=(input%100)/10;
				user[2]=input%10;
				if
			}catch(Exception ex)
			{
				JOptionPane.showMessageDialog(this, "정수만 입력 가능합니다");
				tf.setText("");
				tf.requestFocus();
				return;	
			}
			//메소드는 return이 있는 곳에서 종료(항상 마지막줄에 있는것이 아니다)
			//비교
			compare();
			tf.setText("");
			tf.requestFocus();
			//return;
		}
	}
	

}
