package day08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyAppSolution extends JFrame {

	Container cp;
	JPanel p = new JPanel();

	public MyAppSolution() {
		super("::MyGui::");
		cp = this.getContentPane();
		cp.add(p, "Center");
		p.setBackground(Color.white);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyAppSolution my = new MyAppSolution();
		my.setSize(500, 500);
		my.setVisible(true);
	}
}
