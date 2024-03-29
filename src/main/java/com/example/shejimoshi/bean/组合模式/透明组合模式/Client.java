package com.example.shejimoshi.bean.组合模式.透明组合模式;


public class Client {
    public static void main(String[] args) throws Exception {
        Component root = new Composite("服装");
        Component c1 = new Composite("男装");
        Component c2 = new Composite("女装");


        Component l1 = new Leaf("衬衫");
        Component l2 = new Leaf("夹克");
        Component l3 = new Leaf("裙子");
        Component l4 = new Leaf("套装");

        root.addChild(c1);
        root.addChild(c2);
        c1.addChild(l1);
        c1.addChild(l2);
        c2.addChild(l3);

        c2.addChild(l4);
        root.printStruct("");
    }
}
