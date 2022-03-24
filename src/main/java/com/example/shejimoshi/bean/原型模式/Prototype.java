package com.example.shejimoshi.bean.原型模式;

/**
 * 抽象原型
 */
public abstract class Prototype {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String id;

    public Prototype(String id) {
        this.id = id;
    }

    public abstract Prototype clone();





}
