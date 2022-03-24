package com.example.shejimoshi.bean.备忘录模式;

/**
 * 发起人角色
 */
public class Originator {
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    String state;

    Memento createMemento() {
        return new Memento(state);
    }


    void restoreMemento(Memento memento){
        this.state=memento.getState();
    }


}
