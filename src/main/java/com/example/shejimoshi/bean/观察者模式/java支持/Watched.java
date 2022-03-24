package com.example.shejimoshi.bean.观察者模式.java支持;

import java.util.Observable;

/**
 * 被观察者
 */
public class Watched extends Observable {
    String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (this.data != data) {
            this.data = data;
            setChanged();
            System.out.println("data changed  to " + data);
        }
        notifyObservers();
    }


}
