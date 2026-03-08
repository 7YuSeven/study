package com.javaproject04;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum = sum + arr[i];
        }

        System.out.println("\n" + sum);

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 3 ==0) {
                count++;
            }
        }

        System.out.println(count);

        int[] arr3 = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 2 ==0){
                arr3[i] = arr3[i] / 2;
            } else{
                arr3[i] = arr3[i] * 2;
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
