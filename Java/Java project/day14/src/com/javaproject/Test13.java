package com.javaproject;

public class Test13 {
    public static void main(String[] args) {
        /*
        可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶
        如果这个楼梯有20个台阶，小明一共有多少种爬法呢?
        运算结果:
        1层台阶 1种爬法
        2层台阶 2种爬法
        7层台阶 21种爬法
         */
        /*
        (20) = (19) + 1
        (20) = (18) + 2
         */

        System.out.println(getSum1(20));
        System.out.println(getSum2(20));
    }

    public static int getSum1(int a){
        if (a == 1){
            return 1;
        } else if (a == 2){
            return 2;
        }

        return getSum1(a - 1) + getSum1(a - 2);
    }

    //        可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶, 有的时候一次爬三个台阶
    //        如果这个楼梯有20个台阶，小明一共有多少种爬法呢?
    public static int getSum2(int a){
        if (a == 1){
            return 1;
        } else if (a == 2){
            return 2;
        } else if (a == 3){
            return 4;
        }

        return getSum2(a - 1) + getSum2(a - 2) + getSum2(a - 3);
    }
}
