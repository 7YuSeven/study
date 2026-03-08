package com.javaproject;

public class Test13 {
    public static void main(String[] args) {
        /*
        定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
         */

        int number = 123;

        StringBuilder sb = new StringBuilder();


        while (number != 0){
            int remainder = number % 2;
            sb.insert(0, remainder);
            number = number / 2;
        }

        System.out.println(sb.toString());
    }
}
