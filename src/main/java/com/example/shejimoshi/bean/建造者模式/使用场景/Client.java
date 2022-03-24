package com.example.shejimoshi.bean.建造者模式.使用场景;

public class Client {
    public static void main(String[] args) {
        Builder builder = new GoodbyeBuilder();
//        Builder builderBye = new WelcomeBuilder();
        Director director = new Director(builder);
        director.construct("111----","222====");
        builder.sendMessage();

        System.out.println("11");
    }
}
