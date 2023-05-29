package src.javeley.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 按钮监听
 */

public class ListenDemo {

    public static void main(String[] args) {
        Frame frame = new Frame("demo");
        Button bt1 = new Button("bt1");
        bt1.addActionListener(new MyActionListener());

        frame.add(bt1);
        frame.setVisible(true);
        frame.setSize(400,400);
        windowClose(frame);



    }
    //关闭窗口
    private static  void  windowClose(Frame frame){
        frame.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
    }
}
//按钮事件监听
class MyActionListener  implements ActionListener{

    public void actionPerformed(ActionEvent e) {

        System.out.printf("aaaaa");

    }
}
