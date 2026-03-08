package com.javaproject;

public class Test04 {
    public static void main(String[] args) {
        String str = "小诗诗dqwefqwfqwfwg12312小丹丹dqwefqwfqwfwg12312小惠惠";

        String result = str.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(result);

        String[] arr = result.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
