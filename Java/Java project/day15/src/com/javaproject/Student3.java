package com.javaproject;

public class Student3 implements Comparable<Student3> {
    private String name;
    private int age;
    private int chinese;
    private int math;
    private int english;


    public Student3() {
    }

    public Student3(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    public String toString() {
        return "Student3{name = " + name + ", age = " + age + ", chinese = " + chinese + ", math = " + math + ", english = " + english + "}";
    }

    @Override
    public int compareTo(Student3 o) {
        int sum1 = this.chinese + this.math + this.english;
        int sum2 = o.chinese + o.math + o.english;
        int i = sum1 - sum2;
        i = i == 0 ? this.chinese - o.chinese : i;
        i = i == 0 ? this.math - o.math : i;
        i = i == 0 ? this.english - o.english : i;
        i = i == 0 ? this.age - o.age : i;
        i = i == 0 ? this.name.compareTo(o.name) : i;
        return i;
    }
}
