package com.javaproject.test14;

import java.math.BigDecimal;
import java.util.Random;

public class HongBaoThread extends Thread {
    static double money = 100;

    static int count = 3;//红包个数

    @Override
    public void run() {
        synchronized (HongBaoThread.class) {
            if (count == 0) {
                System.out.println(getName() + "没抢到");
            } else {
                double getMoney = 0;
                if (count == 1) {
                    getMoney = money;
                } else {
                    Random r = new Random();
                    //3个红包
                    //99.98 0.01 0.01
                    //99.98 = 100 - 0.01*2
                    getMoney = r.nextDouble(money - (count - 1) * 0.01);

                    if (getMoney < 0.01) {
                        getMoney = 0.01;
                    }
                }
                BigDecimal bd1 = new BigDecimal(money);
                BigDecimal bd2 = new BigDecimal(getMoney).setScale(2, BigDecimal.ROUND_HALF_UP);

                BigDecimal subtract = bd1.subtract(bd2);

                money = subtract.doubleValue();
                System.out.println(getName() + "抢到了" + bd2.doubleValue() + "元");
                count--;
            }
        }
    }

}
