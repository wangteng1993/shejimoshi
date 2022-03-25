package com.example.shejimoshi.bean.调停者模式;

/**
 * 抽象同事类
 */
public class Colleague {
    Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
