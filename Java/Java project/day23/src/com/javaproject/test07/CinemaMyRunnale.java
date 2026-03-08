package com.javaproject.test07;

public class CinemaMyRunnale implements Runnable {
    static int ticket = 0;

    @Override
    public void run() {
        while (true) {
            //同步代码块，锁
            if (method()) break;
        }
    }

    private synchronized static boolean method() {
        if (ticket == 100) {
            return true;
        } else {
            ticket++;
            System.out.println(Thread.currentThread().getName() + "正在卖第"+ ticket + "张票");
        }
        return false;
    }
}
