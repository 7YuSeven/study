package com.javaproject.test01;

public class Test01 {
    public static void main(String[] args) {
        //第一种线程实现
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.setName("线程1：");
        mt2.setName("线程2：");

        mt1.start();
        mt2.start();
    }
}
