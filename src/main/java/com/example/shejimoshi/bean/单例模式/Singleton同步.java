package com.example.shejimoshi.bean.单例模式;

public class Singleton同步 {
    private static Singleton同步 instance;

    private Singleton同步() {
    }

    public static synchronized Singleton同步 getInstance() {
        if (instance == null) {
            instance = new Singleton同步();
        }
        return instance;
    }
}
