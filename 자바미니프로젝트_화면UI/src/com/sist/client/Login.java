/*
 * 윈도우(컨테이너)
 *	JFrame : 기본윈도우(최소화, 최대화, 닫기 버튼) 
 *	JWindow : 타이틀바 없음
 *	JPanel : 단독수행 불가. JFrame, JWindow 내 화면병경
 *	JDialog : 팝업창 
 * 컴포넌트
 * 	버튼 : 메뉴(JMenu) || 버튼(JButton) || 라디오(JRadioButton) || 체크(JCheckBox)
 * html	<input type=button>
 * 		<input type=radio>
 * 		<input type=checkbox>
 * 	입력창 : 한줄입력(JTextField, JpasswordField) || 여러줄입력(JTextArea)
 * 				JTextArea				||		textarea 
 * 	라벨 : JLabel
 * 	테이블 : JTable
 * 	트리 : JTree
 * 
 * 배치
 * 	BorderLayout
 * 	FlowLayout
 * 	GridLayout
 * 	CardLayout
 * 	사용자정의(직접 배치)
 */

/*윈도우창 구성
 * 1. JFrame 상속
 * 2. 필요한 컴포넌트를 포함
 * 3. 생성자(초기화 후 배치)
 * 
 * 		라벨 2, JTextFIeld, JpasswordField, JButton2
 */


//  NoireLookAndFeel  

package com.sist.client;

import javax.swing.*;

public class Login extends JFrame{
//포함 클래스
	//모든 맴버변수는 private가 아니다. 라이브러리는 public으로 설정
	public JLabel la1, la2;
	public JTextField tf;
	public JPasswordField pf;
	public JButton b1, b2;
	
	//생성자(초기화). 화면배치 구성. 다른클래스와 연결을 위해 public
	public Login() {
		setTitle("로그인");
		//생성자(초기화)
		la1=new JLabel("아이디");
		la2=new JLabel("비밀번호");
		
		tf=new JTextField();
		pf=new JPasswordField();
		
		b1=new JButton("로그인");
		b2=new JButton("취소");
		
		//배치  (현 사용자정의)
		setLayout(null);			//BorderLayout
		la1.setBounds(10, 15, 80, 30);		//(x, y, 가로길이, 세로길이)
		tf.setBounds(100, 15, 200, 30);
		la2.setBounds(10, 60, 80, 30);		
		pf.setBounds(100, 60, 200, 30);
		//윈도우에 추가
		add(la1);	add(tf);	add(la2);	add(pf);
		JPanel p=new JPanel();		//가운데정렬
		p.add(b1); p.add(b2);
		p.setBounds(10, 90, 290, 35);
		add(p);
		//윈도우 크기 설정
		setSize(350, 175);
		//출력여부
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");		//com.jtattoo.plaf.패키지명.패키지명+LookAndFeel				앞 패키지명은 소문자
		}catch(Exception ex) {}
		
		//생성자 호출
		new Login();
	}

}
