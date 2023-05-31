package src.javeley.lesson04;

import javax.swing.*;
import java.awt.*;


/**
 * 文本框和密码框
 */
public class TextBox extends JFrame {

    public TextBox() throws HeadlessException {
        Container container = this.getContentPane();
        container.setLayout(null);
        JTextField jTextField = new JTextField("hello");
        JTextField jTextField2 = new JTextField("world",20);
        JPasswordField passwordField = new JPasswordField("password");

        jTextField.setBounds(10,10,100,30);
        jTextField2.setBounds(10,50,100,30);
        passwordField.setBounds(10,100,100,30);


        container.add(jTextField);
        container.add(jTextField2);
        container.add(passwordField);
        setVisible(true);
        setBounds(100,100,300,300);

    }

    public static void main(String[] args) {
        new TextBox();
    }
}
