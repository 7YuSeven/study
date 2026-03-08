package com.javaproject.test04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //接收数据
        ServerSocket ss = new ServerSocket(8000);
        Socket socket = ss.accept();
        //监听客户端的链接
//        InputStream is = socket.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //获取数据
//        int len;
//        while ((len = isr.read()) != -1) {
//            System.out.println((char) len);
//        }
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }

        socket.close();
        ss.close();
    }
}
