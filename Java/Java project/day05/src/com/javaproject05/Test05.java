package com.javaproject05;

public class Test05 {
    public static void main(String[] args) {
        /*
        定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
         */
         double a = 3.14;
         double b = 5.2;

         double result = compare(a, b);

        System.out.println(result);
    }

    public static double compare(double a, double b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
}
