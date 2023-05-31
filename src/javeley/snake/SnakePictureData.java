package src.javeley.snake;

import javax.swing.*;
import java.net.URL;


/**
 * 绑定游戏图片数据
 */
public class SnakePictureData {

    public static URL headerURL = SnakePictureData.class.getResource("static/header.png");
    public static ImageIcon HEADER = new ImageIcon(headerURL);
    public static URL upURL = SnakePictureData.class.getResource("static/up.png");
    public static URL downURL = SnakePictureData.class.getResource("static/down.png");
    public static URL leftURL = SnakePictureData.class.getResource("static/left.png");
    public static URL rightURL = SnakePictureData.class.getResource("static/right.png");
    public static ImageIcon UP = new ImageIcon(upURL);
    public static ImageIcon DOWN = new ImageIcon(downURL);
    public static ImageIcon LEFT = new ImageIcon(leftURL);
    public static ImageIcon RIGHT = new ImageIcon(rightURL);

    public static URL bodyUrl = SnakePictureData.class.getResource("./static/body.png");
    public static ImageIcon BODY = new ImageIcon(bodyUrl);
    public static URL foodUrl = SnakePictureData.class.getResource("./static/food.png");
    public static ImageIcon FOOD = new ImageIcon(foodUrl);
}
