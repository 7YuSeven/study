package com.javaproject03;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        //求平方根
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i * i == x) {
                System.out.println(i + "是这个数的平方根");
                break;
            } else if (i * i > x) {
                System.out.println((i - 1) + "是这个数的平方根");
                break;
            }
        }
    }
}
