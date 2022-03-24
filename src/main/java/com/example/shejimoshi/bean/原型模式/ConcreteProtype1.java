package com.example.shejimoshi.bean.原型模式;

/**
 * 具体原型
 */
public class ConcreteProtype1 extends Prototype {

    public ConcreteProtype1(String id) {
        super(id);
    }


    @Override
    public Prototype clone() {
        Prototype protype = new ConcreteProtype1(this.getId());
        return protype;
    }
}
