package com.example.shejimoshi.bean.命令模式.宏命令;

import com.example.shejimoshi.bean.命令模式.示例.Command;

public interface MacorCommand extends Command {

    void  add(Command command);
    void remove(Command command);

}
