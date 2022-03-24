package com.example.shejimoshi.bean.观察者模式.拉模型;

public class Client {
    public static void main(String[] args) {
        ConcreateSubject subject = new ConcreateSubject();
        ConcreateObserverGet observer = new ConcreateObserverGet();
        subject.attach(observer);
        subject.attach(observer);
        subject.attach(observer);
        subject.change("state3");

    }
}
