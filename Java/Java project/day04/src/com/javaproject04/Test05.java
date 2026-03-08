package com.javaproject04;

import java.util.Random;

public class Test05 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1,2,3,4,5};

        //生成随机数
        Random r = new Random();

        //打乱数组元素顺序
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(arr.length);

            //交换数据
            int temp = arr[i];
            arr[i] = arr[number];
            arr[number] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
