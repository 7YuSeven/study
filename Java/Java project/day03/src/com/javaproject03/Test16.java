package com.javaproject03;

public class Test16 {
    public static void main(String[] args) {
        /*
        需求:
	        打印出1到100之间的既是3的倍数又是5倍数的数字以及这些数字的和
         */

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }

        System.out.println("这些数字的和为" + sum);
    }
}
