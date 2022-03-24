package com.example.shejimoshi.bean.备忘录模式;

import lombok.Data;

/**
 * 备忘录角色
 */
@Data
public class Memento {
    String state;

    public Memento(String state) {
        this.state = state;
    }

}
