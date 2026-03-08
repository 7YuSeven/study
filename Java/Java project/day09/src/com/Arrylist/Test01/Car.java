package com.Arrylist.Test01;

public class Car {
    //设计一个汽车Car类，私有成员变量：brand（品牌），color（颜色），int（价格），并生成相应的get/set方法,空参/满参构造。
    private String brand;
    private String color;
    private int price;

    public Car() {
    }

    public Car(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
