package com.javaproject.test11;

public class MyThread extends Thread {
    static int ticket = 1000;

    @Override
    public void run() {
        //循环
        while (true) {
            //同步代码块
            synchronized (MyThread.class) {
                //判断循环结束
                if (ticket == 0) {
                    break;
                } else {
                    ticket--;
                    System.out.println(getName() + "售出了1张票, 还剩" + ticket + "张票");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
