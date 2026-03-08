package com.javaproject.test10;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Test10 {
    public static void main(String[] args) {
        //阻塞队列实现等待唤醒机制
        //创建阻塞队列对象
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        Cooker cooker = new Cooker(queue);
        Custom custom = new Custom(queue);

        cooker.start();
        custom.start();
    }
}
