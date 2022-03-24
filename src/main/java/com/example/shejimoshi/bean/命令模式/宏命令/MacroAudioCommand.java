package com.example.shejimoshi.bean.命令模式.宏命令;

import com.example.shejimoshi.bean.命令模式.示例.Command;

import java.util.ArrayList;
import java.util.List;

public class MacroAudioCommand implements MacorCommand {


    List<Command> commandList = new ArrayList<>();

    @Override
    public void add(Command command) {
        commandList.add(command);
    }

    @Override
    public void remove(Command command) {
        commandList.remove(command);
    }

    @Override
    public void execute() {
        System.out.println("自动回放保存的命令");
        for (Command command : commandList) {
            command.execute();
        }
        System.out.println("回放命令结束");
    }
}
