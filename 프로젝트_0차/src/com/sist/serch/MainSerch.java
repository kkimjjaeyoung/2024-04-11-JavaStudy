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
	
	public JTextField tf;
	public JRadioButton rb1, rb2, rb3;
	public JButton tfb, tb1, tb2, tb3, tb4, tb5, tb6;
	public JTable jt;
	
	//검색창
	//	이름, 부서명, 직책
	public MainSerch() {

		
		//배치
		setLayout(null);

    	

    	
    	rb1.setFont(new Font("맑은 고딕",Font.BOLD,20));			//폰트, 글씨크기
    	rb1.setBounds(180, 80, 30, 40);
    	add(rb1);
	}
}
