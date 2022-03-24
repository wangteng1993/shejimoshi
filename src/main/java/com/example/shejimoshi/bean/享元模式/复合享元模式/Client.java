package com.example.shejimoshi.bean.享元模式.复合享元模式;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {


        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('A');
        characters.add('B');


        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight compositeFly1 = flyweightFactory.factory(characters);
        compositeFly1.operation("Composite1 call");
        Flyweight compositeFly2 = flyweightFactory.factory(characters);
        compositeFly2.operation("Composite2 Call");

        System.out.println(compositeFly1);

        System.out.println(compositeFly2);



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
