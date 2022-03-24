package com.example.shejimoshi.bean.命令模式.示例;

public class PlayCommand implements Command{

    AudioPlayer audio;

    public PlayCommand(AudioPlayer audio) {
        this.audio = audio;
    }

    @Override
    public void execute() {
        audio.play();
    }
}
