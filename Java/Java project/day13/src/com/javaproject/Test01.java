package com.javaproject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {
    public static void main(String[] args) {
        /*
        有如下文本，该请按照要求爬取数据。
            Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是ava8和lava11因为这
            两个是长期支持版本，下一个长期支持版本是]ava17，相信在未来不久|ava17也会逐渐登上历史舞台
                要求:找出里面所有的JavaXX
         */
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11因为这" +
                "两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        System.out.println(str);
        Pattern pattern = Pattern.compile("Java\\d{0,2}");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            String s = matcher.group();
            System.out.println(s);
        }

    }
}
