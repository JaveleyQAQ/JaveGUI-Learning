import  java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author "Javeley"
 */


public class Demo1 {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame(100,300,400,400,Color.BLACK );
        MyFrame myFrame2 = new MyFrame(500,300,400,400,Color.RED );
        MyFrame myFrame3 = new MyFrame(100,700,400,400,Color.gray );
        MyFrame myFrame4 = new MyFrame(500,700,400,400,Color.green );

        myFrame.addWindowListener(new WindowAdapter() {
            @Override
            //添加关闭事件
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }



}
class MyFrame extends Frame {

    static int id = 0;

    public MyFrame(int x, int y, int w, int h, Color color) {
        super("Demo"+(++id));
        setLocation(x,y);
        setSize(w,h);
        setBackground(color);
        setVisible(true);
    }

}
