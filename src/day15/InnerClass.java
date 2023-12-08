package day15;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClass { //Outer class

    class EventHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("actionevent 발생");
            System.out.println(e.getActionCommand());
            System.out.println(e.getSource());
            System.out.println();
        }
    }

        public static void main(String[] args) {
            Frame frame = new Frame("이벤트처리 -이너클래스"); //프레임 (화면)
            Button btn = new Button("Button - Start");

            EventHandler handler = new InnerClass().new EventHandler();
            btn.addActionListener(handler);
            frame.add(btn);
            frame.setVisible(true);
            frame.setSize(300,200);
            frame.setLocation(300,150);
        }



}
