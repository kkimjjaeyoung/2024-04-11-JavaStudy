/*
 * 검색기능		: 검색. 검색 확인칸. 
 *  이름검색		: 검색어 입력칸	
 *  브랜드 검색	: 이름검색창에서 라디오버튼으로 제품명, 브랜드명 구분 후 검색
 *  가격 검색		: 별도의 가격 구분창. n~N원 입력.
 *  
 *  JLabel 2, JTextField 3, JButton 2, JRadioButton 2
 */

package com.sist.serch;

import java.awt.Font;
import javax.swing.*;

public class MainSerch extends JPanel{
	public JLabel la1, la2, la3, la4;
	public JTextField tf1, tf2, tf3;
	public JButton b1, b2;
	public JRadioButton rb1;
	
	//검색창
	public MainSerch() {
		la1=new JLabel("이름 :");			//검색 택스트
		la2=new JLabel("빠른배송");		//체크 택스트
		la3=new JLabel("~");			//가격 입력칸 사이
		la4=new JLabel("가격 검색 :");		
		tf1=new JTextField();			//검색어 입력칸
		tf2=new JTextField(0);		//가격 입력칸
		tf3=new JTextField();			//가격 입력칸2
		b1=new JButton("검색");			//검색 입력 버튼
		b2=new JButton("검색");				//가격검색 입력버튼
		rb1=new JRadioButton();			//빠른배송 체크상자 
		
		//배치
		setLayout(null);
    	la1.setFont(new Font("맑은 고딕",Font.BOLD,35));			//폰트, 글씨크기
    	la1.setBounds(40, 15, 100, 40);							//위치
    	add(la1);
    	
    	la2.setFont(new Font("맑은 고딕",Font.BOLD,20));			//폰트, 글씨크기
    	la2.setBounds(80, 80, 200, 40);
    	add(la2);
    	
    	la3.setFont(new Font("맑은 고딕",Font.BOLD,40));			//폰트, 글씨크기
    	la3.setBounds(560, 80, 40, 40);
    	add(la3);
    	
    	la4.setFont(new Font("맑은 고딕",Font.BOLD,20));			//폰트, 글씨크기
    	la4.setBounds(300, 80, 250, 40);
    	add(la4);
    	
    	tf1.setFont(new Font("맑은 고딕",Font.BOLD,35));			//폰트, 글씨크기
    	tf1.setBounds(150, 15, 1000, 40);	
    	add(tf1);
    	
    	tf2.setFont(new Font("맑은 고딕",Font.BOLD,20));			//폰트, 글씨크기
    	tf2.setBounds(410, 80, 150, 40);	
    	add(tf2);
    	
    	tf3.setFont(new Font("맑은 고딕",Font.BOLD,20));			//폰트, 글씨크기
    	tf3.setBounds(600, 80, 150, 40);	
    	add(tf3);
    	
    	b1.setFont(new Font("맑은 고딕",Font.BOLD,30));			//폰트, 글씨크기
    	b1.setBounds(1200, 15, 120, 40);
    	add(b1);
    	
    	b2.setFont(new Font("맑은 고딕",Font.BOLD,20));			//폰트, 글씨크기
    	b2.setBounds(780, 80, 100, 40);
    	add(b2);
    	
    	rb1.setFont(new Font("맑은 고딕",Font.BOLD,20));			//폰트, 글씨크기
    	rb1.setBounds(180, 80, 30, 40);
    	add(rb1);
	}
}
