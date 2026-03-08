package com.javaproject06;

import java.util.Random;
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        /*
        双色球系统
            投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1-33中选择;蓝色球号码从1-16中选择。
         */
        //获取中奖号码
        int[] awardNumber = new int[7];
        awardNumber = getAwardNumber();

        //获取用户的号码
        int[] customNumber = new int[7];
        customNumber = getCustomNumber();

        //判断中奖情况
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < awardNumber.length - 1; i++) {
            for (int j = 0; j < customNumber.length - 1; j++) {
                if (customNumber[j] == awardNumber[i]) {
                    redCount++;
                    break;
                }
            }
        }

        if (awardNumber[awardNumber.length - 1] == customNumber[customNumber.length - 1]) {
            blueCount++;
        }

        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你，中了一等奖1000万元");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你，中了二等奖500万元");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你，中了三等奖3000元");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜你，中了四等奖200元");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜你，中了五等奖10元");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜你，中了六等奖5元");
        } else {
            System.out.println("谢谢惠顾");
        }
    }

    private static int[] getAwardNumber() {
        //获取中奖号码
        int[] awardNumber = new int[7];
        Random r = new Random();

        for (int i = 0; i < awardNumber.length - 1; ) {
            int redNumber = r.nextInt(33) + 1;
            if (contains(awardNumber, redNumber)) {
                awardNumber[i] = redNumber;
                i++;
            }
        }

        awardNumber[awardNumber.length - 1] = r.nextInt(16) + 1;

        System.out.println("-------------------------------------------------");
        for (int i = 0; i < awardNumber.length; i++) {
            System.out.print(awardNumber[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
        return awardNumber;
    }

    public static int[] getCustomNumber() {
        //获取红球号码
        int[] customNumber = new int[7];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < customNumber.length - 1; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();

            if (redNumber >= 1 && redNumber <= 33) {
                if (contains(customNumber, redNumber)) {
                    customNumber[i] = redNumber;
                    i++;
                } else {
                    System.out.println("输入的红球号码不能重复，请重新输入");
                }
            } else {
                System.out.println("输入的红球号码超出范围，请重新输入1-33之间的号码");
            }
        }

        //获取蓝球号码
        System.out.println("请输入蓝球号码（1-16）");
        int blueNumber = sc.nextInt();
        while (blueNumber < 1 || blueNumber > 16) {
            System.out.println("蓝球号码超出范围，请重新输入");
            blueNumber = sc.nextInt();
        }
        customNumber[customNumber.length - 1] = blueNumber;

//        for (int i = 0; i < customNumber.length; i++) {
//            System.out.print(customNumber[i] + " ");
//        }

        return customNumber;
    }

    //判断数据是否重复
    public static boolean contains(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return false;
            }
        }
        return true;
    }
}
