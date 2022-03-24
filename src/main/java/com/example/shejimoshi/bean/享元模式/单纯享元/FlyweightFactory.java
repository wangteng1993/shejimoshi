package com.example.shejimoshi.bean.享元模式.单纯享元;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();



    Flyweight factory(Character state){
        Flyweight flyweight = files.get(state);
        if (flyweight==null){
            flyweight = new ConcreteFlyweight(state);
            files.put(state,flyweight);
        }
        return  flyweight;

    }



}
