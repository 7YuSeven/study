package com.javaproject;

import java.util.Arrays;

public class Test07 {
    public static void main(String[] args) {
        //插入排序
        int[] arr = {11, 20, 13, 24, 15, 6, 37, 8, 29, 10};

        int start = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                start = i;
                break;
            }
        }

        for (int i = start; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
