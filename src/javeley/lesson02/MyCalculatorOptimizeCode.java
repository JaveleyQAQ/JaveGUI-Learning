package src.javeley.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyCalculatorOptimizeCode {


    /**
     * 简单的计算器案例 --代码优化
     */


    public static void main(String[] args) {
        Frame frame = new Calculator2();
        windowClose(frame);

    }

    private static void windowClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}


class Calculator2 extends Frame {
    TextField num1, num2, num3;

    public Calculator2() throws HeadlessException {
        num1 = new TextField(10);//字符数
        num2 = new TextField(10);//字符数
        num3 = new TextField(10);//字符数

        Button button = new Button("=");
        Label label2 = new Label("+");
        setTitle("123");

        add(num1);
        add(label2);
        add(num2);
        add(button);
        add(num3);
        setLayout(new FlowLayout());
        setVisible(true);
        pack();
        //监听按钮
        button.addActionListener(new CalcListener2(this));

    }
}

class CalcListener2 implements ActionListener {

    Calculator2 calculator = null;

     CalcListener2(Calculator2 calculator) {
        this.calculator = calculator;

    }

       public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(calculator.num1.getText());
        int n2 = Integer.parseInt(calculator.num2.getText());
        calculator.num3.setText("" + (n1 + n2));
        calculator.num1.setText("");
        calculator.num2.setText("");

    }
}

