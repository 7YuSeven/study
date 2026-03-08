package com.testpackage;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        /*需求:
	    身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：
	    儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
	    女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
        现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？
        */
        //int father = 177;
        //int mother = 165;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入爸爸身高：");
        int father = sc.nextInt();
        System.out.println("请输入妈妈身高：");
        int mother = sc.nextInt();

        double son = (father + mother) * 1.08 / 2;
        double daughter = (father * 0.932 + mother) / 2;
        System.out.println(son);
        System.out.println(daughter);
    }
}
