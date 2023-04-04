package day08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 퐁씨가 로그인하면 p2패널 보여주기 card.show(cp."home");
// 콩씨가 로그인하면 NotSupportedNameException 발생시켜서 경고창 띄우기
// 기타 성씨가 로그인하면 NotSupportedNameException 발생시켜서 경고창 띄우고 화면 전환 (p2)

// CardLayout
public class MyApp extends JFrame implements ActionListener {

	Container cp;
	MyLoginPage p = new MyLoginPage(); // 1번 카드
	JPanel p2 = new JPanel(); // 2번 카드
	CardLayout card;

	public MyApp() {
		super("::MyApp::");
		cp = this.getContentPane(); // 기본 BorderLayout => CardLayout 변경
		card = new CardLayout();
		cp.setLayout(card);
		cp.add(p, "login"); // white
		cp.add(p2, "home"); // pink

//		card.show(cp,"home");

		p.btLogin.addActionListener(this);

		p.setBackground(Color.yellow);
		p2.setBackground(Color.pink);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String name = p.tfName.getText();
		char[] ch = p.tfPwd.getPassword();
		String pwd = new String(ch);

		try {
			login(name, pwd);
		} catch (NotSupportedNameException e1) {
			JOptionPane.showMessageDialog(cp, e1.getMessage());
		}
	}
/*		boolean text = (p.tfName).getText().equals("");
		String name = p.tfName.getText()
  		if ((obj == p.btLogin) && (!text)) {
		try {
			login(name, pwd);
		} catch (NotSupportedNameException e1) {
			JOptionPane.showMessageDialog(this, e1.getMessage());
			e1.printStackTrace();
		}
}*/

	

//	public void login(String name, String passwd) throws NotSupportedNameException {
//		if ((p.tfName).getText().startsWith("퐁")) {
//			card.show(cp, "home");
//		} else if ((p.tfName).getText().startsWith("콩")) {
//			reset();
//			throw new NotSupportedNameException("콩씨는 절대로 로그인 불가");
//		} else {
//			card.show(cp, "home");
//			throw new NotSupportedNameException("기타 성씨 분들은 이용에 제한이 있어요");
//		}
//	}

	public void login(String name, String pwd) throws NotSupportedNameException {
		if (name.startsWith("퐁")) {
			passwdCheck(name,pwd);
		} else if (name.startsWith("콩")) {
			throw new NotSupportedNameException("콩씨는 절대로 입장할 수 없어요!!");

		} else {
			card.show(cp, "home");
			throw new NotSupportedNameException("기타 성씨 분들은 이용에 제한이 있어요");
		}
	}
	
	public void passwdCheck(String name, String pwd) throws NotSupportedNameException {
		if(pwd.equals("123")) {
			card.show(cp,"home");
			setTitle(name + "님 환영합니다");
		}else
			throw new NotSupportedNameException("비밀번호가 일치하지 않습니다");
	}

	public void reset() {
		p.tfName.setText("");
		p.tfPwd.setText("");
		p.tfName.requestFocus();
	}

	public static void main(String[] args) {
		MyApp my = new MyApp();
		my.setSize(500, 500);
		my.setVisible(true);
	}
}