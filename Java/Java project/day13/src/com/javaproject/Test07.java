package com.javaproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test07 {
    public static void main(String[] args) throws ParseException {
        /*
        假设，你初恋的出生年月日为:2000-11-11
            请用字符串表示这个数据，并将其转换为:2000年11月11日
         */
        String str = "2000-11-11";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf1.parse(str);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String format = sdf2.format(date1);
        System.out.println(format);


        /* 需求:
        秒杀活动:2023年11月11日0:0:0
        开始时间:2023年11月11日0:10:0

        小贾下单并付款的时间为:2023年11月11日0:01:00
        小皮下单并付款的时间为:2023年11月11日8:11:0

        用代码说明这两位同学有没有参加上秒杀活动?*/

        String startTime = "2023年11月11日0:0:0";
        String endTime = "2023年11月11日0:10:0";
        String jia = "2023年11月11日0:01:00";
        String pi = "2023年11月11日8:11:0";

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        Date date2 = sdf3.parse(startTime);
        Date daate3 = sdf3.parse(endTime);

        Long start = date2.getTime();
        Long end = daate3.getTime();

        Long jiaTime = sdf3.parse(jia).getTime();
        Long piTime = sdf3.parse(pi).getTime();

        if (jiaTime < start || jiaTime > end) {
            System.out.println("小贾未能参加");
        } else {
            System.out.println("小贾参加了");
        }

        if (piTime < start || piTime > end) {
            System.out.println("小皮未能参加");
        } else {
            System.out.println("小皮参加了");
        }


    }
}
