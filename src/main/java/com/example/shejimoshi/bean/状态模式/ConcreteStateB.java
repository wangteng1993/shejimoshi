package com.example.shejimoshi.bean.状态模式;

public class ConcreteStateB implements State {
    @Override
    public void handle(String simpleParameter) {
        System.out.println("ConcreteStateB   " + simpleParameter);
    }
}
