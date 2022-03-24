package com.example.shejimoshi.bean.装饰器模式.七十二变;

public class Client {
    public static void main(String[] args) {
        TheGreateSage sage = new Monkey();

        TheGreateSage bird = new Bird(sage);
        bird.move();


        TheGreateSage fish = new Fish(new Bird(sage));
        fish.move();


    }
}
