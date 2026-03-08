package com.javaprojecat;

import cn.hutool.core.io.IoUtil;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.util.Properties;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //定义一维数组存储图片的序号，用于打乱
    int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    //定义二维数组存储打乱的图片序号
    int[][] pictureArr = new int[4][4];
    //记录空白图片位置
    int x = 0, y = 0;
    int[][] rightArr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    //保存路径
    String path = "puzzlegame\\image\\animal\\animal3\\";
    //定义变量记录移动的次数
    int count = 0;


    public GameJFrame() {
        //初始化主界面
        initFrame();

        //制作菜单
        initMenu();

        //打乱图片
        getMessArr();

        //添加图片
        initImage();

        //显示主界面
        this.setVisible(true);
    }

    private void initImage() {
        //清空已出现的图片
        this.getContentPane().removeAll();
        //判断是否拼完
        if (win()){
            JLabel label = new JLabel(new ImageIcon("puzzlegame\\image\\win.png"));
            label.setBounds(203,283,197,73);
            this.getContentPane().add(label);
        }
        //显示移动了多少次
        JLabel stepLabel = new JLabel("步数： " + count);
        stepLabel.setBounds(50,30,100,20);
        this.getContentPane().add(stepLabel);
        //显示图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //创建对象
                ImageIcon imageIcon = new ImageIcon(path + pictureArr[i][j] + ".jpg");
                //给予容器
                JLabel imageLabel = new JLabel(imageIcon);
                //设置坐标大小
                imageLabel.setBounds((105 * j + 83),(105 * i + 134),105,105);
                //给图片添加边框
                imageLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //容器添加到界面
                this.getContentPane().add(imageLabel);
            }
        }

        //加载背景图片
        ImageIcon imageIcon = new ImageIcon("puzzlegame\\image\\background.png");
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(40,40,508,560);
        this.getContentPane().add(imageLabel);

        //刷新界面
        this.getContentPane().repaint();
    }

    //子菜单
    JMenuItem restart = new JMenuItem("重新开始");
    JMenuItem relogin = new JMenuItem("重新登录");
    JMenuItem closeGame = new JMenuItem("关闭游戏");
    JMenuItem account = new JMenuItem("公众号");

    //更换图片子功能
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem girl = new JMenuItem("美女");
    JMenuItem sport = new JMenuItem("运动");

    JMenu saveJMenu = new JMenu("存档");
    JMenu loadJMenu = new JMenu("读档");

    JMenuItem saveItem0 = new JMenuItem("存档0(空)");
    JMenuItem saveItem1 = new JMenuItem("存档1(空)");
    JMenuItem saveItem2 = new JMenuItem("存档2(空)");
    JMenuItem saveItem3 = new JMenuItem("存档3(空)");
    JMenuItem saveItem4 = new JMenuItem("存档4(空)");

    JMenuItem loadItem0 = new JMenuItem("读档0(空)");
    JMenuItem loadItem1 = new JMenuItem("读档1(空)");
    JMenuItem loadItem2 = new JMenuItem("读档2(空)");
    JMenuItem loadItem3 = new JMenuItem("读档3(空)");
    JMenuItem loadItem4 = new JMenuItem("读档4(空)");


    //初始化菜单
    private void initMenu() {
        JMenuBar menuBar = new JMenuBar();
        //设置大小
        menuBar.setSize(514,20);
        //新建菜单项
        JMenu functionMenu = new JMenu("功能");
        JMenu aboutMenu = new JMenu("关于我们");

        menuBar.add(functionMenu);
        menuBar.add(aboutMenu);

        //把5个存档，添加到saveJMenu中
        saveJMenu.add(saveItem0);
        saveJMenu.add(saveItem1);
        saveJMenu.add(saveItem2);
        saveJMenu.add(saveItem3);
        saveJMenu.add(saveItem4);

        //把5个读档，添加到loadJMenu中
        loadJMenu.add(loadItem0);
        loadJMenu.add(loadItem1);
        loadJMenu.add(loadItem2);
        loadJMenu.add(loadItem3);
        loadJMenu.add(loadItem4);

        //新建子菜单功能
        JMenu changePiture = new JMenu("更换图片");

        //添加子功能
        functionMenu.add(changePiture);
        functionMenu.add(restart);
        functionMenu.add(relogin);
        functionMenu.add(closeGame);
        functionMenu.add(saveJMenu);
        functionMenu.add(loadJMenu);
        aboutMenu.add(account);

        changePiture.add(animal);
        changePiture.add(girl);
        changePiture.add(sport);

        //给菜单添加事件
        restart.addActionListener(this);
        relogin.addActionListener(this);
        closeGame.addActionListener(this);
        account.addActionListener(this);
        animal.addActionListener(this);
        girl.addActionListener(this);
        sport.addActionListener(this);
        saveItem0.addActionListener(this);
        saveItem1.addActionListener(this);
        saveItem2.addActionListener(this);
        saveItem3.addActionListener(this);
        saveItem4.addActionListener(this);
        loadItem0.addActionListener(this);
        loadItem1.addActionListener(this);
        loadItem2.addActionListener(this);
        loadItem3.addActionListener(this);
        loadItem4.addActionListener(this);

        reviseItem();

        //在界面中添加菜单
        this.setJMenuBar(menuBar);
    }

    //获取文件中的存档信息，改变菜单中读档和存档的内容
    public void reviseItem(){
        File file = new File("D:\\代码\\Java\\Java project\\puzzlegame\\save");
        File[] files = file.listFiles();

        for (File f : files) {
            String fileName = f.getName();
            int index = fileName.charAt(4) - '0';

            GameData gd = null;
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
                gd = (GameData) ois.readObject();
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            int step = gd.getStep();

            saveJMenu.getItem(index).setText("存档" + index + "(" + step + "步)");
            loadJMenu.getItem(index).setText("读档" + index + "(" + step + "步)");
        }
    }

    //初始化主界面
    private void initFrame() {
        //设置窗口大小
        this.setSize(603, 680);
        //居中显示
        this.setLocationRelativeTo(null);
        //主界面置顶
        this.setAlwaysOnTop(true);
        //关闭主界面代码停止
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置标题
        this.setTitle("拼图游戏单机版 v1.0");
        //取消默认的居中放置
        this.setLayout(null);
        //给整个界面增加监听事件
        this.addKeyListener(this);
    }

    //打乱数组
    public void getMessArr(){
        Random r = new Random();

        //打乱一维数组
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        //将一维数组赋值给二维数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            pictureArr[i / 4][i % 4] = arr[i];
        }

//        int num = 0;
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                pictureArr[i][j] = arr[num];
//                num++;
//            }
//        }
    }

    //键入键时调用
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下时调用
    @Override
    public void keyPressed(KeyEvent e) {
        if(win()){
            return;
        }
        if (e.getKeyCode() == 65) {
            //清空图片
            this.getContentPane().removeAll();
            //创建正确图片的对象
            ImageIcon imageIconall = new ImageIcon(path + "all.jpg");
            JLabel imageLabelall = new JLabel(imageIconall);
            imageLabelall.setBounds(83,134,420,420);
            this.getContentPane().add(imageLabelall);
            //添加背景图片
            ImageIcon imageIconbg = new ImageIcon("puzzlegame\\image\\background.png");
            JLabel imageLabelbg = new JLabel(imageIconbg);
            imageLabelbg.setBounds(40,40,508,560);
            this.getContentPane().add(imageLabelbg);
            //刷新图片
            this.getContentPane().repaint();
        }
    }

    //松开按键时调用
    @Override
    public void keyReleased(KeyEvent e) {
        //判断图片是否拼完
        if (win()){
            return;
        }
        //对上下左右进行判断
        //左：37 上：38 右：39 下：40
        if (e.getKeyCode() == 37) {
            //判断是否超出二维数组范围
            if (y + 1 >= 4) {
                return;
            }
            //向左移动，交换两个值
            int temp = pictureArr[x][y];
            pictureArr[x][y] = pictureArr[x][y + 1];
            pictureArr[x][y + 1] = temp;

            //重新赋值空图片的位置
            y = y + 1;
            count++;
            //加载图片
            initImage();
        } else if (e.getKeyCode() == 38) {
            //判断是否超出二维数组范围
            if (x + 1 >= 4) {
                return;
            }
            //向上移动，交换两个值
            int temp = pictureArr[x][y];
            pictureArr[x][y] = pictureArr[x + 1][y];
            pictureArr[x + 1][y] = temp;

            //重新赋值空图片的位置
            x = x + 1;
            count++;
            //加载图片
            initImage();
        } else if (e.getKeyCode() == 39) {
            //判断是否超出二维数组范围
            if (y - 1 < 0) {
                return;
            }
            //向右移动，交换两个值
            int temp = pictureArr[x][y];
            pictureArr[x][y] = pictureArr[x][y - 1];
            pictureArr[x][y - 1] = temp;

            //重新赋值空图片的位置
            y = y - 1;
            count++;
            //加载图片
            initImage();
        } else if (e.getKeyCode() == 40) {
            //判断是否超出二维数组范围
            if (x - 1 < 0) {
                return;
            }
            //向下移动，交换两个值
            int temp = pictureArr[x][y];
            pictureArr[x][y] = pictureArr[x - 1][y];
            pictureArr[x - 1][y] = temp;

            //重新赋值空图片的位置
            x = x - 1;
            count++;
            //加载图片
            initImage();
        } else if (e.getKeyCode() == 65) {
            initImage();
        } else if (e.getKeyCode() == 87) {
            //按下W直接拼完图片
            pictureArr = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };

            initImage();
        }
    }

    //判断是否获得胜利
    public boolean win(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (pictureArr[i][j] != rightArr[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    //按键事件
    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前点击的条目对象
        Object source = e.getSource();

        if (source == restart){//重新开始
            count = 0;
            getMessArr();
            initImage();
        } else if (source == relogin){//返回登录页面
            this.setVisible(false);
            new LoginJFrame();
        } else if (source == closeGame){//关闭页面
            System.exit(0);
        } else if (source == account){//关注公众号
            Properties prop = new Properties();
            try {
                FileInputStream fis = new FileInputStream("puzzlegame\\about.properties");
                prop.load(fis);
                fis.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            String newPath = (String) prop.get("account");
            //创建对话框对象
            JDialog jd = new JDialog();
            //创建并显示公众号i图片
            JLabel label = new JLabel(new ImageIcon(newPath));
            label.setBounds(0,0,258,258);
            jd.getContentPane().add(label);
            //设置对话框大小
            jd.setSize(344,344);
            //设置置顶
            jd.setAlwaysOnTop(true);
            //设置居中
            jd.setLocationRelativeTo(null);
            //不关闭对话框无法操作其他内容
            jd.setModal(true);
            //显示对话框
            jd.setVisible(true);
        } else if (source == animal){//更换动物类型图片
            Random r = new Random();
            int num = r.nextInt(8) + 1;
            path = "puzzlegame\\image\\animal\\animal" + num + "\\";
            getMessArr();
            count = 0;
            initImage();
        } else if (source == girl){//更换美女图片
            Random r = new Random();
            int num = r.nextInt(13) + 1;
            path = "puzzlegame\\image\\girl\\girl" + num + "\\";
            getMessArr();
            count = 0;
            initImage();
        } else if (source == sport){//更换运动图片
            Random r = new Random();
            int num = r.nextInt(10) + 1;
            path = "puzzlegame\\image\\sport\\sport" + num + "\\";
            getMessArr();
            count = 0;
            initImage();
        } else if(source == saveItem0 || source == saveItem1 || source == saveItem2 || source == saveItem3 ||source == saveItem4){
            JMenuItem item = (JMenuItem) source;
            String text = item.getText();
            int index = text.charAt(2) - '0';

            GameData gd = new GameData(pictureArr, path, x, y, count);
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("puzzlegame\\save\\save" + index + ".data"));
//                oos.writeObject(gd);
//                oos.close();
                IoUtil.writeObj(oos, true, gd);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            item.setText("存档" + index + "(" + count + "步)");

            loadJMenu.getItem(index).setText("读档" + index + "(" + count + "步)");
        }else if(source == loadItem0 || source == loadItem1 || source == loadItem2 || source == loadItem3 ||source == loadItem4) {
            JMenuItem item = (JMenuItem) source;
            String text = item.getText();
            int index = text.charAt(2) - '0';

            GameData gd = null;
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("puzzlegame\\save\\save" + index + ".data"));
                gd = (GameData) ois.readObject();
                ois.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }

            pictureArr = gd.getData();
            path = gd.getPath();
            x = gd.getX();
            y = gd.getY();
            count = gd.getStep();

            initImage();
        }
    }
}
