package com.example.shejimoshi.bean.备忘录模式.多重检查点;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录角色
 */
@Data
public class Memento {
    List<String> states;
    int index;

    public Memento(List<String> states, int index) {
        this.states = new ArrayList<>(states);
        this.index = index;
    }

    public List<String> getStates() {
        return states;
    }

    public int getIndex() {
        return index;
    }
}
