package com.Arrylist.Test03;

public class Coder {
    /*
            1.定义"程序员"类,Coder,包含以下成员:
            1.1成员属性:
                name (姓名):String类型，
                age (年龄):int类型，
                like (爱好):String类型

            1.2要求:
                成员变量private修饰
                生成空参构造/满参构造
                生成set/get方法
     */

    private String name;
    private int age;
    private String like;

    public Coder() {
    }

    public Coder(String name, int age, String like) {
        this.name = name;
        this.age = age;
        this.like = like;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
