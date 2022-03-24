package com.example.shejimoshi.bean.工厂模式.抽象工厂模式;

public class AbFactory implements IAbstractFactory {

        @Override
        public IProductA createProductA() {
            return new ProductA();
        }

        @Override
        public IProductB createProductB() {
            return new ProductB();
        }
    }