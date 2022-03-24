package com.example.shejimoshi.bean.原型模式.登记形式的原型模型;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型管理器
 */
public class PrototypeManger {
    private static Map<String, Prototype> map = new HashMap<String, Prototype>();

    PrototypeManger() {
    }

    public synchronized static void setPrototype(String prototypeId, Prototype prototype) {
        map.put(prototypeId, prototype);

    }

    public synchronized static void removePrototype(String prototypeId) {
        map.remove(prototypeId);
    }

    public synchronized static Prototype getPrototype(String prototypeId) {

        Prototype prototype = map.get(prototypeId);
        return prototype;
    }

}
