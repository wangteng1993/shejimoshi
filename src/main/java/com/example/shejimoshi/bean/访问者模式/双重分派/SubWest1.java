package com.example.shejimoshi.bean.访问者模式.双重分派;

public class SubWest1 extends West{


    @Override
    public void goWest1(SubEast1 east) {
        System.out.println("SubWest1---"+east.myName1());

    }

    @Override
    public void goWest2(SubEast2 east) {
        System.out.println("SubWest1---"+east.myName2());
    }
}
