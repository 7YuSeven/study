package com.javaproject.test06;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //接收数据
        ServerSocket ss = new ServerSocket(8888);
        Socket socket = ss.accept();

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());

        //read方法会读取数据，但是需要一个结束标记来结束循环，否则会继续等待读取数据
        int len;
        while ((len = isr.read()) != -1) {
            System.out.print((char) len);
        }

        //给客户端反馈数据
        OutputStream os = socket.getOutputStream();
        os.write("很好，你怎么样".getBytes());

        socket.close();
        ss.close();
    }
}
