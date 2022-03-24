package com.example.shejimoshi.bean.观察者模式.推模型;

public class 具体观察者 implements 抽象观察者 {
    private String observerState;

    @Override
    public void update(String state) {
        this.observerState = state;
        System.out.println("observer state is " + this.observerState);

    }
}
