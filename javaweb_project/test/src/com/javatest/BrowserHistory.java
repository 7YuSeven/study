package com.javatest;

import java.util.ArrayList;

public class BrowserHistory {
    private String homepage;
    private int top;
    private int bottom;

    ArrayList<String> history = new ArrayList<>();

    public BrowserHistory() {
    }

    public BrowserHistory(String homepage) {
        top ++;
        this.homepage = homepage;
        history.add(homepage);

    }

    /**
     * 获取
     * @return homepage
     */
    public String getHomepage() {
        return homepage;
    }

    /**
     * 设置
     * @param homepage
     */
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String toString() {
        return "BrowserHistory{homepage = " + homepage + "}";
    }

    public void visit(String url) {
        history.add(url);
        System.out.println("访问" + url);
        top ++;
        bottom = top;
    }

    public void back(int steps){
        bottom = bottom - steps;
        if (bottom < 0){
            System.out.println(history.get(0));
            return;
        }
        System.out.println(history.get(bottom - 1));
    }

    public void forward(int steps){
        bottom = bottom + steps;
        if (bottom > top) {
            System.out.println(history.get(top - 1));
            bottom = top;
            return;
        }
        System.out.println(history.get(bottom - 1));
    }

}
