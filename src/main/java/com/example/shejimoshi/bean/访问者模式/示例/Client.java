package com.example.shejimoshi.bean.访问者模式.示例;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new NodeA());
        objectStructure.add(new NodeB());
        Visitor visitor = new VisitorA();
        objectStructure.action(visitor);
    }
}
