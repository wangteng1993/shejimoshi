package com.example.shejimoshi.bean.访问者模式.静态分派;

public class Mozi {
    void ride(Horse horse) {
        System.out.println("骑马");
    }

    void ride(WhiteHorse whiteHorse) {
        System.out.println("骑白马");
    }

    void ride(BlackHorse blackHorse) {
        System.out.println("骑黑马");
    }

    public static void main(String[] args) {
        WhiteHorse whiteHorse = new WhiteHorse();
        BlackHorse blackHorse = new BlackHorse();
        Mozi mozi = new Mozi();
        mozi.ride(whiteHorse);
        mozi.ride(blackHorse);
    }


}
