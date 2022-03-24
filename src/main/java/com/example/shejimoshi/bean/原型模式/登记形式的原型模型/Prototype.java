package com.example.shejimoshi.bean.原型模式.登记形式的原型模型;

/**
 * 抽象原型
 */
public interface Prototype {


    public Prototype clone();


    String getName();

    public void setName(String name);


}
