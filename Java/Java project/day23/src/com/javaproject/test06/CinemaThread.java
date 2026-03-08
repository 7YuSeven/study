package com.javaproject.test06;

public class CinemaThread extends Thread {
    static int ticket = 0;

    //创建锁对象
    //static Object lock = new Object();
    @Override
    public void run() {
        while (true) {
            //同步代码块，锁
            synchronized (CinemaThread.class) {
                if (ticket == 100) {
                    break;
                } else {
                    ticket++;
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(getName() + "正在卖第"+ ticket + "张票");
                }
            }
        }
    }
}
