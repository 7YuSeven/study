package com.javaproject.test05;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        /*
        客户端：多次发送数据
        服务器：接收多次接收数据，并打印
         */
        Socket socket = new Socket("127.0.0.1", 8888);

        Scanner sc = new Scanner(System.in);
        OutputStream os = socket.getOutputStream();

        while (true) {
            System.out.println("请输入");
            String str = sc.nextLine();
            if ("886".equals(str)) {
                break;
            }
            os.write(str.getBytes());
        }

        socket.close();
    }
}
