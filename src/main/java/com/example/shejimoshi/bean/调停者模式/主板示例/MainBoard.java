package com.example.shejimoshi.bean.调停者模式.主板示例;

import lombok.Data;

@Data
public class MainBoard implements Mediator {
    @Override
    public void changed(Colleague c) {

        if (c instanceof CDDriver) {
            this.openCDDriverReadData((CDDriver)c);
        }else if (c instanceof  CPU){
            this.openCPU((CPU)c);
        }
    }


    CDDriver cdDriver = null;
    CPU cpu = null;
    VideCard videCard = null;
    SoundCard soundCard = null;

    void openCDDriverReadData(CDDriver cd) {
        String data = cd.getData();
        cpu.executeData(data);
    }
    void  openCPU(CPU cpu){
        String videData = cpu.getVideData();
        String soundData = cpu.getSoundData();
        videCard.showData(videData);
        soundCard.soundData(soundData);
    }

}
