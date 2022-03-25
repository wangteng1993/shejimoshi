package com.example.shejimoshi.bean.调停者模式.主板示例;



/**
 * 具体同事类
 */
public class VideCard extends Colleague {




    public VideCard(Mediator mediator) {
        super(mediator);
    }

    void showData(String data) {
        System.out.println("正在观看"+data);
    }


}
