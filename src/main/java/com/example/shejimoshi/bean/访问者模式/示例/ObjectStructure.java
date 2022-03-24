package com.example.shejimoshi.bean.访问者模式.示例;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    List<Node> nodes = new ArrayList<>();

    void action(Visitor visitor) {
        for (Node node : nodes) {
            node.accept(visitor);
        }
    }

    void add(Node node) {
        nodes.add(node);
    }


}
