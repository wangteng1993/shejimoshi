package com.example.shejimoshi.bean.命令模式.宏命令;

import com.example.shejimoshi.bean.命令模式.示例.*;

public class Jujia {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        Command play=new PlayCommand(audioPlayer);
        Command reWind=new RewindCommand(audioPlayer);
        Command stop=new StopCommand(audioPlayer);

        MacorCommand macroAudioCommand = new MacroAudioCommand();
        macroAudioCommand.add(play);
        macroAudioCommand.add(reWind);
        macroAudioCommand.add(stop);
        macroAudioCommand.add(play);
        macroAudioCommand.add(reWind);
        macroAudioCommand.add(play);
        macroAudioCommand.execute();
    }
}
