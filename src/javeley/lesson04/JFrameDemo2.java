package src.javeley.lesson04;


import javax.swing.*;
import java.awt.*;

/**
 * 一些JFrame的组件结合使用
 */
public class JFrameDemo2 extends JFrame {

    public JFrameDemo2() throws HeadlessException {
        this.setVisible(true);
        this.setBounds(500,500,500,500);
        Container container  = this.getContentPane();

        container.setLayout(new GridLayout(2,1,10,10));//10是上下行间距
        JPanel panel1 = new JPanel( new GridLayout(1,1));
        JPanel panel2 = new JPanel( new GridLayout(2,2));
        JPanel panel3 = new JPanel( new GridLayout(3,3));
        panel1.add(new JButton("1"));
        panel1.add(new JButton("1"));
        panel2.add(new JButton("2"));
        panel2.add(new JButton("2"));
        panel2.add(new JButton("2"));
        panel2.add(new JButton("2"));
        panel3.add(new JButton("3"));
        panel3.add(new JButton("3"));
        panel3.add(new JButton("3"));
        panel3.add(new JButton("3"));
        panel3.add(new JButton("3"));

        container.add(panel1);
        container.add(panel2);
        container.add(panel3);


    }

    public static void main(String[] args) {
        new JFrameDemo2();
    }
}
