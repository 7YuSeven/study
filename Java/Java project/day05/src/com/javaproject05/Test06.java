package com.javaproject05;

public class Test06 {
    public static void main(String[] args) {
        /*
        定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
         */
        int a = 100;
        int b = 20;
        int c = 35;

        System.out.println(getMax(a, b, c));

    }

    public static int getMax(int a, int b, int c){
        int temp = 0;

        temp = a > b ? a : b;
        temp = temp > c ? temp : c;

        return temp;
    }
}
