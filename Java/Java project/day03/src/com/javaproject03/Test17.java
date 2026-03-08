package com.javaproject03;

import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        /*
        需求:
	        从键盘上录入一个大于100的三位数,打印出100到该数字之间满足如下要求的数字,数字的个数,以及数字的和:
		        1.数字的个位数不为7;
		        2.数字的十位数不为5;
		        3.数字的百位数不为3;
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于100的三位数");
        int number = sc.nextInt();

        int count = 0;
        int sum = 0;

        for (int i = 100; i <= number; i++) {
            if ((i % 10 != 7) && (i / 10 % 10 != 5) && (i / 100 != 3)) {
                System.out.println(i);
                count ++;
                sum = sum + i;
            }
        }

        System.out.println("数字的个数为" + count);
        System.out.println("数字的和为" + sum);
    }
}
