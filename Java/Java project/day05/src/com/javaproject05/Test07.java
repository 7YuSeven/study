package com.javaproject05;

public class Test07 {
    public static void main(String[] args) {
        /*
        数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试
        比如:
            小数数字 -6.6 的绝对值是 6.6
            小数数字 6.6 的绝对值是 6.6
         */
        double a = -3.14;
        double temp = getAbs(a);
        System.out.println("小数数字" + a + "的绝对值是" + temp);

    }

    public static double getAbs(double a){
        if (a >= 0) {
            return a;
        }else {
            return (-a);
        }
    }
}
