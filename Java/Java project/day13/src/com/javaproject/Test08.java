package com.javaproject;

import java.util.Calendar;

public class Test08 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, 10);

        calendar.add(Calendar.MONTH, 1);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        //int week = calendar.get(Calendar.DAY_OF_WEEK);
        String week = getWeek(calendar.get(Calendar.DAY_OF_WEEK));

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(week);

    }

    public static String getWeek(int day) {
        String[] arr = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六",};

        for (int i = 0; i < arr.length; i++) {
            if (day == i){
                return arr[i];
            }
        }

        return null;
    }
}
