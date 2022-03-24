package com.example.shejimoshi.bean.观察者模式.java支持;

public class TestObserver {
    public static void main(String[] args) {
        Watched watched = new Watched();
        Watcher watcher = new Watcher(watched);
        watched.setData("start");
        watched.setData("end");
        watched.setData("stop");


    }
}
