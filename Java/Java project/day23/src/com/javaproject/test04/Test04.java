package com.javaproject.test04;

public class Test04 {
    public static void main(String[] args) throws InterruptedException {
        //常用方法
        MyThread mt = new MyThread();
        //设置线程名称
        mt.setName("MyThread");
        //获取线程名称
        String name = mt.getName();
        System.out.println(name);
        //获取当前线程对象
        Thread thread = mt.currentThread();
        String s = thread.getName();
        System.out.println(s);
        //让线程休眠指定的时间，单位为毫秒
        thread.sleep(1000);
        System.out.println("111111111");
        //获取线程优先级
        MyThread mt2 = new MyThread();
        mt2.setName("MyThread2");

        System.out.println(mt.getPriority());
        System.out.println(mt2.getPriority());

        //设置线程优先级
        mt.setPriority(10);
        mt2.setPriority(1);

        mt.start();
        mt2.start();
    }
}
