package com.sist.music;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;



public class 라이브러리활용_3 extends JFrame implements ActionListener, MouseListener{	//액션, 마우스 이벤트
	JTextField tf;
	JButton b, b1;
	JTable table;
	DefaultTableModel model;
	
	public 라이브러리활용_3() {
		tf=new JTextField(20);
		b=new JButton("검색");
		b1=new JButton("목록");
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b);
		p.add(b1);
		
		add("North", p);
		
		String[] col= {"번호", "노래명", "가수명"};
		String[][] row=new String[0][3];
		model=new DefaultTableModel(row,col)
		{

			@Override					//수정 금지
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;					
			}
			
		};
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);		//스크롤바
		add("center", js);		// js를 center위치에 추가
		
		musicData();
		setSize(500, 450);		//윈도우 크기
		setVisible(true);		//크기조정
		
		b.addActionListener(this);
		b1.addActionListener(this);
		table.addMouseListener(this);		//사용자 입력 사항
	}
	public void musicData() {
		for(int i=model.getRowCount()-1; i>=0; i--) {
			model.removeRow(i);
		}
		
		MusicSystem ms=new MusicSystem();
		Music[] music=ms.musicListData();
		for(Music m:music) {
			String[] data={String.valueOf(m.getMno()), m.getTitle(), m.getSinger()};
			model.addRow(data);
		}
	}
	public void musicFIndData(String fd) {
		for(int i=model.getRowCount()-1; i>=0; i--) {
			model.removeRow(i);
		}
		MusicSystem ms=new MusicSystem();
		Music[] music=ms.musicFindData(fd);
		
		for(Music m:music) {
			String[] data={String.valueOf(m.getMno()), m.getTitle(), m.getSinger()};
			model.addRow(data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicSystem ms=new MusicSystem(); 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) {			//b버튼을 눌렀을 때
			String fd=tf.getText();
			if(fd.trim().length()<1) { //글자가 입력이 안 된 경우(공백을 제외한 글자가 1개 미만일 경우)ㄴ
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요");
				tf.requestFocus();
				return;
			}
			musicFindData(fd.trim());
		}
		else if(e.getSource()==b1) {
			musicData();
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
