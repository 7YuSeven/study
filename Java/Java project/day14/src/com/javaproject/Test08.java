package com.javaproject;

public class Test08 {
    public static void main(String[] args) {
        //递归算法
        //求1-100和
        //1-99 + 100

        System.out.println(getSum(100));
        System.out.println(getFactorial(5));

    }

    public static int getSum(int i){
        if(i == 1){
            return 1;
        }

        return i + getSum(i - 1);
    }

    //求5的阶乘
    public static int getFactorial(int n){
        if(n == 1){
            return 1;
        }

        return n * getFactorial(n - 1);
    }
}
