package com.javatest;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        String strs = getStr(str);
//        System.out.println(strs);

        int[] num = {3,1,2,4};
        int n = getNum(num, 5);
        System.out.println(n);
    }

    public static int getNum(int[] a, int n) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 += i;
        }
        for (int i = 0; i < a.length; i++) {
            sum2 += a[i];
        }

        return sum1 - sum2;
    }

    public static String getStr(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }
}
