package com.sist.lang;

import javax.swing.*;
import java.awt.event.*;

/*
 * class jframe extends object
 * class 라이브러리_object_1 extends jframe
 * 		
 * 클래스의 크기 
 * 	상속 : 상속을 내리는 클래스 > 상속을 받는 클래스
 *  포함 : 포함하고 있는 클래스의 크기가 더 크다
 */
class A{
	static int[] arr=new int[10];
	static {
		
	}
}

public class 라이브러리_Object_1 extends JFrame implements ItemListener{
	JComboBox box;
	JLabel la;
	//포함클래스 -> has-a
	public 라이브러리_Object_1() {
		//인스턴스 변수/클래스는 초기화 위치가 보통 생성자(가장먼저 호출해야하므로)
		box=new JComboBox();
		box.addItem("홍길동");
		box.addItem("심청이");
		box.addItem("이순신");
		box.addItem("박문수");
		box.addItem("강감찬");
		//원형 -> 접근지정어, 리턴형/매개변수
		//Object는 모든 데이터형을 사용가능하고 배열일 경우 섞어서도 가능하다.
		
		la=new JLabel("", JLabel.CENTER);
		
		setLayout(null);
		box.setBounds(10, 15, 300, 30);
		la.setBounds(10, 50, 200, 50);
		
		add(box);
		add(la);
		
		setSize(350, 150);
		setVisible(true);
		
		box.addItemListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 라이브러리_Object_1();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box) {		//box에서 선택시
			String name=box.getSelectedItem().toString();		//객체를 문자열로 변환
					la.setText(name);
		}
	}

}
