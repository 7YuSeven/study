package com.javaproject04;

public class Test06 {
    public static void main(String[] args) {
        /*
        需求:
	        请使用静态初始化的方式,创建一个长度为5的整数数组,并为数组中的元素赋值,
	        遍历数组,在同一行打印所有元素,元素之间用空格隔开,
	        比如1:如果数组为{1,2,3,4,5}打印结果:1 2 3 4 5
         */

        int[] arr = {1,2,3,4,5};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        /*
        需求:
	        现有一个整数数组{100,50,90,60,80,70}。请编写代码，计算数组中的所有元素的和并打印。
         */
        int[] arr2 = {100,50,90,60,80,70};

        int sum = 0;

        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }

        System.out.println("\n" + sum);

        /*
        需求:
	        现有一个整数数组{100,50,90,60,80,70}。请编写代码，计算数组中的所有元素的最小值并打印。
         */
        int[] arr3 = {100,50,90,60,80,70};

        int min = arr3[0];

        for (int i = 1; i < arr3.length; i++) {
            if (arr3[i] < min) {
                min = arr3[i];
            }
        }

        System.out.println(min);

        /*
        需求:
	        现有一个整数数组{100,50,90,60,80,70}。请编写代码，计算数组中的所有元素的最大值并打印。
         */
        int[] arr4 = {100,50,90,60,80,70};

        int max = arr4[0];

        for (int i = 1; i < arr4.length; i++) {
            if (arr4[i] > max) {
                max = arr4[i];
            }
        }

        System.out.println(max);

        /*
        需求:
	        现有一个整数数组{100,50,90,60,80,70}。
	        请编写程序，计算去掉最大值和最小值后的平均值（不考虑小数部分）
         */
        int[] arr5 = {100,50,90,60,80,70};

        int max1 = arr5[0];
        int min1 = arr5[0];
        int sum1 = 0;

        for (int i = 1; i < arr5.length; i++) {
            if (arr5[i] > max1) {
                max1 = arr5[i];
            }

            if (arr5[i] < min1) {
                min1 = arr5[i];
            }

            sum1 = sum1 + arr5[i];
        }

        int avg = (sum1 + arr5[0] - max1 - min1) / arr5.length;

        System.out.println(avg);
    }
}
