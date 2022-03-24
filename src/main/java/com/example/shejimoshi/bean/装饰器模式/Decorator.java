package com.example.shejimoshi.bean.装饰器模式;

/**
 * 装饰角色
 */
public class Decorator implements Component {

    Component component;

    Decorator(Component component) {
        this.component = component;
    }


    @Override
    public void sampleOperation() {
        component.sampleOperation();;
    }
}
