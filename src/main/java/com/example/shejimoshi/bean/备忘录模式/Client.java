package com.example.shejimoshi.bean.备忘录模式;

public class Client {


    public static void main(String[] args) {


        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("On");
        caretaker.saveMemento(originator.createMemento());
        originator.setState("Off");
        originator.setState("qwe");

        originator.setState("1122");

        originator.restoreMemento(caretaker.retrieveMemento());




        System.out.println(originator.getState());
    }

}
