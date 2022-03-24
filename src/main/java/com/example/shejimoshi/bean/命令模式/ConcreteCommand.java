package com.example.shejimoshi.bean.命令模式;

/**
 * 具体命令角色类
 */
public class ConcreteCommand implements  Command{




    private Receiver receiver=null;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }


    @Override
    public void execute() {
        receiver.action();
    }
}
