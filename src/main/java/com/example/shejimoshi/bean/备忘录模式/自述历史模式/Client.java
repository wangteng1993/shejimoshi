package com.example.shejimoshi.bean.备忘录模式.自述历史模式;

public class Client {
    public static void main(String[] args) {


        Originator originator = new Originator();
        originator.changeState("state 0");

        Originator.Memento memento = originator.createMemento();
        originator.changeState("state 1");
        originator.restoreMemento(memento);

    }
}
