package com.example.shejimoshi.bean.访问者模式.示例;

public class NodeB extends Node {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


    String operationB() {
        return "NodeB";
    }

}
