package com.example.shejimoshi.bean.建造者模式.使用场景;

import lombok.Data;

import java.util.Date;

@Data
public abstract class AutoMessage {
    String to;
    String from;
    String subject;
    String body;
    Date sendDate;

   public void send() {
        System.out.println("地址" + to + "发件人地址" + from + "标题" + subject + "内容" + body + "日期" + sendDate);
    }

}
