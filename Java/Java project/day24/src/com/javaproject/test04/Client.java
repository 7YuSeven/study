package com.javaproject.test04;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //TCP协议发送数据
        //创建对象
        Socket socket = new Socket("127.0.0.1", 8000);
        //获取输出流
        OutputStream os = socket.getOutputStream();
        //输出数据
        os.write("你好".getBytes());
        os.close();
        socket.close();
    }
}
