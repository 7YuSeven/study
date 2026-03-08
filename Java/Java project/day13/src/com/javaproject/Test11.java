package com.javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        /*
        键盘录入
            键盘录入一些1~100之间的整数，并添加到集合中
            直到集合中所有数据和超过200为止。
         */

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int sum = 0;

        while (true){
            String str = sc.nextLine();
            int num = Integer.parseInt(str);

            if (num < 1 || num > 100) {
                System.out.println("请重新输入");
                continue;
            }

            list.add(num);

            sum = sum + num;

            if (sum > 200) {
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(sum);
    }
}
