package com.example.shejimoshi.bean.解释器模式.示例;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Variable x = new Variable("X");
        Variable y = new Variable("Y");
        Constant constant = new Constant(true);
        context.assign(x,false);
        context.assign(y,true);


        Expression expression = new Or(new And(constant, x), new And(y, new Not(x)));


        System.out.println("x "+x.interpret(context));
        System.out.println("y "+y.interpret(context));
        System.out.println(expression.toString()+"="+expression.interpret(context));

    }
}
