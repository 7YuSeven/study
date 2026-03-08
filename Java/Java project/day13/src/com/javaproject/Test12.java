package com.javaproject;

public class Test12 {
    public static void main(String[] args) {
        /*
        自己实现parselnt方法的效果，将字符串形式的数据转成整数。
        要求:
            字符串中只能是数字不能有其他字符
            最少一位，最多10位
            0不能开头
         */

        String str = "123456789";
        int number = 0;

        if (str.matches("[1-9]\\d{0,9}")){
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                int num = c - '0';
                number = number * 10 + num;
            }
        } else {
            System.out.println("字符串不合法");
        }

        System.out.println(number);
    }
}
