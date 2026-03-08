package com.javaproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test14 {
    public static void main(String[] args) throws ParseException {
        /*
        请使用代码实现计算你活了多少天，用IDK7和IDK8两种方式完成
         */
        String birthday = "2002年06月27日";
        //JDK7
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birthday);
        long time = date.getTime();
        long today = System.currentTimeMillis();

        long day = (today - time) /1000 / 60 / 60 / 24;

        System.out.println(day);

        //JDK8
        LocalDate localDate = LocalDate.of(2002,6,27);
        LocalDate todayDate = LocalDate.now();

        long days = ChronoUnit.DAYS.between(localDate,todayDate);
        System.out.println(days);
    }
}
