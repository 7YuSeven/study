package com.javatest;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        /*
        2.将数值型式的 RGB 颜色字符串转换为 16 进制格式。输入输出均为字符串。
        如：输入:rgb(255, 255, 255),输出:#ffffff；
        输入:rgb(244, 67, 54),输出:#f44336。
         */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String substring = s.substring(s.indexOf("(") + 1, s.indexOf(")"));

        String[] strs = substring.split(", ");
        int[] colors = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            colors[i] = Integer.parseInt(strs[i]);
        }

        String color = "#";

        char[] chars = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

        for (int i = 0; i < colors.length; i++) {
            int x = colors[i];
            int z = x / 16;
            color = color + chars[z];
            int y = x % 16;
            color = color + chars[y];
        }

        System.out.println(color);
    }
}
