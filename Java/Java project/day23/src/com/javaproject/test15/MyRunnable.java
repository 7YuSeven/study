package com.javaproject.test15;

import java.util.ArrayList;
import java.util.Collections;

public class MyRunnable implements Runnable {

    ArrayList<Integer> list;

    public MyRunnable(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (list.size() == 0) {
                    break;
                } else {
                    Collections.shuffle(list);
                    Integer remove = list.remove(0);
                    System.out.println(Thread.currentThread().getName() + "产生了一个" + remove + "元大奖");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
