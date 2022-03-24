package com.example.shejimoshi.bean.原型模式.登记形式的原型模型;


/**
 * 具体原型
 *
 * @author Administrator
 */
public class ConcreteProtype2 implements Prototype {
    String name;

    @Override
    public Prototype clone() {
        ConcreteProtype2 concreteProtype1 = new ConcreteProtype2();
        concreteProtype1.setName(this.name);
        return concreteProtype1;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }
}
