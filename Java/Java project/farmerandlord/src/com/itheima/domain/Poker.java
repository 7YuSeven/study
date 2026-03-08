package com.itheima.domain;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Poker extends JLabel implements MouseListener {
    //各个牌所对应的图片名
    private String name;
    //判断牌是正面还是反面，自己的是正面，别人的都是反面
    private boolean up;
    //判断牌是否能被点击，自己的可以点，别的都不能点
    private boolean canclicked = false;
    //判牌断是否是点击状态
    private boolean clicked = false;

    public Poker(String name, boolean up) {
        this.name = name;
        this.up = up;

        if (this.up) {
            //正面
            showFront();
        } else {
            //反面
            showBack();
        }

        //设置高度
        this.setSize(71,96);
        //设置可见
        this.setVisible(true);
        //给每张牌设置监听
        this.addMouseListener(this);
    }

    //显示正面
    public void showFront(){
        this.setIcon(new ImageIcon("farmerandlord\\image\\poker\\" + this.getName() + ".png"));
        this.up = true;
    }

    //显示反面
    public void showBack(){
        this.setIcon(new ImageIcon("farmerandlord\\image\\poker\\rear.png"));
        this.up = false;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        //点击牌
        if (canclicked) {
            int step = 0;
            if (clicked) {
                //已经点击
                step = 20;
            } else {
                //未点击
                step = -20;
            }
            //改变当前点击的状态
            clicked = !clicked;
            //记录当前牌的位置
            Point from = this.getLocation();
            //将牌的位置改变
            Point to = new Point(from.x, from.y + step);
            this.setLocation(to);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return up
     */
    public boolean isUp() {
        return up;
    }

    /**
     * 设置
     * @param up
     */
    public void setUp(boolean up) {
        this.up = up;
    }

    /**
     * 获取
     * @return canclicked
     */
    public boolean isCanclicked() {
        return canclicked;
    }

    /**
     * 设置
     * @param canclicked
     */
    public void setCanclicked(boolean canclicked) {
        this.canclicked = canclicked;
    }

    /**
     * 获取
     * @return clicked
     */
    public boolean isClicked() {
        return clicked;
    }

    /**
     * 设置
     * @param clicked
     */
    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public String toString() {
        return "Poker{name = " + name + ", up = " + up + ", canclicked = " + canclicked + ", clicked = " + clicked + "}";
    }

    //自己练习
}
