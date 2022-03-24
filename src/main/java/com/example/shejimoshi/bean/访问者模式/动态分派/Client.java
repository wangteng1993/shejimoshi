package com.example.shejimoshi.bean.访问者模式.动态分派;

import com.example.shejimoshi.bean.访问者模式.静态分派.Horse;
import com.example.shejimoshi.bean.访问者模式.静态分派.WhiteHorse;

public class Client {
    public static void main(String[] args) {
        Horse horse= new WhiteHorse();
        horse.eat();
    }
}
