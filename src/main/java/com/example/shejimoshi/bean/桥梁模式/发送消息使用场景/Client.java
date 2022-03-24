package com.example.shejimoshi.bean.桥梁模式.发送消息使用场景;

public class Client {
    public static void main(String[] args) {
        MessageImplementor implementor = new MessageSMS();

        AbstractMessage abstractMessage = new CommonMessage(implementor);

        abstractMessage.sendMessage("加班", "1111");


        implementor = new MessageEmail();
        abstractMessage = new UrgencyMessage(implementor);
        abstractMessage.sendMessage("加班", "1111");
    }
}
