package com.example.shejimoshi.bean.调停者模式;

/**
 * 具体同事类
 */
public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    void operation() {
        getMediator().changed(this);
    }


}
