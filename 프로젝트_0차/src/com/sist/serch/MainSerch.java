/*
 * 검색기능		: 검색. 검색 확인칸. 
 *  이름검색		: 검색어 입력칸	
 *  브랜드 검색	: 이름검색창에서 라디오버튼으로 제품명, 브랜드명 구분 후 검색
 *  가격 검색		: 별도의 가격 구분창. n~N원 입력.
 *  
 *  JLabel 2, JTextField 3, JButton 2, JRadioButton 2
 */

package com.sist.serch;

import javax.swing.*;

public class MainSerch extends JPanel{
	public JLabel la1, la2;
	public JTextField tf1, tf2, tf3;
	public JButton b1, b2;
	public JRadioButton rb1;
	
	//검색창
	public MainSerch() {
		la1=new JLabel("검색");
	}
}
