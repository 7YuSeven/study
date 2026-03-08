package com.javaproject;

import java.util.Arrays;

public class Test06 {
    public static void main(String[] args) {
        //选择排序
        int[] arr = {11, 20, 13, 24, 15, 6, 37, 8, 29, 10};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
