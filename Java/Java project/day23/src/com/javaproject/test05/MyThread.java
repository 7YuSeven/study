package com.javaproject.test05;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            //让线程休眠指定的时间，单位为毫秒
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName() + ": " + i);
            //礼让线程
            Thread.yield();
        }
    }
}
