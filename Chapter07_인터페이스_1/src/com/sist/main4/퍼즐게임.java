/*
 * 1. 윈도우 상속, 2. 인터페이스 상속
 * 
 * 	1. JButton, JRadioButton, JMenu, JTextField	
 * 		-> ActionListener : actionPerformed()
 * 	2. MouseListener
 * 		-> mouseClicked/mousePressed/mouseReleased/mouse
 */

package com.sist.main4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class 퍼즐게임 extends JFrame implements ActionListener{
/*
 *  1. 기본 초기화(int=0, double=0.0, boolean=false...)
 *  2. 명시적인 초기화->중심(고려)
 *  3. 초기화 블록
 *  4. 생성자
 */
	JButton[] bnts=new JButton[9];
	JLabel la=new JLabel("퍼즐 게임", JLabel.CENTER);
	JButton b1, b2;
	
	public 퍼즐게임() {
		//초기화. 화면 UI
		b1=new JButton("시작");
		b2=new JButton("종료");
		
		JPanel pan=new JPanel();
		pan.setLayout(new GridLayout(3, 3, 5, 5));
		for(int i=0; i<bnts.length; i++) {
			bnts[i]=new JButton(String.valueOf(i+1));				//윈도우, 네트워크, 웹은 데이터형 없다(String으로만)
			pan.add(bnts[i]);
		}
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);		//일자배치시 : JPanel(FlowLayout)
		
		setLayout(null);
		
		la.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		la.setBounds(10,15,450,40);
		add(la);
		
		pan.setBounds(10,65,450,300);
		add(pan);
		
		pan.setBounds(10,400,450,380);
		add(pan);
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 퍼즐게임();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
