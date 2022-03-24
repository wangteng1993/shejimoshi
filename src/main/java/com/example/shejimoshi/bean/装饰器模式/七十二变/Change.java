package com.example.shejimoshi.bean.装饰器模式.七十二变;

public class Change implements TheGreateSage {
    TheGreateSage sage;

    public Change(TheGreateSage sage) {
        this.sage = sage;
    }

    @Override
    public void move() {
        this.sage.move();
    }
}
