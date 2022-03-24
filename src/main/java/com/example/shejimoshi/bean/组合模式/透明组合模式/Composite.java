package com.example.shejimoshi.bean.组合模式.透明组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件角色
 */
public class Composite extends Component {

    List<Component> childComponents = new ArrayList<>();

    String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    void addChild(Component child) {
        this.childComponents.add(child);
    }

    void removeChild(int index) {
        this.childComponents.remove(index);
    }

    @Override
    List<Component> getChild() {
        return this.childComponents;
    }


    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr+"+"+this.name);

        if (childComponents!=null){
            preStr+="   ";
            for (Component childComponent : childComponents) {
                childComponent.printStruct(preStr);
            }
        }


    }
}
