package com.example.shejimoshi.bean.观察者模式.推模型;

/**
 * 具体主题对象
 */
public class 具体主题对象 extends 抽象主题者 {
    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState) {

        this.state = newState;
        System.out.println("state change to " + this.state);
        this.nodifyObservices(this.state);
    }


}