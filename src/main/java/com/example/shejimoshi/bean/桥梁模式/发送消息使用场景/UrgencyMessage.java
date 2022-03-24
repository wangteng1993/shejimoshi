package com.example.shejimoshi.bean.桥梁模式.发送消息使用场景;

public class UrgencyMessage extends AbstractMessage{
    public UrgencyMessage(MessageImplementor messageImplementor) {
        super(messageImplementor);
    }


    @Override
    public void sendMessage(String message, String toUser){
        super.sendMessage(message+"加急",toUser);
    }


    public Object watch(String messageId){
        return null;
    }

}
