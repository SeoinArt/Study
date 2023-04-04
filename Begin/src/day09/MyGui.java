package day09;

// 이름 없는 로컬 이너 클래스 사용 예제 -  Anonymous class

/* 이벤트핸들러 구성하는 방법
 * [1] 컴포넌트를 가진 클래스가 이벤트핸들러가 되는 방법
 * [2] 이너 클래스로 구성하는 방법
 * 		- 이너 멤버 클래스
 *      - 이름없는 로컬 클래스
 * [3] 외부 클래스로 구성하는 방법
 * 
 * */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* JButton ==> ActionEvent == > 
 * ActionListener ==> void actionPerformed(ActionEvent e)
 * 
 * JRadioButton ==> ItemEvent ==> 
 * ItemListener ==> void itemStateChanged(ItemEvent e)
 * */

public class MyGui extends JFrame {

	Container cp;

	JPanel p = new JPanel();
	JPanel pN = new JPanel();

	JRadioButton r, g, b;

	ButtonGroup gr = new ButtonGroup();

	Canvas can;

	public MyGui() {
		super("::MyGui::");
		cp = this.getContentPane();
		cp.add(p, "Center");
		cp.add(pN, "North");

		p.setBackground(Color.white);

		pN.add(r = new JRadioButton("Red"));
		pN.add(g = new JRadioButton("Green"));
		pN.add(b = new JRadioButton("Blue"));

		gr.add(r);
		gr.add(g);
		gr.add(b);

		// listener 부착
		// r.addItemListener(this);[x]

		MyEventHandler handler = new MyEventHandler();
		// MyGui.MyEventHandler han = this.new MyEventHandler();

		// 도화지 역할하는 컴포넌트, 사이즈와 배경색을 줘야 확인 가능하다.
		can = new Canvas();
		can.setSize(200, 200);
		can.setBackground(Color.yellow);
		p.add(can);

		r.addItemListener(handler);
		g.addItemListener(handler);
		b.addItemListener(handler);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// ------------------------------------------------------
	class MyEventHandler implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			// setTitle("@@@");
			Object obj = e.getSource();
			if (obj == r) {
				can.setBackground(Color.red);
			} else if (obj == g) {
				can.setBackground(Color.green);
			} else if (obj == b) {
				can.setBackground(Color.blue);
			}
		}
	}
	

	public static void main(String[] args) {
		MyGui my = new MyGui();
		my.setSize(500, 500);
		my.setVisible(true);
	}

}

