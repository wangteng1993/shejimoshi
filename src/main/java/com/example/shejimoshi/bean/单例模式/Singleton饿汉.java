package com.example.shejimoshi.bean.单例模式;

public class Singleton饿汉 {

    private Singleton饿汉() {
    }

    private static final Singleton饿汉 instance = new Singleton饿汉();

    public static Singleton饿汉 getInstance() {
        return instance;
    }

}
