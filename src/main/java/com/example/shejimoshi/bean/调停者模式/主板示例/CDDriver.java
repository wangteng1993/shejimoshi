package com.example.shejimoshi.bean.调停者模式.主板示例;


/**
 * 具体同事类
 */
public class CDDriver extends Colleague {
    String data = "";

    public String getData() {
        return data;
    }

    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    void readCD() {
        this.data="one piece -----西游记,声音";
        getMediator().changed(this);
    }


}
