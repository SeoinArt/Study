package day05;

// GUI . Graphic User Interface : 윈도우 애플리케이션
// CLI . Command Line Interface : 콘솔 애플리케이션

import javax.swing.*;
import java.awt.*;


// 윈도우 프로그램 ==> javas.swing.JFrame를 상속받아 구현한다.
// 사이즈를 주고 setVisible(true)을 해야 육안으로 확인 가능

// JPannel을 생성해서 JFrame이 가지고 있는 Containe에 붙인다.
public class MyGui extends JFrame{
	JButton btn[] = new JButton[10]; // component (부품)
	ImageIcon icon[] = new ImageIcon[5]; // image Icon
	JPanel p; // Container 
	
	// javax.swing 패키지 api 보면서 p에 객체 생성해서 붙여보기
	JTextField tf1, tf2;
	JCheckBox c1,c2,c3; // Java, HTML, CSS
	JRadioButton r1,r2; // Male, Female
	ButtonGroup bg = new ButtonGroup();
	JTextArea ta1;
	Container cp;
	
	
	public MyGui() // 기본 생성자 구성하기
	{
		cp = getContentPane(); // Container를 반환하는 method
		p = new JPanel(); // 패널(일종의 Container)
		p.setBackground(Color.white);
		cp.add(p);
		
		for(int i=0; i<icon.length; i++) {
			icon[i] = new ImageIcon("./images/icon"+i+".png");
		}
			
		// button 생성
		btn[0] = new JButton("Home");
		btn[1] = new JButton("Login");
		btn[2] = new JButton(icon[1]);
		btn[3] = new JButton("Join",icon[1]);
		
		// button 배경색 지정
		btn[0].setBackground(Color.white);
		btn[1].setBackground(Color.white);
		btn[2].setBackground(Color.white);
		btn[3].setBackground(Color.white);
		
		// button text 위치 지정
		btn[3].setHorizontalTextPosition(JButton.CENTER); // 텍스트를 수평 중앙에 위치
		btn[3].setVerticalTextPosition(JButton.TOP); // 수직 탑에 위치
		
		// 마우스 이벤트 (그림 바꾸기)
		btn[3].setPressedIcon(icon[3]);
		btn[3].setRolloverIcon(icon[4]);
		
		// 버튼 삽입	
		p.add(btn[0]);
		p.add(btn[1]);
		p.add(btn[2]);
		p.add(btn[3]);
		
		// textField 생성
		tf1 = new JTextField(20);
		tf2 = new JTextField("네이버를 검색해봐",20);
		
		// textField 삽입
		p.add(tf1);
		p.add(tf2);
		
		// checkBox 생성
		c1 = new JCheckBox("HTML");
		c2 = new JCheckBox("CSS",true);
		c3 = new JCheckBox("JS");
		
		// checkBox 삽입
		p.add(c1);
		p.add(c2);
		p.add(c3);
		
		// RadioButton 생성
		r1 = new JRadioButton("Male",true);
		r2 = new JRadioButton("Female");
		
		// ButtonGroup에 RadioButton 삽입 => 단일 체크만 허용
		bg.add(r1);
		bg.add(r2);
		
		// RadioButton 삽입
		p.add(r1);
		p.add(r2);
		
		// TextArea 생성 
		ta1 = new JTextArea("행 5 aaaaaaaaaaaaaaaa열 15",10,35);
		
		// scrollPaan을 붙여야 스크롤바가 생성된다.
		
		JScrollPane sp = new JScrollPane(ta1);
		
		
		
		
		
		// TextArea 배경과 폰트 색상 변경 ( 블랙 & 화이트 )
		ta1.setBackground(Color.black);
		ta1.setForeground(Color.white);
		
		// TextArea 삽입
		p.add(sp);
		
		
		
		
		
		// 창닫기 처리
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로세스 종료
		
	} // 생성자------------------
	
	public static void main(String[] args) {
		MyGui my = new MyGui();
		my.setSize(500,500); // width, height
		my.setVisible(true);
		
		
	}
}
