package com.javaproject;

import java.time.LocalDate;
import java.util.Calendar;

public class Test15 {
    public static void main(String[] args) {
        /*
        判断任意的一个年份是闰年还是平年
            要求:
            JDK8
            JDK7
            两种方式判断
            提示:
            二月有29天是闰年
            一年有366天是闰年
         */

        //JDK7
        Calendar calendar = Calendar.getInstance();
        calendar.set(2002,2,1);
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        //JDK8
        LocalDate localDate = LocalDate.of(2002,3,1);
        LocalDate localDate1 = localDate.minusDays(1);
        int day1 = localDate1.getDayOfMonth();
        System.out.println(day1);

        System.out.println(localDate1.isLeapYear());
    }
}
