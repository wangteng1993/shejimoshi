package com.example.shejimoshi.bean.访问者模式.双重分派;

public class SubEast2 extends East {
    @Override
    public void goEast(West west) {
        west.goWest2(this);
    }

    public String myName2() {
        return "SubEast2";
    }
}
