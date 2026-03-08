package com.Arrylist.Test02;

public class Person {
    //        1.定义一个 Person 类
    //            (1)属性:
    //                编号 id ( int 类型 )
    //                姓名 name（String 类型）
    //                性别 sex （String 类型）
    //            (2)要求:
    //                成员变量private修饰
    //                生成空参构造/满参构造
    //                生成set/get方法
    private int id;
    private String name;
    private String sex;

    public Person() {
    }

    public Person(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
