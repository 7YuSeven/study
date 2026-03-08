package com.javaproject06;

public class Test07 {
    public static void main(String[] args) {
        //解密Test06数字
        int number = 8346;
        int temp = number;
        int count  = 0;

        while(number != 0){
            number = number / 10;
            count++;
        }

        int[] numberArr = new int[count];

        for (int i = 0; i < numberArr.length; i++) {
            numberArr[i] = temp % 10;
            temp = temp / 10;
        }

        // (1 2 3 4 5 6 7 8 9) + 5
        // (6 7 8 9 10 11 12 13 14) % 10
        // (6 7 8 9 0 1 2 3 4)
        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i] >= 0 && numberArr[i] <= 4) {
                numberArr[i] = numberArr[i] + 10;
            }
        }

        for (int i = 0; i < numberArr.length; i++) {
            numberArr[i] = numberArr[i] - 5;
        }

        int oldnumber = 0;
        for (int i = 0; i < numberArr.length; i++) {
            oldnumber = oldnumber * 10 + numberArr[i];
        }

        System.out.println(oldnumber);
    }
}
