package com.example.shejimoshi.bean.享元模式.复合享元模式;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightFactory {
    Map<Character,Flyweight> files = new HashMap<Character,Flyweight>();



    Flyweight factory(List<Character> compositeSate){

        ConcreteCompositeFlyweight concreteCompositeFlyweight = new ConcreteCompositeFlyweight();

        for (Character state : compositeSate) {
            concreteCompositeFlyweight.add(state,this.factory(state));
        }
        return  concreteCompositeFlyweight;


    }



   Flyweight factory(Character state){
        Flyweight flyweight = files.get(state);
        if (flyweight==null){
            flyweight = new ConcreteFlyweight(state);
            files.put(state,flyweight);
        }
        return  flyweight;

    }



}
