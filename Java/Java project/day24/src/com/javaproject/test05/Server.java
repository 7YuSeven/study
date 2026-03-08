package com.javaproject.test05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //接收数据
        ServerSocket ss = new ServerSocket(8888);
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
