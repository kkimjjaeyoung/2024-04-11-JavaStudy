/*
 * 검색기능		: 검색 확인칸
 *  이름검색		: 이름 입력칸	
 *  브랜드 검색	: 이름검색창에서 라디오버튼으로 제품명, 브랜드명 구분 후 검색
 *  가격 검색		: 별도의 가격 구분창. n~N원 입력.
 */


package com.sist.serch;

import java.awt.Font;

import javax.swing.*;


public class SerchGrid extends JPanel{
	
	public JLabel la1;
	public SerchGrid() {
	la1=new JLabel("이름 :");	
	
	setLayout(null);
	la1.setFont(new Font("맑은 고딕",Font.BOLD,35));			//폰트, 글씨크기
	la1.setBounds(100, 100, 100, 50);							//위치
	add(la1);
	}
}
