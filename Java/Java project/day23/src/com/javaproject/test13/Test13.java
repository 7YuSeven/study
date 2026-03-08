package com.javaproject.test13;

public class Test13 {
    public static void main(String[] args) {
        /*
        同时开启两个线程，共同获取1-100之间的所有数字。
        要求：将输出所有的奇数。
         */

        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.setName("线程1");
        mt2.setName("线程2");

        mt1.start();
        mt2.start();
    }
}
