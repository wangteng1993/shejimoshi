package com.example.shejimoshi.bean.原型模式.分身术.浅克隆;

import lombok.Data;

import java.util.Date;

@Data
public class Monkey implements Cloneable {

    int height;
    int weight;
    Date birthDay;
    GoldRingedStaff staff;


    public Monkey() {
        this.birthDay = new Date();
        this.staff = new GoldRingedStaff();
    }

    @Override
    public Monkey clone() {
        Monkey temp = null;
        try {
            temp = (Monkey) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } finally {
            return temp;
        }
    }


}
