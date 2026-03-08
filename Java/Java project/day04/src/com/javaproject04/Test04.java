package com.javaproject04;

public class Test04 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1,2,3,4,5};

        //遍历数组，交换元素
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
