package com.example.shejimoshi.bean.访问者模式.示例;

public class VisitorA implements Visitor{
    @Override
    public void visit(NodeA nodeA) {
        System.out.println("VisitorA+"+nodeA.operationA());
    }

    @Override
    public void visit(NodeB nodeB) {
        System.out.println("VisitorA+"+nodeB.operationB());
    }
}
