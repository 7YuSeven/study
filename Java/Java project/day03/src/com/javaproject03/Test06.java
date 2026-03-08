package com.javaproject03;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        //求1-5的和
        int sum = 0;
        for (int i = 1; i <= 5 ; i++) {
            sum = sum + i;
        }

        System.out.println(sum);

        //求1-100的偶数和
        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                sum1 = sum1 + i;
            }
        }
        System.out.println(sum1);

        //统计满足条件的数字
        int sum2 = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个开始的数");
        int start = sc.nextInt();
        
        System.out.println("请输入一个结束的数");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum2 ++;
            }
        }
        System.out.println(sum2);
    }
}
