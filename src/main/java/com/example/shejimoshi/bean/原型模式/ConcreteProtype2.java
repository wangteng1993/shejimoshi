package com.example.shejimoshi.bean.原型模式;

/**
 * 具体原型
 */
public class ConcreteProtype2 extends Prototype {

    public ConcreteProtype2(String id) {
        super(id);
    }


    @Override
    public Prototype clone() {
        Prototype protype = new ConcreteProtype2(this.getId());
        return protype;
    }
}
