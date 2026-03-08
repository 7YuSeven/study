package com.javaproject.test09;

public class Custom extends Thread {
    //消费者
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
                    if (Waiter.foodExists == 0) {
                        //没有食物，等待
                        try {
                            Waiter.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        Waiter.count--;
                        System.out.println("消费者还能吃" + Waiter.count +"份食物");
                        //吃完唤醒生产者继续做
                        Waiter.lock.notify();
                        //将食物状态改变
                        Waiter.foodExists = 0;
                    }
                }
            }
        }
    }
}
