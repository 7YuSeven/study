package com.javaproject;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test10 {
    public static void main(String[] args) {
        //获取当前时间的Instant对象
        Instant now = Instant.now();
        System.out.println(now);

        //根据（秒/毫秒/纳秒）获取Instant对象
        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);

        Instant instant3 = Instant.ofEpochSecond(1L, 1000000000L);
        System.out.println(instant3);

        //指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Europe/Berlin"));
        System.out.println(time);

        //isxxx 判断
        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochSecond(1000L);

        boolean result1 = instant4.isBefore(instant5);
        System.out.println(result1);

        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);

        //减少时间系列的方法
        Instant instant6 = Instant.ofEpochMilli(3000L);
        System.out.println(instant6);

        Instant instant7 = instant6.minusSeconds(1);
        System.out.println(instant7);
    }
}
