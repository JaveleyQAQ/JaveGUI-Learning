package src.javeley.lesson02;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 编辑框监听事件
 *
 */
public class ListenDemo2 {
    public static void main(String[] args) {
         new MyFrame();
    }

}

class MyFrame extends Frame{
    public MyFrame() {
        TextField textField = new TextField("",10);
        add(textField);
        setSize(400,400);
        setVisible(true);
        pack();

        //监听文本框事件，回车
        textField.addActionListener(new MyListener());

    }
}

class MyListener implements ActionListener{


    public void actionPerformed(ActionEvent e) {
        TextField textField = (TextField) e.getSource();
        System.out.printf("=>"+ textField.getText()+"\n");
        textField.setText(" ");

    }
}
