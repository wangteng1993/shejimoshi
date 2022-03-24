package com.example.shejimoshi.bean.状态模式;

public class Client {
    public static void main(String[] args) {
        State state = new ConcreteStateA();
        State stateB = new ConcreteStateB();
        Context context = new Context();
        context.setState(state);
        context.setState(stateB);
        context.request("test");
    }
}
