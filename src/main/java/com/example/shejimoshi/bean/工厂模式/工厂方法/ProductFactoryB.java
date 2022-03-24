package com.example.shejimoshi.bean.工厂模式.工厂方法;

import com.example.shejimoshi.bean.工厂模式.简单工厂.IProduct;
import com.example.shejimoshi.bean.工厂模式.简单工厂.ProductB;

public class ProductFactoryB implements IFactory {

        @Override
        public IProduct createProduct() {
            IProduct product = new ProductB();
            return product;
        }
    }