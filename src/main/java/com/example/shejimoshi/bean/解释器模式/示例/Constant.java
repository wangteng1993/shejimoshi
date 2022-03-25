package com.example.shejimoshi.bean.解释器模式.示例;

/**
 * 布尔常量
 */
public class Constant extends Expression {

    boolean value;

    public Constant(boolean value) {
        this.value = value;
    }

    @Override
    boolean interpret(Context ctx) {
        return value;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Constant) {
            return this.value == ((Constant) obj).value;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return Boolean.toString(value);
    }
}
