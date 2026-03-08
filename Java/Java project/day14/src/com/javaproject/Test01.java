package com.javaproject;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        /*
        //需求:定义一个方法利用基本查找，查询某个元素是否存在
        //数据如下:{131，127，147，81，103，23，7，79}
         */
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 23};

        System.out.println(judgeNum1(arr, 81));
        System.out.println(getIndex1(arr, 81));
        int[] index = getIndex2(arr, 23);
        System.out.println(Arrays.toString(index));
    }
    
    public static boolean judgeNum1(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }
        }

        return false;
    }

    public static int getIndex1(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return i;
            }
        }

        return -1;
    }

    public static int[] getIndex2(int[] arr, int number){
        int[] num = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                num[j] = i;
                j++;
            }
        }

        return num;
    }
}
