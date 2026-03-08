package com.javaproject.test13;

public class MyThread extends Thread {

    static int i = 1;

    @Override
    public void run() {
        for (; i <= 100; i++) {
            synchronized (MyThread.class) {
                if (i % 2 == 1) {
                    System.out.println(getName() + ": " + i);
                }
            }
            if (i == 100) {
                break;
            }
        }
    }
}
