package com.example.shejimoshi.bean.装饰器模式;


/**
 * 具体装饰者
 */
public class ConcreteDecoratorB extends  Decorator{

    ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();;
    }


}
