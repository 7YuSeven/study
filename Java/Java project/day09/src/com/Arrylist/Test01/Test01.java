package com.Arrylist.Test01;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        /*
        1.设计一个汽车Car类，私有成员变量：brand（品牌），color（颜色），int（价格），并生成相应的get/set方法,空参/满参构造。
        2.定义测试类，在main方法中完成以下要求：
            2.1创建三个Car对象，分别为” 宝马”，”黑色”，500000；”奔驰”，”红色”，300000； ”奥迪”，”红色”，200000；
            2.2将以上3个对象添加到ArrayList集合对象中
            2.3遍历集合，将颜色为“红色”的汽车按照如下格式打印到控制台上。
                奔驰-红色-300000
                奥迪-红色-200000
         */
        
        Car car1 = new Car("宝马", "黑色", 500000);
        Car car2 = new Car("奔驰", "红色", 300000);
        Car car3 = new Car("奥迪", "红色", 200000);

        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);

        for (int i = 0; i < carArrayList.size(); i++) {
            Car c = carArrayList.get(i);
            if (c.getColor().equals("红色")) {
                System.out.println(c.getBrand() + "-" + c.getColor() + "-" + c.getPrice());
            }
        }
    }
}
