package com.example.shejimoshi.bean.单例模式;

public class Singleton饿汉变种 {

    private Singleton饿汉变种() {
    }

    private static  Singleton饿汉变种 instance = null;

    static {
        instance = new Singleton饿汉变种();
    }

    public static Singleton饿汉变种 getInstance() {
        return instance;
    }

}
