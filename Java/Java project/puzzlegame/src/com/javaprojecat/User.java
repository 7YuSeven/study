package com.javaprojecat;

//用户对象包含用户名和密码
public class User {
    private String name;
    private String password;
    private int count = 0;

    public User() {
    }

    public User(String name, String password, int count) {
        this.name = name;
        this.password = password;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "username=" + name + "&password=" + password + "&count=" + count;
    }
}
