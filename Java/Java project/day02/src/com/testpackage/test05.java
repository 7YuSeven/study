package com.testpackage;

import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        /*
        需求:
	    一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，
        请开发程序，可以通过键盘输入这三个和尚的身高，并计算出出这三个和尚的最高身高。
         */

        //int person1 = 150;
        //int person2 = 210;
        //int person3 = 165;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个和尚的身高：");
        int person1 = sc.nextInt();

        System.out.println("请输入第二个和尚的身高：");
        int person2 = sc.nextInt();

        System.out.println("请输入第三个和尚的身高：");
        int person3 = sc.nextInt();

        int temp = person1 > person2 ? person1 : person2;
        int max = temp > person3 ? temp : person3;

        System.out.println(max);
    }
}
