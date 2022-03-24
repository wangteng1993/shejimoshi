package com.example.shejimoshi.bean.建造者模式.使用场景;

import java.util.Date;

public abstract class Builder {
    protected AutoMessage message;

    /**
     * 标题零件方法
     */
    public abstract void buildSubject();


    /**
     * 内容零件方法
     */
    public abstract void buildBody();


    /**
     * 构建收件人零件
     */
    public void buildTo(String to) {
        message.setTo(to);
    }

    /**
     * 构建发件人零件
     */
    public void buildFrom(String from) {
        message.setFrom(from);
    }

    /**
     * 构建时间零件
     */
    public void buildSendDate() {
        message.setSendDate(new Date());
    }

    public void sendMessage() {
        message.send();
    }

}
