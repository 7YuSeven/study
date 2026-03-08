package com.javaproject03;

public class Test08 {
    public static void main(String[] args) {
        int x = 121;

        int temp = x;

        int huiwen = 0;

        while(x != 0){
            int number = x % 10;
            x = x / 10;
            huiwen = huiwen * 10 + number;
        }

        if (huiwen == temp) {
            System.out.println("这个数是回文数");
        } else {
            System.out.println("这个数不是回文数");
        }

    }
}
