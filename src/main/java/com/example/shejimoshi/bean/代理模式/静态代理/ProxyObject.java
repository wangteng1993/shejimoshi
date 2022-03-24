package com.example.shejimoshi.bean.代理模式.静态代理;

/**
 * 代理对象
 */
public class ProxyObject extends AbstractObject {
    RealObject realObject = new RealObject();

    @Override
    public void operation() {
        //before
        System.out.println("do some before");
        realObject.operation();
        //after
        System.out.println("do some after");

    }
}
