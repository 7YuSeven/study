package com.javaproject;

import java.util.Arrays;

public class Test11 {
    public static void main(String[] args) {
        /*
        有一个很有名的数学逻辑题叫做不死神兔问题，有一对兔子，从出生后第三个月起每个月都生一对兔子
        小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第十二个月的兔子对数为多少?
         */
        // 1 1 2 3 5 8 .....

        int[] arr = new int[11];
        arr[0] = 1;
        arr[1] = 2;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println(Arrays.toString(arr));

        System.out.println(getSum(12));
    }

    public static int getSum(int a){
        if (a == 1 || a == 2) {
            return 1;
        }

        return getSum(a-1) + getSum(a-2);
    }
}
