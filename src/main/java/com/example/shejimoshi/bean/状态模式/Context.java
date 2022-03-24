package com.example.shejimoshi.bean.状态模式;

/**
 * 环境角色类
 */
public class Context {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    void request(String simpleParameter) {
        state.handle(simpleParameter);
    }
}
