package day08;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;

public class MyLoginPage extends JPanel{
	public JTextField tfName;
	public JPasswordField tfPwd;
	public JButton btLogin;
	
	// [1] x,y 좌표를 지정해서 붙이려면 기본 레이아웃을 해제 해야한다.
	// [2] 컴포넌트들의 크기와 x,y 좌표를 수동으로 지정해야한다. setBounds(x,y,w,h)
	public MyLoginPage() {
		this.setLayout(null); // 기본 레이아웃 해제
		
		tfName = new JTextField(20);
		tfPwd = new JPasswordField(20);
		btLogin = new JButton("Login");
		
		tfName.setBounds(90,170,200,50); // x , y, width, height
		tfPwd.setBounds(90,240,200,50);
		btLogin.setBounds(90,310,200,50);
		
		btLogin.setBackground(new Color(110,200,100)); // r g v
		btLogin.setForeground(Color.white);
		
		tfName.setBorder(new TitledBorder("Name"));
		tfPwd.setBorder(new TitledBorder("Password"));
		
		add(tfName);
		add(tfPwd);
		add(btLogin);
		
		
		
		
		
		
	}
	
}
