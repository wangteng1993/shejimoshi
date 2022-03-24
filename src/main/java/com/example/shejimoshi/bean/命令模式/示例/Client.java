package com.example.shejimoshi.bean.命令模式.示例;

public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        Command play=new PlayCommand(audioPlayer);
        Command reWind=new RewindCommand(audioPlayer);
        Command stop=new StopCommand(audioPlayer);

        Keypad keypad = new Keypad();
        keypad.setPlayCommand(play);
        keypad.setRewindCommand(reWind);
        keypad.setStopCommand(stop);

        keypad.play();
        keypad.reWind();
        keypad.stop();
        keypad.play();
        keypad.stop();
    }



}
