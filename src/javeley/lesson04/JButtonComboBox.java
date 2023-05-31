package src.javeley.lesson04;

import javax.swing.*;
import java.awt.*;

/**
 * 下拉框和列表框
 */
public class JButtonComboBox extends JFrame {
    public JButtonComboBox() throws HeadlessException {
        Container container = this.getContentPane();

        //添加下拉框
        JComboBox comboBox  = new JComboBox();
        comboBox.addItem("上架");
        comboBox.addItem("下架");
        comboBox.addItem("售额");
        container.add(comboBox,BorderLayout.NORTH);


        //列表框
        //生成列表的内容
        String[] content = {"列表1","列表2","列表3"};
        JList jList = new  JList(content);
        container.add(jList,BorderLayout.SOUTH);



        setVisible(true);
        setBounds(100,100,300,300);

    }

    public static void main(String[] args) {
        new JButtonComboBox();
    }
}
