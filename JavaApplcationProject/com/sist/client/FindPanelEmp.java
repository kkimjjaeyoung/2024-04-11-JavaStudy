package com.sist.client;
import java.util.*;
import com.sist.dao.*;
import com.sist.commons.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class FindPanelEmp extends JPanel implements ActionListener, MouseListener{
	JTable table;
	DefaultTableModel model;
	JTextField tf;
	JButton b;
	GoodsDAO dao;
	ControllPanel cp;
	TableColumn column;
	public FindPanelEmp(ControllPanel cp) {
		dao=GoodsDAO.newInstance();
		this.cp=cp;
		
		setLayout(new BorderLayout());
		tf=new JTextField(20);
		b=new JButton("검색");
		
		JPanel p=new JPanel();
		p.add(tf); p.add(b);
		add("North", p);
		
		String[] col= {"사번", "이름", "소속 부서", "전화번호", "이메일", "연봉"};
		Object[][] row=new Object[0][7];
		
		model=new DefaultTableModel(row, col) {
		@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}

		@Override
		public Class<?> getColumnClass(int columnIndex) {
			// TODO Auto-generated method stub
			return getValueAt(0, columnIndex).getClass();
		}
		
		};
		table=new JTable(model);
		table.setRowHeight(30);
		table.getTableHeader().setReorderingAllowed(false);
		table.setShowVerticalLines(false);
		JScrollPane js=new JScrollPane(table);
		add("Center", js);
		
		for(int i=0; i<col.length; i++) {
			column=table.getColumnModel().getColumn(i);
			if(i==0) 
				column.setPreferredWidth(30);
			else if(i==1)
				column.setPreferredWidth(70);
			else if(i==2)
				column.setPreferredWidth(70);
			else if(i==3)
				column.setPreferredWidth(70);
			else if(i==4)
				column.setPreferredWidth(70);
			else if(i==5)
				column.setPreferredWidth(70);
			else if(i==6)
				column.setPreferredWidth(70);
		}
		
		tf.addActionListener(this);
		b.addActionListener(this);
    	table.addMouseListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf || e.getSource()==b) {
			String name=tf.getText();
			if(name.length()<1) {
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요");
				tf.requestFocus();
				return;
			}
			//데이터베이스 연동
			ArrayList<GoodsVO> list=dao.goodsFindData(name);
			if(list.size()<1) {
				JOptionPane.showMessageDialog(this, "검색된 결과가 없습니다");
			}
			else {
				for(int i=model.getRowCount()-1; i>0; i--) {
					model.removeRow(i);
				}
				for (GoodsVO vo:list) {
					try {
						URL url=new URL((vo.getGoods_poster()));
						Image img=ImageChange.getImage(new ImageIcon(url), 35, 35);
						Object[] obj= {
								vo.getNo(),new ImageIcon(img), vo.getGoods_name(), vo.getGoods_price() 
						};
						model.addRow(obj);
					}catch(Exception ex) {}
				}
			}
			
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==table) {
			if(e.getClickCount()==2) {
				int row=table.getSelectedRow();
				String no=model.getValueAt(row, 0).toString();
				cp.dp.print(Integer.parseInt(no), no);
				cp.card.show(cp,"DP");
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