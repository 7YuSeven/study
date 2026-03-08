package com.javaproject03;

public class Test09 {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 13;

        int count = 0;

        while (number1 >= number2){
            number1  = number1 - number2;
            count ++;
        }

        System.out.println("余数为" + number1);
        System.out.println("商为" + count);
    }
}
