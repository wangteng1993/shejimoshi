package com.example.shejimoshi.bean.调停者模式;

/**
 * 具体同事类
 */
public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    void operation() {
        getMediator().changed(this);
    }


}
