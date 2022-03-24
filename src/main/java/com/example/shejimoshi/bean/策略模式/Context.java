package com.example.shejimoshi.bean.策略模式;

public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    void contextInterface() {
        strategy.strategyInterface();
    }

}
