package src.javeley.lesson04;

import javax.swing.*;
import java.awt.*;


/**
 * jframe案例1
 */
public class JFrameDemo1 {

    public void  init(){
        JFrame jf = new JFrame("title");
        jf.setBounds(200,200,200,200);

        //关闭事件
        /**
         * WindowConstants 接口定义了 JFrame 和 JDialog 窗口的默认关闭操作，共有三种：
         *
         * 1. DISPOSE_ON_CLOSE：
         *
         * 当用户关闭窗口时，窗口将被销毁并释放占用的内存资源。但是，如果该窗口是其他窗口的子窗口，则该子窗口并不会被销毁，而是隐藏起来等待再次显示。
         *
         * 该关闭操作适用于弹出式对话框，如提示框、输入框等窗口，因为这些窗口通常只是临时性的使用，而关闭后并不需要保留。
         *
         * 2. DO_NOTHING_ON_CLOSE：
         *
         * 当用户关闭窗口时，窗口将不做任何操作，继续保持原样。
         *
         * 该关闭操作适用于需要用户进行一些操作之后才能关闭的窗口，如编辑器、绘图工具等应用程序。
         *
         * 3. EXIT_ON_CLOSE：
         *
         * 当用户关闭窗口时，应用程序将会退出，程序进程结束。
         *
         * 该关闭操作适用于独立的应用程序，如桌面客户端、游戏等应用，因为这些应用通常只有一个窗口，关闭后就没有应用程序存在的必要了。
         *4. HIDE_ON_CLOSE
         * 它表示在关闭窗口时不会销毁窗口，而是将其隐藏。与其他三个常量相比，HIDE_ON_CLOSE 的用途相对较少，通常只在需要临时隐藏窗口而不是完全关闭它的情况下使用。
         *
         *可以使用 setDefaultCloseOperation  (WindowConstants.EXIT_ON_CLOSE）使用，也可以使用setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
         */

        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel label = new JLabel("这是一个label");
        //把label居中
        label.setHorizontalAlignment(SwingConstants.CENTER);
        jf.add(label);

        //        jf.setBackground(Color.red);  不生效问题
        /**
         * JFrame默认添加了Panel并使用了BorderLayout布局，设置背景颜色是生效的，只不过是被面板盖住了
         * 想要颜色生效，需要先获取JFrame.getContentPane()得到一个容器，然后设置容器的颜色才可以
         */
        jf.getContentPane().setBackground(Color.YELLOW);
        jf.setVisible(true);

    }

    public static void main(String[] args) {

        new JFrameDemo1().init();
    }

}
