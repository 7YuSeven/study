package com.javaproject.test07;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        /*
        客户端：将本地文件上传到服务器。接收服务器的反馈。
        服务器：接收客户端上传的文件，上传完毕之后给出反馈。
         */
        Socket socket = new Socket("127.0.0.1", 8000);

        FileInputStream fis = new FileInputStream("day24\\src\\com\\javaproject\\test07\\clientdir\\picture.jpg");
        OutputStream os = socket.getOutputStream();

        int len;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        fis.close();

        socket.shutdownOutput();

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
//        int i;
//        while ((i = isr.read()) != -1) {
//            System.out.print((char) i);
//        }
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        System.out.println(str);

        socket.close();
    }
}
