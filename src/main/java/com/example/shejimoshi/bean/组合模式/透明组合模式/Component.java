package com.example.shejimoshi.bean.组合模式.透明组合模式;

import java.util.List;

public abstract class Component {
    abstract void printStruct(String preStr);


    void addChild(Component child) throws Exception {
       throw new Exception("不支持");
    }


    void removeChild(Component child) throws Exception {
        throw new Exception("不支持");
    }


    List<Component> getChild() throws Exception {
        throw new Exception("不支持");
    }
}
