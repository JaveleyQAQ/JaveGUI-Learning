package javeley.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * 流布局
 */
public class TestFlowLayout {


    public static void main(String[] args) {

        Frame frame  = new Frame();

        // 添加按钮
        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");
        Button button3 = new Button("Button3");

        frame.setLayout( new FlowLayout(FlowLayout.RIGHT));
//        frame.setLayout( new FlowLayout(FlowLayout.LEFT));

        frame.setSize(200,200);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }






}


