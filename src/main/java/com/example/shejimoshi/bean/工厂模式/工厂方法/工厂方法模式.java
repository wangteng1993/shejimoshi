package com.example.shejimoshi.bean.工厂模式.工厂方法;

import com.example.shejimoshi.bean.工厂模式.简单工厂.IProduct;

public class 工厂方法模式 {


    public static void main(String[] args) {
        IFactory productFactoryA = new ProductFactoryA();
        IProduct productA = productFactoryA.createProduct();
        productA.getProductName();

        IFactory productFactoryB = new ProductFactoryB();
        IProduct productB = productFactoryB.createProduct();
        productB.getProductName();
    }

}
