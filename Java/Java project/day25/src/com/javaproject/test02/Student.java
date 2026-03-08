package com.javaproject.test02;

public class Student {
    public String name;
    protected int age;
    private String address;

    public Student() {}

    private Student(String name) {
        this.name = name;
    }

    protected Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
    
    public String eat(String food) {
        System.out.println("正在吃" + food);
        return "好吃";
    }
}
