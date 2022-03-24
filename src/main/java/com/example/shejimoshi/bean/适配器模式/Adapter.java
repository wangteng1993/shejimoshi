package com.example.shejimoshi.bean.适配器模式;

/**
 * 适配器
 */
public class Adapter extends Adaptee implements Target {
    Adaptee adaptee;

    Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void sampleOperation2() {

    }

    @Override
    public void sampleOperation1() {
        this.adaptee.sampleOperation1();
    }
}
