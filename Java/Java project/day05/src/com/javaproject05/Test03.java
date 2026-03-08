package com.javaproject05;

public class Test03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        boolean bool = numberExist(arr, 11);

        System.out.println(bool);

    }

    public static boolean numberExist(int[] arr, int a){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return true;
            }
        }

        return false;
    }
}
