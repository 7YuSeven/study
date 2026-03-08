package com.javaproject.test06;

public class Test06 {
    public static void main(String[] args) {
        //同步代码块
        CinemaThread ct1 = new CinemaThread();
        CinemaThread ct2 = new CinemaThread();
        CinemaThread ct3 = new CinemaThread();

        ct1.setName("第一台售货机");
        ct2.setName("第二台售货机");
        ct3.setName("第三台售货机");

        ct1.start();
        ct2.start();
        ct3.start();
    }
}
