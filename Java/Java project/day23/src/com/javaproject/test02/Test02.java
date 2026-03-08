package com.javaproject.test02;

public class Test02 {
    public static void main(String[] args) {
        //第二种线程实现，runnable
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
