package com.javaproject.test01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test01 {
    public static void main(String[] args) throws UnknownHostException {
        //InetAddress类的使用
        InetAddress address = InetAddress.getByName("172.29.194.64");
        //InetAddress address1 = InetAddress.getByName("DESKTOP-I222AFG");
        System.out.println(address);

        String ip = address.getHostAddress();
        System.out.println(ip);

        String host = address.getHostName();
        System.out.println(host);
    }
}
