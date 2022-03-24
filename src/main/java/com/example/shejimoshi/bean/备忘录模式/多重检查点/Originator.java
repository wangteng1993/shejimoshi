package com.example.shejimoshi.bean.备忘录模式.多重检查点;


import java.util.ArrayList;
import java.util.List;

/**
 * 发起人角色
 */
public class Originator {

    List<String> states;
    int index;

    public void setStates(List<String> states) {
        this.states = states;
    }

    public List<String> getStates() {
        return states;
    }

    void printStates(){
        for (String state : states) {
            System.out.println(state+"===");
        }
    }

    public void setState(String state) {
        this.states.add(state) ;
    }


    public Originator() {
        this.states = new ArrayList<>();
        this.index = 0;
    }

    Memento createMemento() {
        return new Memento(states, index);
    }


    void restoreMemento(Memento memento) {
        this.states = memento.getStates();
        this.index = memento.getIndex();
    }


}
