package com.javaproject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test02 {
    public static void main(String[] args) {
        /*
        有如下文本，请按照要求爬取数据。
            Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长
            期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
         */

        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长" +
                "期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        String regex1 = "Java(?=8|11|17)";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(str);
        while (matcher1.find()) {
            String s = matcher1.group();
            System.out.println(s);
        }

        System.out.println("--------------------------------------------");

        String regex2 = "Java(?:8|11|17)";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(str);
        while (matcher2.find()) {
            String s = matcher2.group();
            System.out.println(s);
        }

        System.out.println("--------------------------------------------");

        String regex3 = "Java(?!8|11|17)";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(str);
        while (matcher3.find()) {
            String s = matcher3.group();
            System.out.println(s);
        }
    }
}
