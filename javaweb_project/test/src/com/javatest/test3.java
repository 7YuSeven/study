package com.javatest;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class test3 {
    public static void main(String[] args) {
        /**
         * 3.给定一个字符串，请去除字符串中重复的字母，使得每个字母只出现一次，需保证返回的结果的字典序最小（要求不能打乱其他字符的相对位置）。
         * 如：输入:bbac,输出:bac；
         * 输入:bacb,输出:acb。
         * 用字符串"yekmaakkccekymbvb"验证该程序。
         */
        String strings = "yekmaakkccekymbvb";

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < strings.length(); i++) {
            set.add(strings.charAt(i));
        }

        System.out.println(set);

    }
}
