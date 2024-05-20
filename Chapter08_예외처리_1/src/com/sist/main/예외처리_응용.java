package com.sist.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;	//interface
import java.lang.invoke.StringConcatFactory;

public class 예외처리_응용 extends JFrame implements ActionListener{
	//예외처리_응용 -> 윈도우로 확장->상속(단일 상속 기본)
	JTextField tf;
	JButton b1, b2;
	JLabel la=new JLabel();
	//클래스 또한 변수(객체)취급. [기본형, 배열, 클래스] ->맴버변수로 사용
	//초기화, 화면 UI, 서버 연결 -> 생성자에서 주로 처리
	
	//저넻변수
	int com;		//난수
	int user;		//사용자 입력값
	//맴버변수(메소드 2개이상에 사용) : 1. 입력값을 받는 경우, 2. 비교시 사용
	//지역변수(메소드 한개에서만 사용) : 
	//처리는 입력 : 엔터시 입력값을 받아 비교 후 결과값 출력
	public 예외처리_응용() {
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
		la.setBounds(10,55,360, 30);
		add(la);
		
		//윈도우
		setSize(400, 135);
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
		new 예외처리_응용();
	}
	public void getRand() {
		com=(int)(Math.random()*100)+1;
	}
	public void compare() {
		if(com>user) {
			la.setText("입력값보다 큰 값을 입력하세요!!");
			tf.setText("");
			tf.requestFocus();
			
		}
		else if(com<user) {
			la.setText("입력값보다 작은 값을 입력하세요!!");
			tf.setText("");
			tf.requestFocus();
		}
		else {
			int no=JOptionPane.showConfirmDialog(this, "종료할까요?", "종료", JOptionPane.YES_NO_OPTION);
			if(no==JOptionPane.YES_NO_OPTION) {
				System.exit(0);
			}
			else {
				tf.setText("");
				tf.setEnabled(false);
				b1.setEnabled(true);
				la.setText("");
			}
		}
	}
	//예외처리는 에러발생시 종료하는 목적이 아닌 프로그램을 정상상태로 유지하는게 목적
	//예외처리는 클래스블록에서는 사용 불가
	// 버튼이나 JTextField 처리(엔터)-> 고정 : 구현할 수 없어 선언만 해서 넘김(프로그램에 맞게 개별 구현 후 사용)
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
			}catch(Exception ex) {
				JOptionPane.showMessageDialog(this, "정수만 입력 가능합니다");
				tf.setText("");
				tf.requestFocus();
				return;			//메소드에서 return사용시 메소드가 종료
			}
			//메소드는 return이 있는 곳에서 종료(항상 마지막줄에 있는것이 아니다)
			//비교
			compare();
			return;
		}
	}
	

}
