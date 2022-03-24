package com.example.shejimoshi.bean.观察者模式.java支持;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {

    public Watcher(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("data has changed to "+ ((Watched)o).getData());
    }
}
