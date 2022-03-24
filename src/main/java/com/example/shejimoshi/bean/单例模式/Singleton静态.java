package com.example.shejimoshi.bean.单例模式;

public class Singleton静态 {

    private static class Singleton静态Handle {
        private static final Singleton静态 INSTANCE = new Singleton静态();
    }

    private Singleton静态() {
    }


    public static final Singleton静态 getInstance() {
        return Singleton静态Handle.INSTANCE;
    }

}
