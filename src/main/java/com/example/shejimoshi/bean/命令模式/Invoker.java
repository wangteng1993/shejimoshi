package com.example.shejimoshi.bean.命令模式;

/**
 * 请求者角色类
 */
public class Invoker {


    private Command command = null;

    public Invoker(Command command) {
        this.command = command;
    }


    void action() {
        command.execute();
    }
}
