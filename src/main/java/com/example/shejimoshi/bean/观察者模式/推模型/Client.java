package com.example.shejimoshi.bean.观察者模式.推模型;

public class Client {
    public static void main(String[] args) {
        具体主题对象 subject = new 具体主题对象();
        具体观察者 observer = new 具体观察者();
        subject.attach(observer);
        subject.attach(observer);
        subject.attach(observer);
        subject.change("state3");

    }
}
