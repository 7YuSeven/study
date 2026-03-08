package com.javaproject;

public class Test02 {
    public static void main(String[] args) {
        //需求:定义一个方法利用二分查找，查询某个元素在数组中的索引
        //数据如下:{7，23，79，81，103，127，131，147}

        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};

        System.out.println(getIndex(arr, 80));
    }

    public static int getIndex(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;
        while (true){
            if (min > max){
                return -1;
            }

            int mid = (max + min) / 2;

            if (arr[mid] > number) {
                max = mid - 1;
            } else if (arr[mid] < number) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
    }
}
