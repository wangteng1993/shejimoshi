package com.example.shejimoshi.bean.桥梁模式.发送消息使用场景;

public class MessageEmail implements MessageImplementor{
    @Override
    public void send(String message, String toUser) {
        System.out.println("邮件消息"+message+toUser);
    }
}
