package com.javaproject06;

import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        //实现验证码，前四位大写字母或小写字母，最后一位数字
        char[] cArr = new char[52];

        for (int i = 0; i < cArr.length; i++) {
            if (i <= 25) {
                cArr[i] = (char) (97 + i);
            } else {
                cArr[i] = (char) (65 + i - 26);
            }
        }

        Random r = new Random();
        //生成随机数
        int number = r.nextInt(10);

        //定义空字符串
        String yanzhengma = "";

        //字符串拼接
        for (int i = 0; i < 4; i++) {
            //生成随机索引
            int index = r.nextInt(cArr.length);
            yanzhengma = yanzhengma + cArr[index];
        }

        yanzhengma = yanzhengma + number;

        System.out.println(yanzhengma);
    }
}
