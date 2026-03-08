package com.javaproject;

public class Test05 {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {11, 20, 13, 24, 15, 6, 37, 8, 29, 10};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
