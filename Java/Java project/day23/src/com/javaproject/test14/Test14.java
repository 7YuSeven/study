package com.javaproject.test14;

public class Test14 {
    public static void main(String[] args) {
        /*
        抢红包也用到了多线程。
        假设：100块，分成了3个包，现在有5个人去抢。
        其中，红包是共享数据。
        5个人是5条线程。
        打印结果如下：
        XXX抢到了XXX元
        XXX抢到了XXX元
        XXX抢到了XXX元
        XXX没抢到
        XXX没抢到
         */

        HongBaoThread t1 = new HongBaoThread();
        HongBaoThread t2 = new HongBaoThread();
        HongBaoThread t3 = new HongBaoThread();
        HongBaoThread t4 = new HongBaoThread();
        HongBaoThread t5 = new HongBaoThread();

        t1.setName("张三");
        t2.setName("李四");
        t3.setName("王五");
        t4.setName("赵六");
        t5.setName("钱七");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
