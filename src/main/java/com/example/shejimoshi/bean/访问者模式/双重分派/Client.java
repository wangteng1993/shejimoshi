package com.example.shejimoshi.bean.访问者模式.双重分派;

public class Client {
    public static void main(String[] args) {
        East east = new SubEast1();
        West west = new SubWest1();
        east.goEast(west);

        east = new SubEast1();
        west = new SubWest2();



        east.goEast(west);
        east = new SubEast2();
        east.goEast(west);
    }
}
