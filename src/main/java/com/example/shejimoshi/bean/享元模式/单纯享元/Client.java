package com.example.shejimoshi.bean.享元模式.单纯享元;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweightA = flyweightFactory.factory(new Character('A'));
        flyweightA.operation("First Call ,A state");
        System.out.println(flyweightA);


        Flyweight flyweightB = flyweightFactory.factory(new Character('B'));
        flyweightB.operation("First Call ,B state");
        System.out.println(flyweightB);

        Flyweight flyweightC = flyweightFactory.factory(new Character('A'));
        flyweightC.operation("First Call ,A state");
        System.out.println(flyweightC);


    }
}
