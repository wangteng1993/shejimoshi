package com.example.shejimoshi.bean.解释器模式.示例;

/**
 * 抽象表达式
 */
public abstract class Expression {
    abstract  boolean interpret(Context ctx);
    @Override
    public abstract boolean equals(Object obj);
    @Override
    public abstract  int hashCode();
    @Override
    public abstract String toString();
}
