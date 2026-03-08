package com.javaproject.test12;

public class MyRunnable implements Runnable {
    int count = 100;

    @Override
    public void run() {
        //循环
        while (true) {
            //同步代码块
            synchronized (this) {
                //判断循环结束
                if (count < 10) {
                    break;
                } else {
                    count --;
                    System.out.println(Thread.currentThread().getName() + "送出了一份礼品, 还剩" + count + "份礼品");
                }
            }
        }
    }
}
