import javax.swing.*;
public class 문자열4 extends JFrame {
	JTextField tf=new JTextField();
	public 문자열4() {
		add("North", tf);
		tf.setText(String.valueOf(1000)); 	//정수값이 안들어가니 변경 후 삽입
		//tf.setText(String.valueOf(true));		//"True"
		setSize(350, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 문자열4();
	}

}
