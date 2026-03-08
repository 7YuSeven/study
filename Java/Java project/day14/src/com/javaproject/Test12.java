package com.javaproject;

public class Test12 {
    public static void main(String[] args) {
        /*
        有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个!以后每天猴子都吃当前剩下来的一半，然后
        再多吃一个，第10天的时候(还没吃)，发现只剩下一个桃子了，请问，最初总共多少个桃子?
         */
        /*
        10  1
        9   ((10)+1) * 2
        8   ((9) + 1) * 2
        ...
         */

        System.out.println(getSum(10));
    }

    public static int getSum(int a){
        if (a == 1){
            return 1;
        }

        return (getSum(a - 1) + 1) * 2;
    }
}
