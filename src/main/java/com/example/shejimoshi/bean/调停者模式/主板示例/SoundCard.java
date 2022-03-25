package com.example.shejimoshi.bean.调停者模式.主板示例;


/**
 * 具体同事类
 */
public class SoundCard extends Colleague {


    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    void soundData(String data) {
        System.out.println("播放-----" + data);
    }


}
