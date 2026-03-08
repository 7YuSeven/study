package com.javaproject;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        /*
        需求·
            键盘录入自己心仪的女朋友姓名和年龄。
            姓名的长度在3-10之间
            年龄的范围为18-40岁
            超出这个范围是异常数据不能赋值，需要重新录入,一直录到正确为止，
            提示
            需要考虑用户在键盘录入时的所有情况，
            比如:录入年龄时超出范围，录入年龄时录入了abc等情况
         */

        Girlfriend girlfriend = new Girlfriend();
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                System.out.println("请输入姓名");
                String name = sc.nextLine();
                girlfriend.setName(name);
                System.out.println("请输入年龄");
                int age = Integer.parseInt(sc.nextLine());
                girlfriend.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄错误，请重新输入数字");
            } catch (RuntimeException e) {
                System.out.println("姓名长度有误或年龄范围错误");
            }
        }

        System.out.println(girlfriend);
    }
}
