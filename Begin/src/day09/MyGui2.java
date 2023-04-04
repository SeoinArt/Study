package day09;

// 이름 없는 로컬 이너 클래스 사용 예제 -  Anonymous class

/* 이벤트핸들러 구성하는 방법
 * [1] 컴포넌트를 가진 클래스가 이벤트핸들러가 되는 방법
 * [2] 이너 클래스로 구성하는 방법
 *       - 이너 멤버 클래스
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

public class MyGui2 extends JFrame implements ItemListener {

   Container cp;

   JPanel p = new JPanel();
   JPanel pN = new JPanel();

   JRadioButton r, g, v;

   ButtonGroup gr = new ButtonGroup();

   Canvas can;

   public MyGui2() {
      super("::MyGui2::");
      cp = this.getContentPane();
      cp.add(p, "Center");
      cp.add(pN, "North");

      p.setBackground(Color.white);

      pN.add(r = new JRadioButton("Red"));
      pN.add(g = new JRadioButton("Green"));
      pN.add(v = new JRadioButton("Blue"));

      gr.add(r);
      gr.add(g);
      gr.add(v);

      r.addItemListener(new ItemListener() {
         
         @Override
         public void itemStateChanged(ItemEvent e) {
            
         }
      }); 
            

      // 도화지 역할하는 컴포넌트, 사이즈와 배경색을 줘야 확인 가능하다.
      can = new Canvas();
      can.setSize(200, 200);
      can.setBackground(Color.yellow);
      p.add(can);
      
      //리스너 부착--
      //Anonymous class로 이벤트 핸들러를 구성해본다
      r.addItemListener(new ItemListener() {      
      @Override
      public void itemStateChanged(ItemEvent e) {
         can.setBackground(Color.red);
         
      }
   });
      g.addItemListener(new ItemListener() {      
      public void itemStateChanged(ItemEvent e) {
         can.setBackground(Color.green);
         
      }
   });
//      v.addItemListener(new ItemListener() {            
//      public void itemStateChanged(ItemEvent e) {
//         can.setBackground(Color.blue);
//         
//      }
//   });
    //Lambda식
      v.addItemListener(e->{can.setBackground(Color.black);});
      
      
      
     
    
      

      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }//----------------------------------
  

   
   public static void main(String[] args) {
      MyGui2 my = new MyGui2();
      my.setSize(500, 500);
      my.setVisible(true);
   }

   @Override
   public void itemStateChanged(ItemEvent e) {
      // TODO Auto-generated method stub
      
   }

}
