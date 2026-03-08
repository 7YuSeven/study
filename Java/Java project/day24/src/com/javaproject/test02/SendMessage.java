package com.javaproject.test02;

import java.io.IOException;
import java.net.*;

public class SendMessage {
    public static void main(String[] args) throws IOException {
        //发送数据
        //创建DatagramSocket对象
        DatagramSocket ds = new DatagramSocket();
        //打包数据
        String str = "你好啊";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length,address, 10086);

        //发送数据
        ds.send(dp);

        ds.close();
    }
}
