package com.example.shejimoshi.bean.工厂模式.工厂方法;

import com.example.shejimoshi.bean.工厂模式.简单工厂.IProduct;
import com.example.shejimoshi.bean.工厂模式.简单工厂.ProductA;

public class ProductFactoryA implements IFactory {

        @Override
        public IProduct createProduct() {
            IProduct product = new ProductA();
            return product;
        }
    }