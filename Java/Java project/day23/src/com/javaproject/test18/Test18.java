package com.javaproject.test18;

import java.util.concurrent.*;

public class Test18 {
    public static void main(String[] args) {
        //线程池
        //ExecutorService pool1 = Executors.newCachedThreadPool();
//        ExecutorService pool1 = Executors.newFixedThreadPool(3);
//
//        pool1.submit(new MyThread());
//        pool1.submit(new MyThread());
//        pool1.submit(new MyThread());
//        pool1.submit(new MyThread());
//        pool1.submit(new MyThread());
//        pool1.submit(new MyThread());
//
//        pool1.shutdown();

        //自定义线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,              //核心线程数量
                6,                          //最大线程数量
                60,                         //空闲线程最大存活时间
                TimeUnit.SECONDS,           //时间单位
                new ArrayBlockingQueue<>(3),  //任务队列
                Executors.defaultThreadFactory(),     //创建线程工厂
                new ThreadPoolExecutor.AbortPolicy()  //任务的拒绝策略
        );

        //java虚拟机返回可用处理器数量
        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);
    }
}
