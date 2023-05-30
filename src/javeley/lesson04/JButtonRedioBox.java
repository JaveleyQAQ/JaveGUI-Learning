package src.javeley.lesson04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * 单选框,和带图片的按钮
 */
public class JButtonRedioBox extends JFrame {

    public JButtonRedioBox() throws HeadlessException {
        Container container  = this.getContentPane();
        container.setLayout(new GridLayout(1,2,10,10));
        JPanel  jPanel1 = new JPanel(new FlowLayout());
        JPanel  jPanel2 = new JPanel(new FlowLayout());

        URL iconPath = this.getClass().getResource("img.png");
        ImageIcon icon = new ImageIcon(iconPath);
        JButton button = new JButton("button");
        //鼠标放上去的提示文字
        button.setToolTipText("这是一个图片按钮");
        button.setIcon(icon);
//        container.add(button);


        //单选框
        JRadioButton radioButton = new JRadioButton("JRadioButton1");
        JRadioButton radioButton2 = new JRadioButton("JRadioButton2");
        JRadioButton radioButton3 = new JRadioButton("JRadioButton3");
        jPanel1.add(radioButton,BorderLayout.EAST);
        jPanel1.add(radioButton2,BorderLayout.EAST);
        jPanel1.add(radioButton3,BorderLayout.EAST);
        //分组单选框，同一组内只能选择一个
        JRadioButton radioButton4 = new JRadioButton("JRadioButton4");
        JRadioButton radioButton5 = new JRadioButton("JRadioButton5");
        JRadioButton radioButton6 = new JRadioButton("JRadioButton6");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton4);
        buttonGroup.add(radioButton5);
        buttonGroup.add(radioButton6);

        jPanel2.add(radioButton4);
        jPanel2.add(radioButton5);
        jPanel2.add(radioButton6);

        container.add(jPanel1);
        container.add(jPanel2);
        this.pack();
        this.setVisible(true);
        this.setBounds(200,200,300,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JButtonRedioBox();
    }
}
