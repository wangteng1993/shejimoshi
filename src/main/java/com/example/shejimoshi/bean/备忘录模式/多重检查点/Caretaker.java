package com.example.shejimoshi.bean.备忘录模式.多重检查点;


import java.util.ArrayList;
import java.util.List;

/**
 * 责任人角色
 */
public class Caretaker {

    Originator originator;
    List<Memento> mementos = new ArrayList<>();
    int current;

    public Caretaker(Originator originator) {
        this.originator = originator;
        this.current = 0;
    }


    int createMemento() {
        Memento memento = originator.createMemento();
        this.mementos.add(memento);
        return current++;
    }
    void retrieveMemento(int index) {
        Memento memento = mementos.get(index);
        originator.restoreMemento(memento);
    }
    void removeMemento(int index) {
        Memento memento = mementos.remove(index);
    }
    void  printAll(){
        for (Memento m : mementos) {
            System.out.println(m+"===="+m.getStates()+"_________");
        }
    }
}
