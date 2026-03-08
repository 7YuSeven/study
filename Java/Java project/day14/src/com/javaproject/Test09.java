package com.javaproject;

import java.util.Arrays;

public class Test09 {
    public static void main(String[] args) {
        //快速排序
        int[] arr = {11, 20, 13, 24, 15, 6, 37, 8, 29, 10};

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;

        if (start > end) {
            return;
        }

        int number = arr[start];

        while (start != end) {
            while (end > start && arr[end] > number) {
                end --;
            }

            while (start < end && arr[start] < number) {
                start++;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        int temp = arr[start];
        arr[start] = number;
        number = temp;

        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
    }
}
