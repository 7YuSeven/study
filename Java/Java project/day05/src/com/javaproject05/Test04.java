package com.javaproject05;

public class Test04 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int[] newArr = copyOfRange(arr, 3, 7);

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to){
        int[] tempArr = new int[to - from];

        for (int i = from; i < to; i++) {
            tempArr[i - from] = arr[i];
        }

        return tempArr;
    }
}
