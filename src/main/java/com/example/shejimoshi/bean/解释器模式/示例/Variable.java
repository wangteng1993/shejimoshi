package com.example.shejimoshi.bean.解释器模式.示例;

/**
 * 字符串 有名变量
 */
public class Variable extends Expression {

    String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    boolean interpret(Context ctx) {
        return ctx.lookup(this);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Variable) {
            return this.name.equals(((Variable) obj).name);
        }
        return false;

    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return this.name;
    }
}
