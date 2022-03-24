package com.example.shejimoshi.bean.单例模式;

public class Singleton最佳实现 {

    private Singleton最佳实现() {
    }

    private static volatile Singleton最佳实现 instance;

    public static Singleton最佳实现 getInstance() {
        if (instance == null) {
            synchronized (Singleton最佳实现.class) {
                if (instance == null) {
                    instance = new Singleton最佳实现();
                }
            }
        }
        return instance;
    }
}
