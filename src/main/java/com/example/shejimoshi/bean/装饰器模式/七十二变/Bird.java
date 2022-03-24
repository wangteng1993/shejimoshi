package com.example.shejimoshi.bean.装饰器模式.七十二变;

public class Bird extends Change{
    public Bird(TheGreateSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("鸟 move");
    }
}
