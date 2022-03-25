package com.example.shejimoshi.bean.调停者模式;

public class ConcreteMediator implements Mediator{

    ConcreteColleagueA colleagueA;
    ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void changed(Colleague c) {

    }
}
