package com.example.shejimoshi.bean.建造者模式.使用场景;

public class GoodbyeBuilder extends Builder {

    public GoodbyeBuilder() {
        message = new GoodbyeMessage();
    }

    @Override
    public void buildSubject() {
        message.setSubject("再见标题");
    }

    @Override
    public void buildBody() {
        message.setBody("再见内容");
    }
}
