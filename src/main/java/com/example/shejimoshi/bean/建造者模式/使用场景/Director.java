package com.example.shejimoshi.bean.建造者模式.使用场景;

public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String toAddress, String fromAddress) {
        this.builder.buildTo(toAddress);
        this.builder.buildFrom(fromAddress);
        this.builder.buildBody();
        this.builder.buildSubject();
        this.builder.buildSendDate();
    }
}
