package com.javaproject03;

public class Test07 {
    public static void main(String[] args) {
        double mountain = 8844430;

        double paper = 0.1;

        int count = 0;

        while(paper < mountain){
            paper = paper * 2;
            count ++;
        }

        System.out.println(count);
    }
}
