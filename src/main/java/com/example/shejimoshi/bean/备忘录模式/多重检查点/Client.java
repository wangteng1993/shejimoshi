package com.example.shejimoshi.bean.备忘录模式.多重检查点;


public class Client {
    public static void main(String[] args) {

      Originator originator = new Originator();
        Caretaker caretaker = new Caretaker(originator);

        originator.setState("0");

        caretaker.createMemento();


        originator.setState("1");
        caretaker.createMemento();
        originator.setState("2");
        caretaker.createMemento();
        originator.setState("3");
        caretaker.createMemento();
        originator.setState("4");
        caretaker.createMemento();

        originator.printStates();
        System.out.println("恢复到某一检查点");
        caretaker.retrieveMemento(1);

        originator.printStates();




    }
}
