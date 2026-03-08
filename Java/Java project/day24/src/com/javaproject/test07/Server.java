package com.javaproject.test07;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        //接收数据
        ServerSocket ss = new ServerSocket(8000);
        Socket socket = ss.accept();

        //防止重名文件
        String name = UUID.randomUUID().toString().replace("-", "");

        InputStream is = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream("day24\\src\\com\\javaproject\\test07\\severdir\\" + name + ".jpg");

        int len;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        OutputStream os = socket.getOutputStream();
        os.write("已收到发送的图片".getBytes());

        socket.close();
        ss.close();

    }
}
