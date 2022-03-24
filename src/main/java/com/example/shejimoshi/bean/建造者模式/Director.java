package com.example.shejimoshi.bean.建造者模式;

/**
 * 导演者
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;

    }

    public void construct() {
        builder.buildPart1();
        builder.buildPart2();
    }
}
