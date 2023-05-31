package src.javeley.snake;

import javax.swing.*;

/**
 * 贪吃蛇小游戏
 */
public class StartGame {
    public static void main(String[] args) {


        JFrame frame = new JFrame();

        frame.add(new GamePanel());
        frame.setVisible(true);
        frame.setBounds(300,200,900,720);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
