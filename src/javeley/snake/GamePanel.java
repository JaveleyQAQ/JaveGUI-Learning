package src.javeley.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/**
 * 游戏面板绘制
 */
public class GamePanel extends JPanel  implements KeyListener , ActionListener {

    int length; //蛇的长度
    int[] snakeX = new int[600]; //蛇的X坐标
    int[] snakeY = new int[500];//蛇的Y坐标
    String fx="R";   //判断方向
    boolean isStart = false; //游戏状态

    Timer timer = new Timer(100,this);
    //随机食物坐标
    int foodX,foodY;
    Random rand = new Random();

    public GamePanel() {
        init();
        //获取窗口焦点
        this.setFocusable(true);
        //绑定事件
        this.addKeyListener(this);
        timer.start();

    }


    /**
     * 蛇的初始化
     */
    public void init() {
        length = 3;
        snakeX[0] = 100;
        snakeY[0] = 100;    //蛇头的位置
        snakeX[1] = 75;
        snakeY[1] = 100;    //第一个身体位置
        snakeX[2] = 50;
        snakeY[2] = 100;    //第二个身体位置

        //食物随机分布
        foodX= 25+25*rand.nextInt(34); //850/25
        foodY= 75+25*rand.nextInt(26);  //650/25
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.white);
        //绘制HEADER图片
        SnakePictureData.HEADER.paintIcon(this, g, 25, 11);
        //绘制矩形框
        g.fillRect(25, 75, 850, 600);

        //绘制小蛇🐍
        if (fx.equals("R")) {
            SnakePictureData.RIGHT.paintIcon(this, g, snakeX[0], snakeY[0]);//绘制头


        }else if (fx.equals("L")){
            SnakePictureData.LEFT.paintIcon(this, g, snakeX[0], snakeY[0]);

        }else if (fx.equals("U")){
            SnakePictureData.UP.paintIcon(this, g, snakeX[0], snakeY[0]);

        }else if (fx.equals("D")){
            SnakePictureData.DOWN.paintIcon(this, g, snakeX[0], snakeY[0]);
        }

//         SnakePictureData.BODY.paintIcon(this,g,snakeX[1],snakeY[1]); //绘制身体
//         SnakePictureData.BODY.paintIcon(this,g,snakeX[2],snakeY[2]);
        for (int i = 1; i < length; i++) {
            SnakePictureData.BODY.paintIcon(this,g,snakeX[i],snakeY[i]);
        }

        SnakePictureData.FOOD.paintIcon(this,g,foodX,foodY);

        //游戏状态
        if (!isStart){
            g.setColor(Color.WHITE);
            g.setFont(new Font("黑体-简",Font.BOLD,40));
            g.drawString("按下空格开始游戏",300,300);
        }


    }



    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE){
            isStart = !isStart;  //取相反，这里不能写死为true，不然后面再次按下，就一直都是true了
            repaint(); //重画 刷新一下界面
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            fx ="R";
        }else if (e.getKeyCode() == KeyEvent.VK_LEFT){
            fx ="L";
        }else if (e.getKeyCode() == KeyEvent.VK_UP){
            fx ="U";
        }else if (e.getKeyCode() == KeyEvent.VK_DOWN){
            fx ="D";
        };

    }

    @Override
    public void actionPerformed(ActionEvent e) {


            if (isStart){

                //判断食物是否重合被吃
                if(snakeX[0] == foodX && snakeY[0]==foodY){
                    length++;
                    foodX= 25+25*rand.nextInt(34); //850/25
                    foodY= 75+25*rand.nextInt(26);  //650/25

                }


                //蛇身体移动
                for (int i = length; i > 0; i--) {
                    snakeX[i] = snakeX[i-1];
                    snakeY[i] = snakeY[i-1];
                }


                //判断边界
                if (snakeX[0] > 850){
                    snakeX[0] = 25 ;
                }
                if (fx.equals("R")){
                    snakeX[0]  = snakeX[0]+25; //蛇头X移动+25
                    if (snakeX[0] > 850)
                        snakeX[0] = 25;

                }else if (fx.equals("L")){
                    snakeX[0]  = snakeX[0]-25; //蛇头X移动+25
                    if (snakeX[0] < 25)
                        snakeX[0] = 850;

                }else if (fx.equals("U")){
                    snakeY[0] = snakeY[0]-25;
                    if (snakeY[0]<75)
                        snakeY[0]=650;

                }else if (fx.equals("D")){
                    snakeY[0] = snakeY[0]+25;
                    if (snakeY[0]>650)
                        snakeY[0]=75;
                }

                repaint();//每次修改重新绘画
                timer.start();
            }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void keyTyped(KeyEvent e) {
    }

}
