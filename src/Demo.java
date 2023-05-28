import  java.awt.*;

/**
 * @author "Javeley"
 */

public class Demo {
    public static void main(String[] args) {
        Frame frame = new Frame("This is Title");
        //设置窗口大小
        frame.setSize(400, 400);

        //设置颜色
        frame.setBackground(Color.RED);
        //设置位置
        frame.setLocation(400, 400);
        //是否可改变大小
        frame.setResizable(false);
        //可视化
        frame.setVisible(true);

    }
}