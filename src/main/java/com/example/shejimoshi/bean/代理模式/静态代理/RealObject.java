package com.example.shejimoshi.bean.代理模式.静态代理;

/**
 * 目标对象
 */
public class RealObject extends  AbstractObject{
    @Override
    public void operation() {
        System.out.println(" do some");

    }
}
