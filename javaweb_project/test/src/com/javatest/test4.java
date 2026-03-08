package com.javatest;

public class test4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int sum = 0;
            int temp = i;
            while (temp != 0) {
                int num = temp % 10;
                sum = sum + num * num * num;
                temp = temp / 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
