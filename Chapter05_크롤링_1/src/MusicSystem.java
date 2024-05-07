import javax.swing.*;
import javax.swing.table.*;


public class MusicSystem {
	JTable table;
	DefaultTableModel model;			//초기화 함수
	public MusicSystem() {
		String[] col= {" ", "노래명", "가수명"};
		Object[][] row=new Object[0][3];
		model=new DefaultTableModel(row,col);
		JScrollPane js=new JScrollPane(table);
		table=new JTable(model);
		add("center", js);
		setSize(500, 550);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
