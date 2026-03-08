package com.javaproject.test09;

public class Waiter {
    //控制生产者和消费者执行
    //是否有食物
    public static int foodExists = 0;
    //食物总数
    public static int count = 10;
    //锁对象
    public static Object lock = new Object();
}
