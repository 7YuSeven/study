package com.javaproject.test08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.UUID;

public class MyThread extends Thread {

    Socket socket;

    public MyThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //防止重名文件
            String name = UUID.randomUUID().toString().replace("-", "");
            InputStream is = socket.getInputStream();
            FileOutputStream fos = new FileOutputStream("day24\\src\\com\\javaproject\\test08\\severdir\\" + name + ".jpg");

            int len;
            byte[] bytes = new byte[1024];
            while ((len = is.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }

            OutputStream os = socket.getOutputStream();
            os.write("已收到发送的图片".getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
