package com.example.shejimoshi.bean.建造者模式;

/**
 * 具体构建者
 */
public class ConcreteBuilder implements Builder {
    Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("编号：999");
    }

    @Override
    public void buildPart2() {
        product.setPart2("名称：手");
    }

    @Override
    public Product retrieveResult() {
        return product;
    }
}
