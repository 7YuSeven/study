package com.javaproject.test09;

public class Cooker extends Thread {
    //生产者
    @Override
    public void run() {
        //循环
        while (true) {
            //同步代码块
            synchronized (Waiter.lock) {
                //判断食物是否吃完
                if (Waiter.count == 0) {
                    break;
                } else {
                    //判断食物是否存在
                    if (Waiter.foodExists == 1) {
                        //存在则等待
                        try {
                            Waiter.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        //不存在则开始生产
                        System.out.println("生产者正在做食物");
                        //更改食物状态
                        Waiter.foodExists = 1;
                        //唤醒消费者
                        Waiter.lock.notify();
                    }
                }
            }
        }
    }
}
