package com.example.shejimoshi.bean.原型模式.分身术.浅克隆;

public class TheGreatestSage {
    Monkey monkey = new Monkey();

    public void change() {
        Monkey clone = monkey.clone();
        System.out.println(monkey.getBirthDay());
        System.out.println(clone.getBirthDay());
        System.out.println(monkey==clone);
        System.out.println(monkey.getStaff()==clone.getStaff());
        System.out.println("11111");

    }

    public static void main(String[] args) {
        TheGreatestSage theGreatestSage = new TheGreatestSage();
        theGreatestSage.change();;
    }
}
