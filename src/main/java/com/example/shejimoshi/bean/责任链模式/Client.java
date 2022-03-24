package com.example.shejimoshi.bean.责任链模式;

public class Client {
    public static void main(String[] args) {
        ConcreteHandler concreteHandler1 = new ConcreteHandler();
        ConcreteHandler concreteHandler2 = new ConcreteHandler();
        concreteHandler1.setSuccessor(concreteHandler2);
        concreteHandler1.handleRequest();
    }
}
