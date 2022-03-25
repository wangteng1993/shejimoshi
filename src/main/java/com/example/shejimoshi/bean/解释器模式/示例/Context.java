package com.example.shejimoshi.bean.解释器模式.示例;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境
 */
public class Context {
    Map<Variable, Boolean> map = new HashMap<>();

    void assign(Variable var, boolean value) {
        map.put(var, new Boolean(value));
    }

    boolean lookup(Variable var) {
        Boolean value = map.get(var);
        if (value==null){
            throw new IllegalArgumentException();
        }
        return  value.booleanValue();

    }

}
