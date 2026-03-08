package com.javaproject;

import java.util.Date;

public class Test06 {
    public static void main(String[] args) {
        /*
        需求1:打印时间原点开始一年之后的时间
        需求2:定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
         */
        Date date1 = new Date();
        date1.setTime(1000L * 60 * 60 *24 * 365);
        System.out.println(date1);

        Date date2 = new Date();

        if (date2.getTime() > date1.getTime()) {
            System.out.println("1在前");
        } else {
            System.out.println("2在前");
        }
    }
}
