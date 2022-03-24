package com.example.shejimoshi.bean.访问者模式.示例;

public class VisitorB implements Visitor{
    @Override
    public void visit(NodeA nodeA) {
        System.out.println("VisitorB+"+nodeA.operationA());
    }

    @Override
    public void visit(NodeB nodeB) {
        System.out.println("VisitorB+"+nodeB.operationB());
    }
}
