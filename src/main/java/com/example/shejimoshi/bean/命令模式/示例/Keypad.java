package com.example.shejimoshi.bean.命令模式.示例;

public class Keypad {
    Command playCommand;
    Command rewindCommand;
    Command stopCommand;



    public void setPlayCommand(Command playCommand) {
        this.playCommand = playCommand;
    }

    public void setRewindCommand(Command rewindCommand) {
        this.rewindCommand = rewindCommand;
    }

    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }

    void play() {
        playCommand.execute();
    }

    void reWind() {
        rewindCommand.execute();
    }
    void stop() {
        stopCommand.execute();
    }
}
