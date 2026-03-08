package com.javaproject06;

import java.util.Random;

public class Test08 {
    public static void main(String[] args) {
        /*
        需求:
            一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。请使用代码模拟抽奖
            打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下:(随机顺序，不一定是下面的顺序)
         */

        int[] moneyArr = {2, 588, 888, 1000, 10000};
        int[] newMoneyArr = new int[moneyArr.length];

//        Random r = new Random();
//
//        for (int i = 0; i < moneyArr.length; ) {
//            boolean bool = true;
//            int temp = r.nextInt(moneyArr.length);
//
//            for (int j = 0; j < newMoneyArr.length; j++) {
//                if (newMoneyArr[j] == moneyArr[temp]) {
//                    bool = false;
//                    break;
//                }
//            }
//
//            if (bool){
//                newMoneyArr[i] = moneyArr[temp];
//                i++;
//            }
//        }
        newMoneyArr = getNewArr(moneyArr);

        for (int i = 0; i < newMoneyArr.length; i++) {
            System.out.println(newMoneyArr[i]);
        }

    }

    public static int[] getNewArr(int[] arr){
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        return arr;
    }
}
