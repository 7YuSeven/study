package com.testpackage;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        /*
        需求:
	    定义一个int类型的变量,初始化值为1234,求这个数的个位,十位,百位,千位分别是多少?
        运行效果:
	    1234的个位是4,十位是3,百位是2,千位是1
         */

        //int number = 1234;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位数：");
        int number = sc.nextInt();

        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        int qian = number / 1000;

        System.out.println(number + "的个位是" + ge + "," +
                                    "十位是" + shi + "," +
                                    "百位是" + bai + "," +
                                    "千位是" + qian);
    }
}
