package com.javaproject.test08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) throws IOException {
        /*
        需求：写一个登陆小案例。
            步骤：
            将正确的用户名和密码手动保存在本地的userinfo.txt文件中。
            保存格式为:username=zhangsan&password=123
            让用户键盘录入用户名和密码
            比较用户录入的和正确的用户名密码是否一致
            如果一致则打印登陆成功
            如果不一致则打印登陆失败
         */

        BufferedReader br = new BufferedReader(new FileReader("day22\\src\\com\\javaproject\\test08\\userinfo.txt"));
        String user = br.readLine();
        br.close();

        String[] strs = user.split("&");
        String username = strs[0].split("=")[1];
        String password = strs[1].split("=")[1];

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String tempUsername = sc.nextLine();
        System.out.println("请输入密码");
        String tempPassword = sc.nextLine();

        if (!username.equals(tempUsername) || !password.equals(tempPassword)) {
            System.out.println("用户名或密码错误，登陆失败");
        } else {
            System.out.println("登陆成功");
        }
    }
}
