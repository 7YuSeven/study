package com.javaproject;

public class Test02 {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for (int i = 10; i < 100; i++) {
            if (judgeTwoNumber(i)) {
                System.out.println(i);
                count1++;
            }
        }
        System.out.println(count1);

        System.out.println("-------------------------------------------");

        for (int i = 100; i < 1000; i++) {
            if (judgeThreeNumber(i)){
                count2++;
                System.out.println(i);
            }
        }

        System.out.println(count2);

        System.out.println("-------------------------------------------");

        for (int i = 1000; i < 10000; i++) {
            if (judgeFourNumber(i)) {
                System.out.println(i);
                count3++;
            }
        }

        System.out.println(count3);

        System.out.println("---------------------------------------------");

        for (int i = 10000; i < 100000; i++) {
            if (judgeFiveNumber(i)) {
                System.out.println(i);
                count4++;
            }
        }

        System.out.println(count4);

    }

    //统计水仙花数
    public static boolean judgeThreeNumber(int num) {
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100;

        if (Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == num) {
            return true;
        }

        return false;
    }

    //统计两位的自幂数
    public static boolean judgeTwoNumber(int num) {
        int ge = num % 10;
        int shi = num / 10;

        if (Math.pow(ge, 2) + Math.pow(shi, 2) == num) {
            return true;
        }

        return false;
    }

    //统计四叶玫瑰数
    public static boolean judgeFourNumber(int num) {
        int ge = num % 10;
        int shi = num / 10 %10;
        int bai = num / 100 % 10;
        int qian = num / 1000;

        if (Math.pow(ge, 4) + Math.pow(shi, 4) + Math.pow(bai, 4) + Math.pow(qian, 4) == num) {
            return true;
        }

        return false;
    }

    //统计五角星数
    public static boolean judgeFiveNumber(int num) {
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        int qian = num / 1000 % 10;
        int wan = num / 10000;

        if (Math.pow(ge, 5) + Math.pow(shi, 5) + Math.pow(bai, 5) + Math.pow(qian, 5) + Math.pow(wan, 5) == num) {
            return true;
        }

        return false;
    }
}
