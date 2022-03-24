package com.example.shejimoshi.bean.备忘录模式.黑箱备忘录;

import lombok.Data;

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

    MementoIF createMemento() {
        return new Memento(this.state);
    }


    void restoreMemento(MementoIF memento){
        this.state=((Memento)memento).getState();
    }



    @Data
    public class Memento implements  MementoIF {
        String state;

        public Memento(String state) {
            this.state = state;
        }

    }


}
