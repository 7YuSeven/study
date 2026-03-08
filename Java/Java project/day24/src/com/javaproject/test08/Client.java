package com.javaproject.test08;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        /*
        想要服务器不停止，能接收很多用户上传的图片。
        该怎么做呢？
        提示：可以用循环或者多线程。
        但是循环不合理，最优解法是（循环+多线程）改写
         */

        Socket socket = new Socket("127.0.0.1", 8000);

        FileInputStream fis = new FileInputStream("day24\\src\\com\\javaproject\\test08\\clientdir\\picture.jpg");
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
