package com.example.shejimoshi.bean.享元模式.复合享元模式;


import java.util.HashMap;
import java.util.Map;

public class ConcreteCompositeFlyweight implements Flyweight {


    Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();

    void add(Character key, Flyweight flyweight) {
        files.put(key, flyweight);
    }


    @Override
    public void operation(String state) {
        Flyweight flyweight = null;
        for (Character character : files.keySet()) {
            flyweight = files.get(character);
            flyweight.operation(state);
            System.out.println(flyweight);
        }
//        System.out.println("intrinsicState=" + this.intrinsicState);
//        System.out.println("extrinsic=" + state);
    }
}
