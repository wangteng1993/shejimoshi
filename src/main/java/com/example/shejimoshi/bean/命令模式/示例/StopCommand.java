package com.example.shejimoshi.bean.命令模式.示例;

public class StopCommand implements Command{

    AudioPlayer audio;

    public StopCommand(AudioPlayer audio) {
        this.audio = audio;
    }

    @Override
    public void execute() {
        audio.stop();
    }
}
