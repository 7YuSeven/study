package com.javaproject.test05;

public class Test05 {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt1 = new MyThread();
        MyThread2 mt2 = new MyThread2();

        mt1.setName("MyThread1");
        mt2.setName("MyThread2");
        //守护线程
//        mt2.setDaemon(true);

        //礼让线程
        MyThread mt3 = new MyThread();
        mt3.setName("MyThread3");

        mt1.start();

        //插入线程
        mt1.join();
//        mt2.start();
//        mt3.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main线程: " + i);
        }
    }
}
