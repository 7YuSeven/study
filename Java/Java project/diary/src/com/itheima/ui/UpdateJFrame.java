package com.itheima.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateJFrame extends JFrame implements ActionListener {
    //定义标题输入框
    JTextField titleText  = new JTextField();

    //定义内容的输入区域
    JTextArea contentText = new JTextArea();

    //定义修改按钮
    JButton update = new JButton("修改");

    //定义取消按钮
    JButton cancel = new JButton("取消");

    Object[] tabledatas = null;

    String path = "";

    public UpdateJFrame(Object[] tabledata, String path) {
        this.path = path;
        this.tabledatas = tabledata;
        //初始化界面
        initFrame();

        //初始化组件
        initView();

        //让界面展示出来
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == update){
            System.out.println("修改按钮被点击了");
            String title = titleText.getText();
            String content = contentText.getText();

            if (title.length() == 0 || content.length() == 0) {
                showJDialog("文本内容为空，请重新输入");
                return;
            }

            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(path));
                bw.write("标题: " + title);
                bw.newLine();
                bw.write("正文:");
                bw.newLine();
                bw.write(content);
                bw.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            this.setVisible(false);
            new NoteJFrame();

        }else if(obj == cancel){
            System.out.println("取消按钮被点击了");
            this.setVisible(false);
            new NoteJFrame();
        }
    }

    private void initView() {
        //定义最上面的每日一记
        JLabel title = new JLabel("每日一记");
        title.setBounds(220, 20, 584, 50);
        title.setFont(new Font("宋体", Font.BOLD, 32));
        this.getContentPane().add(title);

        //定义文字：标题
        JLabel subject = new JLabel("标题");
        subject.setBounds(70,90,100,30);
        subject.setFont(new Font("宋体",Font.PLAIN,16));
        this.getContentPane().add(subject);

        //定义文字：内容
        JLabel content = new JLabel("内容");
        content.setBounds(70,140,100,30);
        content.setFont(new Font("宋体",Font.PLAIN,16));
        this.getContentPane().add(content);


        //设置标题的输入框
        titleText.setBounds(120,90,426,30);
        titleText.setFont(new Font("宋体",Font.PLAIN,16));
        this.getContentPane().add(titleText);

        //设置内容的输入框
        contentText.setBounds(120,140,426,300);
        contentText.setFont(new Font("宋体",Font.PLAIN,16));
        this.getContentPane().add(contentText);

        //设置文本内容
        titleText.setText(tabledatas[1].toString());
        contentText.setText(tabledatas[2].toString());

        //设置保存按钮
        update.setBounds(132,466,140,40);
        update.setFont(new Font("宋体",Font.PLAIN,24));
        update.addActionListener(this);
        this.getContentPane().add(update);

        //设置取消按钮
        cancel.setBounds(312,466,140,40);
        cancel.setFont(new Font("宋体",Font.PLAIN,24));
        cancel.addActionListener(this);
        this.getContentPane().add(cancel);

    }


    //对添加界面的一些设置
    private void initFrame() {
        //设置界面的宽高
        this.setSize(600, 600);
        //设置界面的标题
        this.setTitle("每日一记（添加日记）");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
        //设置背景颜色
        this.getContentPane().setBackground(new Color(212,212,212));
    }

    //只创建一个弹框对象
    JDialog jDialog = new JDialog();
    //因为展示弹框的代码，会被运行多次
    //所以，我们把展示弹框的代码，抽取到一个方法中。以后用到的时候，就不需要写了
    //直接调用就可以了。
    //展示弹框
    public void showJDialog(String content) {
        if(!jDialog.isVisible()){
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
    }
}
