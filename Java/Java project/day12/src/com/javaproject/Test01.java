package com.javaproject;

public class Test01 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (judgeNumber(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean judgeNumber(int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
