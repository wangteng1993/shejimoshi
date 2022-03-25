package com.example.shejimoshi.bean.调停者模式.主板示例;

public class Client {
    public static void main(String[] args) {
        MainBoard mediator = new MainBoard();
        CDDriver cdDriver = new CDDriver(mediator);
        CPU cpu = new CPU(mediator);
        VideCard videCard = new VideCard(mediator);
        SoundCard soundCard = new SoundCard(mediator);
        mediator.setCdDriver(cdDriver);
        mediator.setCpu(cpu);
        mediator.setSoundCard(soundCard);
        mediator.setVideCard(videCard);
        cdDriver.readCD();
    }
}
