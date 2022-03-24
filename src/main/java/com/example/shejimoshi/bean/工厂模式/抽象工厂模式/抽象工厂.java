package com.example.shejimoshi.bean.工厂模式.抽象工厂模式;


public class 抽象工厂 {


    public static void main(String[] args) {
        AbFactory abFactory = new AbFactory();


        IProductA productA = abFactory.createProductA();
        productA.getProductName();

        IProductB productB = abFactory.createProductB();
        productB.getProductName();

    }

}
