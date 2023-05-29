package src.javeley.lesson01;


import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 组合布局 实战
 * ——————————————————————
 * |    | ___________|  |
 * |    |            |  |
 * ——————————————————————
 * |    |            |  |
 * ——————————————————————
 */
public class CombinedLayout {

    public static void main(String[] args) {
        JFrame frame = new JFrame("组合布局");
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLocation(200,200);
        frame.setBackground(Color.RED);
        //切割frame为两行一列布局
        frame.setLayout(new GridLayout(2,1));


        JPanel p1 = new JPanel( new BorderLayout());
        JPanel p2 = new JPanel( new GridLayout(2,1));
        JPanel p3 = new JPanel( new BorderLayout());
        JPanel p4 = new JPanel( new GridLayout(2,2));

        //上面板
        //先将按钮放左右
         p1.add(new Button("bt1"),BorderLayout.EAST);
         p1.add(new Button("bt2"),BorderLayout.WEST);
         //再将按钮放上下
         p2.add(new Button("p2-bt1"),BorderLayout.SOUTH);
         p2.add(new Button("p2-bt2"),BorderLayout.NORTH);
         //然后把上下按钮的面板放入p1的中间
         p1.add(p2,BorderLayout.CENTER);

         //下面板
         p3.add(new Button("p3-bt1"),BorderLayout.WEST);
         p3.add(new Button("p3-bt2"),BorderLayout.EAST);

        for (int i = 0; i <4 ; i++) {
            p4.add(new Button("p4-bt"+i));
        }

         p3.add(p4,BorderLayout.CENTER);




        frame.add(p1);
        frame.add(p3);


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }




}
