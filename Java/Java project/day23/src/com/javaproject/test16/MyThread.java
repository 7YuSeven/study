package com.javaproject.test16;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {
    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        ArrayList<Integer> threadList = new ArrayList<>();
        while (true) {
            synchronized (MyThread.class) {
                if (list.size() == 0) {
                    int max = Collections.max(threadList);
                    int sum = 0;
                    for (Integer i : threadList) {
                        sum += i;
                    }

                    String tempList = threadList.toString();
                    System.out.println("在此次抽奖过程中, " + getName() + "总共产生了" + threadList.size() + "个奖项。");
                    System.out.println("分别为：" + tempList.substring(1, tempList.length() - 1) + "最高奖项为" + max + "元，总计额为" + sum + "元" );
                    break;
                } else {
                    Collections.shuffle(list);
                    Integer remove = list.remove(0);
                    threadList.add(remove);
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
