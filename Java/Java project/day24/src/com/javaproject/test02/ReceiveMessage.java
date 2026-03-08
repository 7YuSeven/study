package com.javaproject.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveMessage {
    public static void main(String[] args) throws IOException {
        //接收数据
        //创建DatagramSocket对象
        DatagramSocket ds = new DatagramSocket(10086);

        //接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        ds.receive(dp);

        InetAddress address = dp.getAddress();
        byte[] data = dp.getData();
        int port = dp.getPort();
        int length = dp.getLength();

        System.out.println("接收的数据为" + new String(data, 0, length));
        System.out.println("该数据来源于端口号为" + port + " ,地址为" + address.getHostAddress());
    }
}
