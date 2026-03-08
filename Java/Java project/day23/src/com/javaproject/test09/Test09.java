package com.javaproject.test09;

public class Test09 {
    public static void main(String[] args) {
        //等待唤醒机制---生产者和消费者
        Cooker cooker = new Cooker();
        Custom custom = new Custom();

        cooker.setName("生产者");
        custom.setName("消费者");

        cooker.start();
        custom.start();
    }
}
