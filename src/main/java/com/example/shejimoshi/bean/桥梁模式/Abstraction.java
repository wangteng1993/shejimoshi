package com.example.shejimoshi.bean.桥梁模式;

public abstract class Abstraction {

    protected Implementor implementor;


    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operationImpl();
    }

}
