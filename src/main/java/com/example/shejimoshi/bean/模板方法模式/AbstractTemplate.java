package com.example.shejimoshi.bean.模板方法模式;

public abstract class AbstractTemplate {

    protected abstract void abstractTemplate();

    protected void hookMethod() {
    }

    protected final void concreteMethod() {
    }


    void templateMethod() {
        abstractTemplate();
        hookMethod();
        concreteMethod();
    }
}
