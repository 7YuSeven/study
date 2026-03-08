package com.javaproject.test03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveMessage {
    public static void main(String[] args) throws IOException {
        //创建对象
        DatagramSocket ds = new DatagramSocket(8000);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        //接受数据
        while (true) {
            ds.receive(dp);
            byte[] data = dp.getData();
            int length = dp.getLength();
            InetAddress address = dp.getAddress();
            int port = dp.getPort();
            System.out.println("收到了来自" + address.getHostAddress() + ", 端口为" + port + "发送的数据" + new String(data, 0 , length));
        }
    }
}
