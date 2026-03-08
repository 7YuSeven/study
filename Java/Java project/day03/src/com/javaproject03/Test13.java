package com.javaproject03;

import java.util.Random;
import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {

        //生成1-100的随机数
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        //录入数据加猜数
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个数");
            int guessNumber = sc.nextInt();

            if (guessNumber == number) {
                System.out.println("猜中了");
                break;
            } else if (guessNumber > number) {
                System.out.println("大了");
            } else {
                System.out.println("小了");
            }
        }
    }
}
