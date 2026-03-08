package com.javaproject03;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        /*
        需求:
	    让用户依次录入三个整数，求出三个数中的最大值，并打印到控制台。【使用if】
	     */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int number2 = sc.nextInt();
        System.out.println("请输入第三个数");
        int number3 = sc.nextInt();

        int max = number1;

        if (number2 > number1) {
            max = number2;
        }

        if (max < number3) {
            max = number3;
        }

        System.out.println("最大的数为" + max);
    }
}
