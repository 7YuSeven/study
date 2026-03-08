package com.javaproject03;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数");
        int score = sc.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 95 && score <= 100){
                System.out.println("自行车");
            } else if (score >= 90 && score <= 94) {
                System.out.println("游乐场");
            } else if (score >= 80 && score <= 89) {
                System.out.println("变形金刚");
            } else {
                System.out.println("挨打");
            }
        } else {
            System.out.println("成绩不合理");
        }
    }
}
