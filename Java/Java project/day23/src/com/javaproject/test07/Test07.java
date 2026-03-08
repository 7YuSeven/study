package com.javaproject.test07;

public class Test07 {
    public static void main(String[] args) {
        //同步代码块
        CinemaMyRunnale cmr = new CinemaMyRunnale();

        Thread t1 = new Thread(cmr);
        Thread t2 = new Thread(cmr);
        Thread t3 = new Thread(cmr);

        t1.setName("第一台售货机");
        t2.setName("第二台售货机");
        t3.setName("第三台售货机");

        t1.start();
        t2.start();
        t3.start();
    }
}
