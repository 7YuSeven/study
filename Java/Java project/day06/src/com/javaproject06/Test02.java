package com.javaproject06;

public class Test02 {
    public static void main(String[] args) {
        //求101 - 200之间的质数
        int count = 0;

        for (int i = 101; i <= 200; i++) {
            boolean bool = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    bool = false;
                }
            }

            if (bool == true) {
                count++;
                System.out.println(i);
            }
        }

        System.out.println("质数个数是" + count);
    }
}
