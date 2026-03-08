package com.javaproject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test03 {
    public static void main(String[] args) {
        String str = "abbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaa";

        String regex1 = "ab+";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(str);
        while (matcher1.find()) {
            String s = matcher1.group();
            System.out.println(s);
        }

        String regex2 = "ab+?";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(str);
        while (matcher2.find()) {
            String s = matcher2.group();
            System.out.println(s);
        }
    }
}
