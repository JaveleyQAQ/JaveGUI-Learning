package src.javeley.lesson03;


import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 简单的鼠标事件实现画笔记录
 */
public class PaintMouseListener {

    public static void main(String[] args) {
        new MyFrame("1234");

    }
}
class MyFrame extends Frame {

    ArrayList points = new ArrayList();

    public  MyFrame(String title){
        super(title);
        setBounds(200,200,400,400);
        setVisible(true);
        addMouseListener(new MyMouseListener());
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Iterator iterator =  points.iterator();
        while (iterator.hasNext()) {
            Point  point = (Point) iterator.next();
            g.setColor(Color.RED);
            g.fillOval(point.x,point.y,10,10);

        }

    }

    private  class  MyMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            super.mousePressed(e);
            points.add(e.getPoint());


        }
    }

}