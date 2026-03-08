package com.javaproject.test03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //第三种线程实现方式
        MyCallable mc = new MyCallable();

        FutureTask<Integer> ft = new FutureTask<>(mc);

        Thread t1 = new Thread(ft);

        t1.start();

        Integer i = ft.get();
        System.out.println(i);
    }
}
