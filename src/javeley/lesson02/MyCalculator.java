package src.javeley.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 简单的计算器案例
 */

public class MyCalculator {


    public static void main(String[] args) {
        Frame frame =  new Calculator();
        windowClose(frame);

    }
    private static  void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}



class Calculator extends Frame{
    public Calculator() throws HeadlessException {
        TextField num1 = new TextField(10);//字符数
        TextField num2 = new TextField(10);//字符数
        TextField num3 = new TextField(10);//字符数

        Button button = new Button("=");
        Label label2 = new Label("+");

        add(num1);
        add(label2);
        add(num2);
        add(button);
        add(num3);
        setLayout(new FlowLayout());
        setVisible(true);
        pack();
        //监听按钮
        button.addActionListener(new CalcListener(num1,num2,num3));

    }
}

class CalcListener implements ActionListener{
    private TextField num1,num2,num3;

    public CalcListener(TextField num1, TextField num2, TextField num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void actionPerformed(ActionEvent e) {
        //1. 取得加数与被加数
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        //2. 相加
        //3. 返回结果
        num3.setText(""+(n1+n2));
        //4. 清空输入框内容
        num1.setText("");
        num2.setText("");
    }
}