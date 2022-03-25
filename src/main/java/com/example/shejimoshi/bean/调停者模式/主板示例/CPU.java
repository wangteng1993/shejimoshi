package com.example.shejimoshi.bean.调停者模式.主板示例;



/**
 * 具体同事类
 */
public class CPU extends Colleague {
    String videData = "";
    String soundData = "";

    public String getVideData() {
        return videData;
    }

    public String getSoundData() {
        return soundData;
    }

    public CPU(Mediator mediator) {
        super(mediator);
    }

    void executeData(String data) {
        String[] split = data.split(",");
        this.videData = split[0];
        this.soundData = split[1];
        getMediator().changed(this);
    }


}
