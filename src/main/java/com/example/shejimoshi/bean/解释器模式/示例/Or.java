package com.example.shejimoshi.bean.解释器模式.示例;

public class Or extends Expression {

    Expression left;
    Expression right;

    public Or(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    boolean interpret(Context ctx) {
        return left.interpret(ctx) || right.interpret(ctx);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Or) {
            return left.equals(((Or) obj).left) && right.equals(((Or) obj).right);
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
