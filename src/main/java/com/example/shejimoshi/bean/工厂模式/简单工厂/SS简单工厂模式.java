package com.example.shejimoshi.bean.工厂模式.简单工厂;


public class SS简单工厂模式 {

    public static void main(String[] args) {
        ProductFactory productFactory=new ProductFactory();
        IProduct a = productFactory.createProduct("A");
        IProduct b = productFactory.createProduct("B");
        System.out.println("1");
    }


}

