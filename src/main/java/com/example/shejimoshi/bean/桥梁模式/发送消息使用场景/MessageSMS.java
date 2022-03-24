package com.example.shejimoshi.bean.桥梁模式.发送消息使用场景;

public class MessageSMS implements MessageImplementor{
    @Override
    public void send(String message, String toUser) {
        System.out.println("系统内消息"+message+toUser);
    }
}
