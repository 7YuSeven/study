package com.javaproject06;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        //输入机票原价、月份、和头等舱或经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票价格");
        int ticket = sc.nextInt();

        System.out.println("请输入月份");
        int month = sc.nextInt();

        System.out.println("请输入舱位 0为头等舱 1为经济舱");
        int seat = sc.nextInt();

        if (month >= 5 && month <= 10) {
            ticket = getTicket(seat, ticket, 0.9, 8.5);
            //ticket = getTicket(ticket,seat,0.9,8.5);
        } else if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) {
//            if (seat == 0) {
//                ticket = (int) (ticket * 0.7);
//            }else {
//                ticket = (int) (ticket * 6.5);
//            }
            //ticket = getTicket(ticket,seat,0.7,6.5);
            ticket = getTicket(seat, ticket, 0.7, 6.5);
        }

        System.out.println("价格为" + ticket);
    }

    private static int getTicket(int seat, int ticket, double a, double b) {
        if (seat == 0) {
            ticket = (int) (ticket * a);
        } else {
            ticket = (int) (ticket * b);
        }
        return ticket;
    }

//    public static int getTicket(int ticket, int seat, double a, double b){
//        if (seat == 0) {
//            ticket = (int) (ticket * a);
//        }else {
//            ticket = (int) (ticket * b);
//        }
//
//        return ticket;
//    }
}
