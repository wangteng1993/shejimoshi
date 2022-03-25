package com.example.shejimoshi.bean.解释器模式.示例;

public class And extends Expression {

    Expression left;
    Expression right;

    public And(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    boolean interpret(Context ctx) {
        return left.interpret(ctx) && right.interpret(ctx);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof And) {
            return left.equals(((And) obj).left) && right.equals(((And) obj).right);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return left.toString() + " and "+right.toString();
    }
}
