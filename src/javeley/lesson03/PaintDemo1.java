package src.javeley.lesson03;

import java.awt.*;

/**
 * 画笔1
 */

public class PaintDemo1 {


    public static void main(String[] args) {

        new MyPaint().loadFrame();
    }
}
class MyPaint extends Frame {

    public void loadFrame(){
        setVisible(true);
        setBounds(200,200,600,600);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.drawString("hello",100,100);
        //画一个空心圆
        g.drawOval(200,250,100,100);
        //画一个实心圆
        g.setColor(Color.GREEN);
        g.fillOval(150,150,100,100);
        //画一个矩形
        g.fillRect(300,300,200,200);

        //画笔颜色相当于选中，不切换或者还原的话会默认是上一个设置的颜色；所以使用完了记得要还原颜色

    }
}