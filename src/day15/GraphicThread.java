package day15;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GraphicThread extends JFrame implements Runnable {

    int num, x, y;
    Color color;
    Random random;

    public GraphicThread(int num) {
        this.num = num;
        color = Color.red;
        random = new Random();
        setSize(500,400); // 프레임(화면) 크기 - 너비, 높이
        setVisible(true); // 화면 보여주기
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
//        g.fillRect(x,y,3,3);
        g.fillOval(x,y,3,3);
    }

    @Override
    public void run() {
        Rectangle rect = getBounds();
        for(int i=0; i<num; i++){
            x = random.nextInt(rect.width);
            y = random.nextInt(rect.height);

            repaint();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
//        GraphicThread gt = new GraphicThread(100);
//        Thread t1 = new Thread(gt);
//        t1.start();

        new Thread(new GraphicThread(200)).start();
    }
}
