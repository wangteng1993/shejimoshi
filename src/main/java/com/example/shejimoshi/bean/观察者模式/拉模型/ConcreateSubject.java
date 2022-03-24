package com.example.shejimoshi.bean.观察者模式.拉模型;

/**
 * 具体主题对象
 */
public class ConcreateSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState) {

        this.state = newState;
        System.out.println("state change to " + this.state);
        this.nodifyObservices();
    }


}