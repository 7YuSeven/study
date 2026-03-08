package com.javaproject.test04;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //让线程休眠指定的时间，单位为毫秒
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName() + ": " + i);
        }
    }
}
