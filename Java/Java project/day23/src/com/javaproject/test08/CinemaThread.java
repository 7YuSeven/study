package com.javaproject.test08;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CinemaThread extends Thread {
    static int ticket = 0;

    //创建锁对象
    //static Object lock = new Object();

    //lock锁
    static Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            //同步代码块，锁
//            synchronized (CinemaThread.class) {
            lock.lock();
            try {
                if (ticket == 100) {
                    break;
                } else {
                    ticket++;
                    sleep(10);
                    System.out.println(getName() + "正在卖第"+ ticket + "张票");
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
//            }
        }
    }
}
