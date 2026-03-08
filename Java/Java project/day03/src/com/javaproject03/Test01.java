package com.javaproject03;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电影票序号：");
        int ticket = sc.nextInt();

        if (ticket >= 1 && ticket <= 100){
            if (ticket % 2 == 0) {
                System.out.println("坐右边");
            } else {
                System.out.println("坐左边");
            }
        }
    }
}
