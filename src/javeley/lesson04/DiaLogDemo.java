package src.javeley.lesson04;

/**
 * Dialog弹弹窗案例
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class DiaLogDemo extends JFrame {
    public DiaLogDemo() {
        this.setVisible(true);
        this.setSize(700, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取得顶级面板
        Container contentPane = this.getContentPane();
        JButton button = new JButton("点击弹出一个窗口");
        //把布局模式设置为空
        contentPane.setLayout(null);
        //通过坐标设置按钮绝对布局
        button.setBounds(30, 30, 200, 100);
        //添加按钮监听事件
        button.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                    new MyDialogDemo();
            }
        });
        //绑定按钮
        contentPane.add(button);


    }

    public static void main(String[] args) {
        new DiaLogDemo();
    }

}


/**
 * Dialog是继承Window类的，操作和Frame一样，相当与重新添加一个frame
 */
class MyDialogDemo extends JDialog{
    public MyDialogDemo() {
        this.setVisible(true);
        this.setBounds(100,100,300,300);
        Container container = this.getContentPane();
        container.add(new JLabel("这是个Dialog界面"));


    }
}