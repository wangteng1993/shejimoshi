package com.example.shejimoshi.bean.原型模式.分身术.深克隆;

import java.io.IOException;

public class TheGreatestSage {
    Monkey monkey = new Monkey();

    public void change() throws IOException, ClassNotFoundException {
        Monkey clone = (Monkey)monkey.deepClone();
        System.out.println(monkey.getBirthDay());
        System.out.println(clone.getBirthDay());
        System.out.println(monkey==clone);
        System.out.println(monkey.getStaff()==clone.getStaff());
        System.out.println("11111");

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TheGreatestSage theGreatestSage = new TheGreatestSage();
        theGreatestSage.change();;
    }
}
