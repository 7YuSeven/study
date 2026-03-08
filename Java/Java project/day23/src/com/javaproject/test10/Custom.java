package com.javaproject.test10;

import java.util.concurrent.ArrayBlockingQueue;

public class Custom extends Thread {
    //消费者
    ArrayBlockingQueue<String> queue;

    public Custom(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            //消费者吃食物
            try {
                String food = queue.take();
                System.out.println("消费者正在吃" + food);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
