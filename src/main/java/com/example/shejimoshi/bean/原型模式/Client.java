package com.example.shejimoshi.bean.原型模式;

public class Client {
    public static void main(String[] args) {
        ConcreteProtype1 protype1 = new ConcreteProtype1("protype1");
        Prototype clone = protype1.clone();

        ConcreteProtype2 protype2 = new ConcreteProtype2("protype2");
        Prototype clone1 = protype2.clone();
        System.out.println("111");



    }
}
