package com.example.shejimoshi.bean.状态模式;

public class ConcreteStateA implements State {
    @Override
    public void handle(String simpleParameter) {
        System.out.println("ConcreteStateA   " + simpleParameter);
    }
}
