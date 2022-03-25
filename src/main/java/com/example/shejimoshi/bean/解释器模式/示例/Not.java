package com.example.shejimoshi.bean.解释器模式.示例;

public class Not extends Expression {
    Expression exp;


    public Not(Expression exp) {
        this.exp = exp;
    }

    @Override
    boolean interpret(Context ctx) {
        return !exp.interpret(ctx);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Not) {
            return exp.equals(((Not) obj).exp);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return "not "+exp.toString();
    }
}
