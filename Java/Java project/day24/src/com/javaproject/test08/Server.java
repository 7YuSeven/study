package com.javaproject.test08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {
        //接收数据
        ServerSocket ss = new ServerSocket(8000);

        //创建线程池对象
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,//核心线程数量
                10,//最大线程数量
                60,//空闲时间
                TimeUnit.SECONDS,//空闲时间单位
                new ArrayBlockingQueue(3),//队列
                Executors.defaultThreadFactory(),//线程工厂，让线程池如何创建对象
                new ThreadPoolExecutor.AbortPolicy()//阻塞队列
        );

        while (true) {
            Socket socket = ss.accept();
            //创建线程
//            MyThread mt = new MyThread(socket);
//            mt.start();
            pool.submit(new MyThread(socket));
        }
    }
}
