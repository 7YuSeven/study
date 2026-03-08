package com.javaproject03;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();

        //表示质数
        boolean bool = true;

        for (int i = 2; i < number; i++) {
            if (number % i ==0){
                bool = false;
            }
        }

        if (bool) {
            System.out.println("这个数是质数");
        }else {
            System.out.println("这个数不是质数");
        }
    }
}
