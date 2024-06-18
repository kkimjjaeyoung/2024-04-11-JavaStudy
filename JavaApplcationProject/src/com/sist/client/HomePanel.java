package com.sist.client;
import java.util.*;
import java.net.*;
import com.sist.dao.*;

import oracle.net.aso.j;

import com.sist.commons.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePanel extends JPanel implements ActionListener, MouseListener{
	JPanel pan=new JPanel();		//이미지 12개 출력
	JButton b1, b2;
	JLabel la=new JLabel("0 page / 0page");
	JLabel[] imgs=new JLabel[12];
	
	
	int curpage=1;		//현재 페이지
	int totalpage=0;	//총 페이지
	
	GoodsDAO dao;		//데이터베이스 연결
	ControllPanel cp;
	public HomePanel(ControllPanel cp) {			//초기화
		this.cp=cp;
		dao=GoodsDAO.newInstance();
		pan.setLayout(new GridLayout(3,4,5,5));
		
		setLayout((new BorderLayout()));
		add("center", pan);
		b1=new JButton("이전");
		b2=new JButton("다음");
		JPanel p=new JPanel();
		p.add(b1); 
		p.add(b2);
		p.add(la);
		add("south", p);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void print() {
		totalpage=dao.goodsTotalPage();
		ArrayList<GoodsVO> list=dao.goodsListData(curpage);
		for(int i=0; i<list.size(); i++) {
			GoodsVO vo=list.get(i);
			try {
				URL url=new URL(vo.getGoods_poster());
				Image img=ImageChange.getImage(new ImageIcon(url), 240, 200);
				//이미지 크기 축소
				imgs[i]=new JLabel(new ImageIcon(img));
				imgs[i].setToolTipText(vo.getGoods_name()+"^"+vo.getNo());
				pan.add(imgs[i]);
			}catch(Exception ex) {}
			
		}
		la.setText(curpage+" page / "+totalpage+" pages");
	}
	public void init() {
		for(int i=0; i<imgs.length; i++) {
			imgs[i]=new JLabel("");
		}
		pan.removeAll();
		pan.validate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			if(curpage>1) {
				curpage--;
				init();
				print();
			}
		}
		else if(e.getSource()==b2) {
			if(curpage<totalpage) {
				curpage++;
				init();
				print();
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0; i<imgs.length; i++) {
			if(e.getSource()==imgs[i]) {
				if(e.getClickCount()==2) {
					cp.card.show(cp, "DP");
				}
			}
		}
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
