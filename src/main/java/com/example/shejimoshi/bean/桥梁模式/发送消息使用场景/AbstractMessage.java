package com.example.shejimoshi.bean.桥梁模式.发送消息使用场景;

public abstract class AbstractMessage {
    MessageImplementor messageImplementor;

    public AbstractMessage(MessageImplementor messageImplementor) {
        this.messageImplementor = messageImplementor;
    }


    public void sendMessage(String message, String toUser) {
        this.messageImplementor.send(message, toUser);
    }

}
