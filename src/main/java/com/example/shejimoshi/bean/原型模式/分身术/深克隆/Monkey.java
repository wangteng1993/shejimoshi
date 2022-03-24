package com.example.shejimoshi.bean.原型模式.分身术.深克隆;

import lombok.Data;

import java.io.*;
import java.util.Date;

@Data
public class Monkey implements Cloneable , Serializable {

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

    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return  objectInputStream.readObject();

    }

}
