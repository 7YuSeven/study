package com.javaproject03;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电话按键");
        int number = sc.nextInt();

        switch (number){
            case 1 -> System.out.println("机票查询");
//                System.out.println("机票查询");
//                break;
            case 2 -> System.out.println("机票预定");
//                System.out.println("机票预定");
//                break;
            case 3 -> System.out.println("机票改签");
//                System.out.println("机票改签");
//                break;
//            case 4 :
//                System.out.println("推出服务");
//                break;
            default -> System.out.println("退出服务");
//                System.out.println("退出服务");
//                break;
        }

    }
}
