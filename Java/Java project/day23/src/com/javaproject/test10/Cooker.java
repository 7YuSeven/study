package com.javaproject.test10;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker extends Thread {
    //生产者
    ArrayBlockingQueue<String> queue;

    public Cooker(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        //循环
        while (true) {
            //生产食物
            try {
                queue.put("食物");
                System.out.println("生产者做了一份食物");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
