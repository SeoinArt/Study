package day06;
import javax.swing.*;
import java.awt.*;

public class MyLayout extends JFrame {

	Container cp;
	JPanel p=new JPanel();
	JPanel p1_1, p1_2;
	JButton b1,b2,b3,b4,b5,b6;
	public MyLayout() {
		super("::MyLayout::");
		cp=this.getContentPane();
		cp.add(p);
		p.setBackground(Color.blue);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyLayout my=new MyLayout();
		my.setSize(500,500);
		my.setVisible(true);

	}

}
