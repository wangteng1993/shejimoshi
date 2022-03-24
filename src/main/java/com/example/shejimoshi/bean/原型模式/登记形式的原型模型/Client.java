package com.example.shejimoshi.bean.原型模式.登记形式的原型模型;

public class Client {
    public static void main(String[] args) {
        Prototype p1 = new ConcreteProtype1();
        PrototypeManger.setPrototype("p1", p1);


        Prototype p3 = PrototypeManger.getPrototype("p1").clone();
        p3.setName("333333");


        ConcreteProtype2 p2 = new ConcreteProtype2();
        PrototypeManger.setPrototype("p1", p2);


        Prototype p4 = PrototypeManger.getPrototype("p1").clone();
        p4.setName("444444");

        PrototypeManger.removePrototype("p1");
        Prototype p5 = PrototypeManger.getPrototype("p1").clone();

        System.out.println("111");

    }
}
