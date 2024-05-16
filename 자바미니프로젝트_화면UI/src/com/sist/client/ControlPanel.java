package com.sist.client;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.color.*;
import javax.swing.*;

public class ControlPanel extends JPanel {
	public CardLayout card=new CardLayout();
	public HomePanel hp=new HomePanel();
	public FindPanel fp=new FindPanel();
	public ControlPanel() {
		setLayout(card);			//가장 위의 add가 적용
		add("HOME", hp);
		add("FIND", fp);
		
	}


}
