package com.example.shejimoshi.bean.门面模式;

public class ModuleFacade {
    ModuleA moduleA = new ModuleA();

    ModuleB moduleB = new ModuleB();
    ModuleC moduleC = new ModuleC();

    public void a1() {
        moduleA.a1();
    }

    public void b1() {
        moduleB.b1();
    }

    public void c1() {
        moduleC.c1();
    }

}
