package day11;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
// 모든 컴포넌트와 컨테이너들은 paint() 메서드를 갖는다.
public class MyCirclePanel extends JPanel {
	
	int x = 50, y = 150;
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);
		
		// x,y,w,h
//		g.drawRect(50, 50, 100, 100);   사각형
//		g.fillRect(50, 50, 100, 100); // 꽉찬 사각형
		
//		g.setColor(Color.yellow);
//		g.drawOval(50, 50, 100, 100); 원
//		g.fillOval(50, 50, 100, 100); // 꽉찬 원
		
		g.setColor(Color.orange);
		g.fillOval(x, y, 100, 100);
		
		// g.drawImage()
	}
}
