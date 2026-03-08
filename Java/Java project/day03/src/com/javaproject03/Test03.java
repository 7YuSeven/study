package com.javaproject03;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {

        int money = 1000;

        //1.录入会员级别
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员等级");
        int grade = sc.nextInt();

        if (grade == 1) {
            System.out.println("价格为" + money * 0.9);
        } else if (grade == 2) {
            System.out.println("价格为" + money * 0.8);
        } else if (grade == 3) {
            System.out.println("价格为" + money * 0.7);
        } else {
            System.out.println("价格为" + money);
        }

    }
}
