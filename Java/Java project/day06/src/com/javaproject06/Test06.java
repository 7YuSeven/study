package com.javaproject06;

public class Test06 {
    public static void main(String[] args) {
        /*
        需求:
            某系统的数字密码(大于0)，比如1983，采用加密方式进行传输。
            规则如下:
                先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数。
         */
        int number = 1983;
        int count = 0;

        int temp = number;

        while (number != 0) {
            number = number / 10;
            count++;
        }

        int[] numberArr = new int[count];

        for (int i = numberArr.length - 1; i >= 0; i--) {
            numberArr[i] = temp % 10;
            temp = temp / 10;
        }

        for (int i = 0; i < numberArr.length; i++) {
            numberArr[i] = numberArr[i] + 5;
        }

        for (int i = 0; i < numberArr.length; i++) {
            numberArr[i] = numberArr[i] % 10;
        }

        for (int i = 0, j = numberArr.length - 1; i < j; i++, j--) {
            int tempNumber = numberArr[i];
            numberArr[i] = numberArr[j];
            numberArr[j] = tempNumber;
        }

        int newNumber = 0;
        for (int i = 0; i < numberArr.length; i++) {
            newNumber = newNumber * 10 + numberArr[i];
        }
        System.out.println(newNumber);
    }
}
