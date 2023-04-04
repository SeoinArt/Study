package day11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveCircle extends JFrame implements Runnable {

	Container cp;
	JPanel p = new JPanel();
	MyCirclePanel p2 = new MyCirclePanel();
	JButton btStart, btStop;
	Thread tr;
	boolean isStop = false;
	
	public MoveCircle() {
		super("::MoveCircle::");
		cp = this.getContentPane();
		cp.add(p,"North");
		cp.add(p2, "Center");
		p.setBackground(Color.magenta);
		p2.setBackground(Color.white);
		
		p.add(btStart = new JButton("Start"));
		p.add(btStop = new JButton("Stop"));
		
		// btStart 버튼에 대한 ActionEvent 처리를 anonymous 로 해보기
		// 타이틀 변경 "Start"
		
		btStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(this); // this  이름없는 클래스
				
				setTitle("Start"+this);
				isStop = false;
//				MoveCircle r = new MoveCircle(); // Runnable 객체 또 다른 JFrame
//				r.setSize (200,200);
//				r.setVisible(true);
				tr = new Thread(MoveCircle.this); 
				// 이떄의 this는 ActionListener이다 따라서 MoveCircle 객체를 지칭할 수 있도록 클래스명 지명
				tr.start();
				
				
				// 스레드 생성해서 동작시키기
			}
		});
		;
		
		// btStop에 대한 이벤트 처리 Lambda 처리
		// 타이틀 변경 "Stop"
		btStop.addActionListener((e)->{
			System.out.println(this); //람다식의 this는 MoveCircle이 된다.
			setTitle("Stop"+this);
			isStop=true;
			//tr.interrupt();
//			tr.stop(); // [x] 안쓰는 것이 좋음 deprecated
			
			
			// 스레드 동작을 중지시키기
			});
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} // 생성자
	
	@Override
	public void run() {
		// 무한반복을 돌면서 MyCirclePanel의 x값 증가
		// sleep() 걸어주기 
		while(!isStop) {
			p2.x = (p2.x>p2.getWidth())? 0 : p2.x+5;
			
			p2.repaint(); // JVM이 알아서 paint() 호출
			// paint()는 JVM이 호출하는 메서드 ==> 개발자는 repaint()를 호출해야한다.
			
			System.out.println("p2.x: "+p2.x);
			
			try {
			Thread.sleep(10);
			}catch(InterruptedException e) {
				System.out.println(e);
				break;
			}
		}
	}// -- run()
	

	public static void main(String[] args) {
		MoveCircle my = new MoveCircle();
		my.setSize(700, 500);
		my.setVisible(true);
	}

}
