package com.example.shejimoshi.bean.责任链模式;

/**
 * 抽象处理者
 */
public abstract class Handler {
    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    protected Handler successor;
    public abstract void handleRequest();

}
