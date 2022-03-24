package com.example.shejimoshi.bean.享元模式.复合享元模式;


public class ConcreteFlyweight implements Flyweight {
    private Character intrinsicState = null;

    public ConcreteFlyweight(Character intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String state) {

        System.out.println("intrinsicState=" + this.intrinsicState);
        System.out.println("extrinsic=" + state);
    }
}
