package com.testpackage;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        /*
        某外卖商家的菜品单价如下:
        1.鱼香肉丝每份24元,油炸花生米每份8元,米饭每份3元。
        2.优惠方式:
        总金额大于100元,总金额打9折,其它无折扣
        3.需求:
        小明购买了3分鱼香肉丝,3份花生米,5份米饭,最终需要付多少钱?
         */

        int fish = 24;
        int peanut = 8;
        int mile = 3;

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入买了几份鱼香肉丝：");
        int number1 = sc.nextInt();

        System.out.println("请输入买了几份油炸花生米：");
        int number2 = sc.nextInt();

        System.out.println("请输入买了几份米饭：");
        int number3 = sc.nextInt();

        int money = (number1 * fish + number2 * peanut + number3 * mile);
        System.out.println(money > 100 ? money * 0.9 : money);
    }
}
