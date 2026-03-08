package com.javaproject.test09;

import java.io.*;
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) throws IOException {
        /*
        需求：写一个登陆小案例（添加锁定账号功能）
            步骤:
            将正确的用户名和密码手动保存在本地的userinfo.txt文件中。
            保存格式为:username=zhangsan&password=123&count=0
            让用户键盘录入用户名和密码
            比较用户录入的和正确的用户名密码是否一致
            如果一致则打印登陆成功
            如果不一致则打印登陆失败，连续输错三次被锁定
         */

        BufferedReader br = new BufferedReader(new FileReader("day22\\src\\com\\javaproject\\test09\\userinfo.txt"));
        String line = br.readLine();
        br.close();

        String[] strs = line.split("&");
        String username = strs[0].split("=")[1];
        String password = strs[1].split("=")[1];
        int count = Integer.parseInt(strs[2].split("=")[1]);

        Scanner sc =new Scanner(System.in);
        System.out.println("请输入用户名");
        String tempUsername = sc.nextLine();
        System.out.println("请输入密码");
        String tempPassword = sc.nextLine();

        if (count == 3) {
            System.out.println("账号已被锁定，请联系管理员解锁");
        } else {
            if (!username.equals(tempUsername) || !password.equals(tempPassword)) {
                System.out.println("用户名或密码错误，登陆失败");
                count ++;
            } else {
                System.out.println("登录成功");
            }
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("day22\\src\\com\\javaproject\\test09\\userinfo.txt"));
        bw.write("username=" + username + "&password=" + password + "&count=" + count);
        bw.close();

    }
}
