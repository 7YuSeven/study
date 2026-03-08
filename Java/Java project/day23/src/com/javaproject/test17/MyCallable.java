package com.javaproject.test17;

import com.javaproject.test16.MyThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    ArrayList<Integer> list;

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        int max = 0;
        ArrayList<Integer> threadList = new ArrayList<>();
        while (true) {
            synchronized (MyThread.class) {
                if (list.size() == 0) {
                    max = Collections.max(threadList);
                    int sum = 0;
                    for (Integer i : threadList) {
                        sum += i;
                    }

                    String tempList = threadList.toString();
                    System.out.println("在此次抽奖过程中, " + Thread.currentThread().getName() + "总共产生了" + threadList.size() + "个奖项。");
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
        return max;
    }
}
