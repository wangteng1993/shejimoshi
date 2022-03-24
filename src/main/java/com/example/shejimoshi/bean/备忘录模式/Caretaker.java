package com.example.shejimoshi.bean.备忘录模式;

/**
 * 责任人角色
 */
public class Caretaker {

    Memento memento;

    Memento retrieveMemento() {
        return this.memento;
    }

    void saveMemento(Memento memento) {
        this.memento = memento;
    }

}
