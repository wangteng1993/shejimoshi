package com.example.shejimoshi.bean.建造者模式.使用场景;

public class WelcomeBuilder extends Builder {

    public WelcomeBuilder() {
        message = new WelcomeMessage();
    }

    @Override
    public void buildSubject() {
        message.setSubject("欢迎标题");
    }

    @Override
    public void buildBody() {
        message.setBody("欢迎内容");
    }
}
