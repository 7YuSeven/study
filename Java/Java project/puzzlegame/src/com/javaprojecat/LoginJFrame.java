package com.javaprojecat;

import cn.hutool.core.io.FileUtil;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class LoginJFrame extends JFrame implements MouseListener{

    //创建一个集合存储正确的用户名和密码
    ArrayList<User> list = new ArrayList<>();

    //添加登录按钮
    JButton login = new JButton();
    //添加注册按钮
    JButton register = new JButton();
    //添加用户名输入框
    JTextField username = new JTextField();
    //添加密码输入框
    JTextField password = new JTextField();
    //添加验证码输入框
    JTextField code = new JTextField();
    //存储正确验证码
    String rightCode;
    //创建空间存储验证码
    JLabel rightCodeLabel = new JLabel();

    public LoginJFrame() {
        //读取本地文件中的数据
        initData();

        //初始化界面
        initJFrame();

        //在这个界面中添加内容
        initView();

        //让当前界面显示出来
        this.setVisible(true);
    }

    //初始化数据
    private void initData() {
        List<String> strList = FileUtil.readLines("D:\\代码\\Java\\Java project\\puzzlegame\\userinfo.txt", "UTF-8");
        for (String s : strList) {
            String[] strs = s.split("&");
            String usernameStr = strs[0].split("=")[1];
            String passwordStr = strs[1].split("=")[1];
            int count = Integer.parseInt(strs[2].split("=")[1]);
            list.add(new User(usernameStr, passwordStr, count));
        }
    }

    public void initView() {
        //1. 添加用户名文字
        JLabel usernameText = new JLabel(new ImageIcon("puzzlegame\\image\\login\\用户名.png"));
        usernameText.setBounds(116, 135, 47, 17);
        this.getContentPane().add(usernameText);

        //2.添加用户名输入框
        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //3.添加密码文字
        JLabel passwordText = new JLabel(new ImageIcon("puzzlegame\\image\\login\\密码.png"));
        passwordText.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passwordText);

        //4.密码输入框
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //验证码提示
        JLabel codeText = new JLabel(new ImageIcon("puzzlegame\\image\\login\\验证码.png"));
        codeText.setBounds(133, 256, 50, 30);
        this.getContentPane().add(codeText);

        //验证码的输入框
        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);

        rightCode = CodeUtil.getCode();
        rightCodeLabel.addMouseListener(this);
        //设置内容
        rightCodeLabel.setText(this.rightCode);
        //位置和宽高
        rightCodeLabel.setBounds(300, 256, 50, 30);
        //添加到界面
        this.getContentPane().add(rightCodeLabel);

        //5.添加登录按钮
        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon("puzzlegame\\image\\login\\登录按钮.png"));
        //去除按钮的默认边框
        login.setBorderPainted(false);
        //去除按钮的默认背景
        login.setContentAreaFilled(false);
        login.addMouseListener(this);
        this.getContentPane().add(login);

        //6.添加注册按钮
        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("puzzlegame\\image\\login\\注册按钮.png"));
        //去除按钮的默认边框
        register.setBorderPainted(false);
        //去除按钮的默认背景
        register.setContentAreaFilled(false);
        register.addMouseListener(this);
        this.getContentPane().add(register);

        //7.添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\login\\background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);
    }


    public void initJFrame() {
        this.setSize(488, 430);//设置宽高
        this.setTitle("拼图游戏 V1.0登录");//设置标题
        this.setDefaultCloseOperation(3);//设置关闭模式
        this.setLocationRelativeTo(null);//居中
        this.setAlwaysOnTop(true);//置顶
        this.setLayout(null);//取消内部默认布局
    }


    //要展示用户名或密码错误
    public void showJDialog(String content) {
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200, 150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);

        //创建Jlabel对象管理文字并添加到弹框当中
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);

        //让弹框展示出来
        jDialog.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == login){
            String getUsername = username.getText();
            String getPassword = password.getText();
            String getCode = code.getText();
            if (getCode.length() == 0){
                showJDialog("验证码不能为空,请重新输入");
                return;
            }

            if (!rightCode.equalsIgnoreCase(getCode)){
                showJDialog("验证码错误,请重新输入");
                return;
            }

            if (getUsername.length() == 0 || getPassword.length() == 0){
                showJDialog("用户名或密码为空,请重新输入");
                return;
            }

            if (getIndex(getUsername) == -1){
                showJDialog("用户名不存在,请先注册");
                return;
            }

            int index = getIndex(getUsername);
            int count = list.get(index).getCount();

            if (!list.get(getIndex(getUsername)).getPassword().equals(getPassword)){
                if (count == 3) {
                    showJDialog("账号已经锁定,请联系管理员解锁");
                } else {
                    count ++;
                    list.get(index).setCount(count);
                    FileUtil.writeLines(list, "D:\\代码\\Java\\Java project\\puzzlegame\\userinfo.txt", "UTF-8");
                    showJDialog("密码错误");
                }
                return;
            }

            showJDialog("登陆成功");
            this.setVisible(false);
            new GameJFrame();
        } else if (e.getSource() == register){
            this.setVisible(false);
            new RegisterJFrame(list);
        } else if (e.getSource() == rightCodeLabel){
            rightCode = CodeUtil.getCode();
            rightCodeLabel.setText(rightCode);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == login){
            login.setIcon(new ImageIcon("puzzlegame\\image\\login\\登录按下.png"));
        } else if (e.getSource() == register){
            register.setIcon(new ImageIcon("puzzlegame\\image\\login\\注册按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == login){
            login.setIcon(new ImageIcon("puzzlegame\\image\\login\\登录按钮.png"));
        } else if (e.getSource() == register){
            register.setIcon(new ImageIcon("puzzlegame\\image\\login\\注册按钮.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    //获取用户名所在索引
    public int getIndex(String username){
        for (int i = 0; i < list.size(); i++) {
            if (username.equals(list.get(i).getName())){
                return i;
            }
        }

        return -1;
    }
}