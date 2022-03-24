package com.example.shejimoshi.bean.建造者模式;

/**
 * 抽象建造者
 */
public interface Builder {
    void buildPart1();

    void buildPart2();

    Product retrieveResult();

}
