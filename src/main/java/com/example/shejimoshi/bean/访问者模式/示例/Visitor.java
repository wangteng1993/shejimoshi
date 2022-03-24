package com.example.shejimoshi.bean.访问者模式.示例;

/**
 * 抽象访问者角色
 */
public interface Visitor {
    public void visit(NodeA nodeA);
    public void visit(NodeB nodeB);
}
