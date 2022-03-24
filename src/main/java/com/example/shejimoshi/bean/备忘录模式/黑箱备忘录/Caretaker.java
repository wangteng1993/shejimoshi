package com.example.shejimoshi.bean.备忘录模式.黑箱备忘录;

/**
 * 责任人角色
 */
public class Caretaker {

    MementoIF memento;

    MementoIF retrieveMemento() {
        return this.memento;
    }

    void saveMemento(MementoIF memento) {
        this.memento = memento;
    }

}
