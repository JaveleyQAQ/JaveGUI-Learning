package src.javeley.lesson04;

import javax.swing.*;
import java.awt.*;

/**
 * 滚动文本面板案例(记事本)
 */
public class JScrollDemo extends JFrame {
    public JScrollDemo() throws HeadlessException {
        this.setVisible(true);
        Container container = this.getContentPane();
        //文本域
        JTextArea textArea = new JTextArea(20, 50);
        textArea.setText("hello");

        //Scroll面板 滚动面板
        JScrollPane scrollPane = new JScrollPane(textArea);

        container.add(scrollPane);
        //窗口大小应该再添加完组建后再设置，不然会导致需要拖动窗体大小才会显示组件
        this.setBounds(200, 200, 300, 300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollDemo();
    }
}
