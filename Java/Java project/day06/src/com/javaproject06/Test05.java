package com.javaproject06;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        /*
        评委打分
            需求:
                在唱歌比赛中，有6名评委给选手打分，分数范围是[0-1001之间的整数。选手的最后得分为:去掉最
                高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
         */
        int[] scoreArr = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scoreArr.length; ) {
            System.out.println("请输入评委分数");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scoreArr[i] = score;
                i++;
            }else {
                System.out.println("分数超出范围，请重新输入");
            }
        }

        int max = getMax(scoreArr);
        int min = getMin(scoreArr);
        int sum = getSum(scoreArr);

        int avg = (sum - max - min) / (scoreArr.length - 2);

        System.out.println("平均分为" + avg);
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getSum(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }
}
