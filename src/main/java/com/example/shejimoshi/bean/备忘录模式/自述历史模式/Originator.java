package com.example.shejimoshi.bean.备忘录模式.自述历史模式;


import lombok.Data;

/**
 * 发起人角色
 */
public class Originator {


    private String state;

    public void changeState(String state) {
        this.state = state;
        System.out.println("状态变为" + this.state);
    }

    Memento createMemento() {
        return new Memento(this);
    }


    void restoreMemento(MementoIF memento) {

        changeState(((Memento) memento).getState());
    }

    @Data
    public class Memento implements MementoIF {
        String state;

        public Memento(Originator originator) {
            this.state = originator.state;
        }


        public String getState() {
            return state;
        }
    }


}
