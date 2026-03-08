package com.javaproject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Test09 {
    public static void main(String[] args) throws IOException {
        /*
        TCP通信练习7--BS（接收浏览器的消息并打印）
        客户端：不需要写
        服务器：接收数据并打印。
         */

        ServerSocket ss = new ServerSocket(8000);

        Socket socket = ss.accept();

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());

        int len;
        while ((len = isr.read()) != -1) {
            System.out.print((char) len);
        }

        socket.close();
        ss.close();


    }
}
