package com.javaproject.test03;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SendMessage {
    public static void main(String[] args) throws IOException {
        /*
        按照下面的要求实现程序
            UDP发送数据：数据来自键盘录入，直到输入的数据是886，发送数据结束
            UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收
         */
        //创建对象
        DatagramSocket ds = new DatagramSocket();

        //输入数据
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入");
            String str = sc.nextLine();

            if ("886".equals(str)) {
                break;
            }

            byte[] bytes = str.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            //打包数据
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, 8000);
            ds.send(dp);
        }

        ds.close();
    }
}
