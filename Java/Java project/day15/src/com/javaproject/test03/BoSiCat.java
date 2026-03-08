package com.javaproject.test03;

public class BoSiCat extends Cat{

    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的, " + getAge() + "岁的波斯猫, 正在吃小饼干");
    }
}
