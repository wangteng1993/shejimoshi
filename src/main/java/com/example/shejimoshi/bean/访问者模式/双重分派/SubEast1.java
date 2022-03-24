package com.example.shejimoshi.bean.访问者模式.双重分派;

public class SubEast1 extends East {
    @Override
    public void goEast(West west) {
        west.goWest1(this);
    }

    public String myName1() {
        return "SubEast1";
    }
}
