package com.example.shejimoshi.bean.命令模式.示例;

public class RewindCommand implements Command{

    AudioPlayer audio;

    public RewindCommand(AudioPlayer audio) {
        this.audio = audio;
    }

    @Override
    public void execute() {
        audio.rewind();
    }
}
