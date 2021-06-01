package com.yantianpeng.test_game;

import javax.swing.*;
import java.awt.*;

/**
 * 台球小游戏
 */
public class BallGame extends JFrame {
    Image image1 = Toolkit.getDefaultToolkit().getImage("images/1.png");
    Image image0 = Toolkit.getDefaultToolkit().getImage("images/0.png");
    double x =200;//小球x轴
    double y =200;//小球y轴

    boolean right = true;//小球x轴
    boolean left = true;//小球y轴

    double degree = 3.14/3;
    public void  paint(Graphics graphics){
        System.out.println("窗口被画了一次");
        graphics.drawImage(image1,0,0,null);
        graphics.drawImage(image0,(int)x,(int)y,null);

        x=x+10*Math.cos(degree);
        y=y+10*Math.sin(degree);
        //碰到上下边界
        if(y>500||y<10){
            degree =- degree;
        }
        //  碰到左右边界
        if(x>1300||x<50){
            degree=-degree;
        }
    }

    void launhFrame() throws InterruptedException {
        setSize(1000,500);
        setLocation(100,100);
        setVisible(true);
        //实现动画，每秒绘制窗口25次
        while (true){
            repaint();//重复绘制窗口
            Thread.sleep(40);//大约每秒绘制25次。
        }

    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("开始我的小游戏");
        BallGame ballGame= new BallGame();
        ballGame.launhFrame();
    }
}
