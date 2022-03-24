package com.example.shejimoshi.bean.组合模式.安全组合模式;

/**
 * 树叶构件
 */
public class Leaf implements  Component{
    String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr+"-"+name);
    }
}
