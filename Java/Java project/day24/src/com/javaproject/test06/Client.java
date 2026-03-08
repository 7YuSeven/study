package com.javaproject.test06;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        /*
        客户端：发送一条数据，接收服务端反馈的消息并打印
        服务器：接收数据并打印，再给客户端反馈消息
         */

        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        os.write("你好，最近怎么样".getBytes());

        //写一个结束标记
        socket.shutdownOutput();

        //接收服务器数据并打印
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int len;
        while ((len = isr.read()) != -1) {
            System.out.print((char) len);
        }

        socket.close();
    }
}
