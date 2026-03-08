package com.javaproject;

public class Test01 {
    public static void main(String[] args) {
        int sum = getSum(0,1,2,3,4,5,6,7,8,9,4);
        System.out.println(sum);
    }

    //可变参数
    public static int getSum(int... a){
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        return sum;
    }
}
