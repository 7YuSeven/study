package com.javaproject03;

public class Test18 {
    public static void main(String[] args) {
        /*
        需求:
	        1.打印所有四位数中 个位 + 千位 == 百位 + 十位 的数字
            2.最后要打印符合条件的数字的总数量
        	3.打印格式如下:
		        1010
                1021
                1032
                1043
                ....
               以上满足条件的四位数总共有 615 个
         */

        int count = 0;

        for (int i = 1000; i < 10000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000;

            if (ge + qian == bai + shi) {
                System.out.println(i);
                count ++;
            }
        }

        System.out.println("以上满足条件的四位数总共有" + count + "个");
    }
}
