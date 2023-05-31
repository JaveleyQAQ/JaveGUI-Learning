package src.javeley.lesson04;

import javax.swing.*;
import java.awt.*;


/**
 * 简单的多选框案例
 */
public class JButtonCheckBox extends JFrame {

    public JButtonCheckBox() throws HeadlessException {
        Container container = this.getContentPane();
        JCheckBox checkBox = new JCheckBox("checkBox1");
        JCheckBox checkBox2 = new JCheckBox("checkBox2");
        container.add(checkBox,BorderLayout.NORTH);
        container.add(checkBox2,BorderLayout.SOUTH);




        this.setVisible(true);
        this.setBounds(200,200,200,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new JButtonCheckBox();
    }
}
