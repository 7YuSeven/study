package com.javaproject04;

import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = new int[10];

        //获取随机数并存入数组
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("\n" + sum);

        //求平均数
        int avg = sum / arr.length;
        System.out.println(avg);

        //统计小于平均数的个数
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg){
                count ++;
            }
        }

        System.out.println(count);
    }
}
