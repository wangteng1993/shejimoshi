package com.example.shejimoshi.bean.门面模式;

public class Facade {
    public void test() {
        ModuleA moduleA = new ModuleA();
        moduleA.testA();

        ModuleB moduleB = new ModuleB();
        moduleB.testB();
        ModuleC moduleC = new ModuleC();
        moduleC.testC();


    }
}
