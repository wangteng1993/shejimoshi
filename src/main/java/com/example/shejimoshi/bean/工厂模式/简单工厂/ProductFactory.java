package com.example.shejimoshi.bean.工厂模式.简单工厂;

public class ProductFactory {
    public IProduct createProduct(String productType) {
        IProduct product = null;
        if (productType.equals("A")) {
            product = new ProductA();
        } else if (productType.equals("B")) {
            product = new ProductB();
        }
        return product;
    }
}
